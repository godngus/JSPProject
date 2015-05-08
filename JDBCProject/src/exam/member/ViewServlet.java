package exam.member;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();	
		out.print("<h1>회원 상세 페이지</h1><hr>");
		
		String id=request.getParameter("id");
		//out.print(id);
		
		//1.JDBC 드라이버 로드
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Connection con=null;
				//2.데이터베이스 연결
				try {
					con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jspuserd","jsp1234");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		String sql="select*from member where id=?";
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			out.print("<table border=1>");
			while(rs.next()){
				out.print("<tr>");
				out.print("<td>아이디</td><td>"+rs.getString("id")+"</td>");
				out.print("</tr>");
				
				out.print("<tr>");
				out.print("<td>비밀번호</td><td>"+rs.getString("password")+"</td>");
				out.print("</tr>");
				
				out.print("<tr>");
				out.print("<td>이름</td><td>"+rs.getString("name")+"</td>");
				out.print("</tr>");
				
				out.print("<tr>");
				out.print("<td>나이</td><td>"+rs.getInt("age")+"</td>");
				out.print("</tr>");
				
				out.print("<tr>");
				out.print("<td>주소</td><td>"+rs.getString("addr")+"</td>");
				out.print("</tr>");
				
				out.print("<tr>");
				out.print("<td>성별</td><td>"+rs.getString("gender")+"</td>");
				out.print("</tr>");
				out.print("<a href='delete.jsp?id="+rs.getString("id")+"'>삭제</a>");
			}
			out.print("</table>");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//4.데이터 출력
		response.setContentType("text/html;charset=UTF-8");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
