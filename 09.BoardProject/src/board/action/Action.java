package board.action;
import javax.servlet.http.*;//Action은 controller에서 호출.
public interface Action {
	void execute(HttpServletRequest request, HttpServletResponse response);
		
	
}
