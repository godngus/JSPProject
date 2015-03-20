package exam.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")//url mapping
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int UTF = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");//클라이언트로 내려보낼 때 한글지원
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("name");
		String i=request.getParameter("id");
		
		out.print("Hello Get<br>");
		out.print("이름:"+name+"<br>");
		out.print(i+"<br>");
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//한글처리
		response.setContentType("text/html; charset=UTF-8");//클라이언트로 내려보낼 때 한글지원
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("name");
		String i=request.getParameter("id");
		
		out.print("이름:"+name+"<br>");
		out.print(i+"<br>");
		out.print("Hello Post<br>");
	}

}
