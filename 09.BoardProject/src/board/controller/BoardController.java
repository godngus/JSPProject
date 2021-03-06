package board.controller;//Action호출 및 jsp 어떤 것을 보여줄 건지 선택.

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.action.Action;
import board.action.BoardListAction;
import board.action.BoardViewAction;
import board.action.BoardWriteAction;
import board.action.BoardWriteFormAction;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("*.woohyun")//확장자 만들기
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("기뮤진바보");
		//System.out.println("김유진씨 검문있겠습니다");
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		doProcess(request,response);
		
	}
	//기능별 분기
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String contextPath =request.getContextPath();
		String uri=request.getRequestURI();
		
		String command = uri.substring(contextPath.length());
		
			System.out.println(contextPath);//project 이름이 찍힘
			System.out.println("uri:"+uri);
			System.out.println("command:"+command);
			
			Action action=null;
			
			//리스트
			if(command.equals("/list.woohyun")){
				action=new BoardListAction();
				action.execute(request, response);
			}
			//글쓰기 폼
			else if(command.equals("/writeForm.woohyun")){
			 action=new BoardWriteFormAction();//BoardWriteFormAction의 부모가 Action이므로 생략가능.
				action.execute(request, response);//원래 하던일을 다 넘김
			}
			//글쓰기
			else if(command.equals("/write.woohyun")){
				 action=new BoardWriteAction();//BoardWriteFormAction의 부모가 Action이므로 생략가능.
					action.execute(request, response);//원래 하던일을 다 넘김
			}
			//글쓰기 폼
			else if(command.equals("/write.woohyun")){
			 action=new BoardWriteAction();//BoardWriteFormAction의 부모가 Action이므로 생략가능.
				action.execute(request, response);//원래 하던일을 다 넘김
			}
			//상세보기
			else if(command.equals("/view.woohyun")){
				 action=new BoardViewAction();//BoardWriteFormAction의 부모가 Action이므로 생략가능.
					action.execute(request, response);//원래 하던일을 다 넘김
			}
	}

}
