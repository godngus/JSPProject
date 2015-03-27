package exam.test;

import java.io.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		String gender=request.getParameter("gender");
		String id=   request.getParameter("id");
		String color= request.getParameter("mycolor");
		String email= request.getParameter("email");
		String subject=request.getParameter("subject");
		String[] sports = request.getParameterValues("sports");
		
		PrintWriter out = response.getWriter();
		out.print(gender);
		out.print(id);
		out.print(email);
		out.print("<font color='"+ color +"'>"+color+"</font>");
		out.print(sports);
		out.print(subject);
		
		if(sports==null)
			out.print("선택하기");
		else
			for(int i=0;i<sports.length;i++)
			out.print(sports[i]);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
