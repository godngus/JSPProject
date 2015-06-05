package board.action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FileRenamePolicy;

import board.dao.BoardDAO;
import board.dto.Board;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		ServletContext context=request.getServletContext();
		String uploadPath=context.getRealPath("upload");
		System.out.println(uploadPath);
		MultipartRequest multi=new MultipartRequest(request,uploadPath,10*1024*1024,"UTF-8",new DefaultFileRenamePolicy());
		
		//System.out.println("BoardWriteAction");//이것들은 db에 넣어야함.
		String subject=multi.getParameter("subject");
		String name=multi.getParameter("name");
		String textArea=multi.getParameter("textArea");
		String file=multi.getFilesystemName("file");
		
		System.out.println(file);
		
		Board board=new Board();
		
		board.setName(name);
		board.setTitle(subject);
		board.setContent(textArea);
		board.setAttachment(file);
		
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
