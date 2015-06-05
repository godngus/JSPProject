package board.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.dto.Board;

public class BoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String num=request.getParameter("num");
			
			BoardDAO dao=new BoardDAO();
			
			//글 상세보기
			Board board = dao.selectOneBoardByNum(Integer.parseInt(num));
			
			//조회수 증가
			try {
				dao.updateHits(Integer.parseInt(num));
			} catch (NumberFormatException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("board", board);
			
			String url="./board/view.jsp";
			
			
			RequestDispatcher dispatcher=request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
	}

}
