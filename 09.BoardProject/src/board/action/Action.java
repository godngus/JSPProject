package board.action;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;//Action은 controller에서 호출.
public interface Action {
	void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
		
	
}
