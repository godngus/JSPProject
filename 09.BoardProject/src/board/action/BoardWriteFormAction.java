package board.action;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardWriteFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("BoardWriteFormAction");
		
		String url="./board/write.jsp";//jsp로 페이지 이동
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(url);//이동하려는 url쓰기
		
		dispatcher.forward(request, response);//이동.
	}

}
