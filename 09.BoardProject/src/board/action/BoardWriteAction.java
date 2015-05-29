package board.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.dto.Board;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("BoardWriteAction");//이것들은 db에 넣어야함.
		String subject=request.getParameter("subject");
		String name=request.getParameter("name");
		String textArea=request.getParameter("textArea");
		//String file=request.getParameter("file");
		
		Board board=new Board();
		
		board.setName(name);
		board.setTitle(subject);
		board.setContent(textArea);
		
		BoardDAO dao=new BoardDAO();
		
		int result= dao.insertBoard(board);
			String url="list.woohyun";
			try {
				response.sendRedirect(url);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
