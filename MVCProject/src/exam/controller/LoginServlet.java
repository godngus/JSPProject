package exam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam.dao.MemberDAO;
import exam.dto.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		String password=request.getParameter("pwd");
		//1.객체생성 JDBC Driver 로드
		//2.DB연결
		MemberDAO dao=new MemberDAO();
		
		//3.SQL문실행
		//1.dto사용
		//Member member=new Member();
		//member.setId(id);
		//member.setPassword(password);
		//2.dto미사용
		int r=dao.LoginMember(id,password);
		if(r==0){//실패
			response.sendRedirect("loginForm.jsp");
		}
		else
			response.sendRedirect("list.jsp");
	}

}
