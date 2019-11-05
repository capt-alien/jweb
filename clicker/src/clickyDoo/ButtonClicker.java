package clickyDoo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ButtonClicker")
public class ButtonClicker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ButtonClicker() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String count = (String) session.getAttribute("count");
		Integer number;
		
		if(count ==null) {
			session.setAttribute("count", "0");
		} else {
			number = Integer.parseInt(count);
			number ++; 
			count = number.toString();
			session.setAttribute("count", count);
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Clicker.jsp");
	view.forward(request, response);
		
//		END DOGET
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
