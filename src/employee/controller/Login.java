package employee.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    public Login() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Login start!");
	}

	public void destroy() {
		System.out.println("Login end");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		int id = Integer.parseInt(request.getParameter("employeeId"));
		String pw = request.getParameter("employeePasswd");
		HttpSession session=request.getSession();
		
		//DAO에서 받아온 id와 파라미터로 넘어온 id가 같고 DAO에서 받아온 pw와 파라미터로 넘어온 pw와 같으면 session 생성
		if(id==124&&"1234".equals(pw)) {
			session.setAttribute("emp", id);
			request.getRequestDispatcher("views/main.jsp").forward(request, response);
		}
		else if((id==123&&!"".equals(pw)||(id!=123&&"".equals(pw)||(id!=123&&!"".equals(pw))))) {
			response.sendRedirect("views/login.jsp");
		}
		else {
			response.sendRedirect("views/login.jsp");
		}
	}
	
	

	

}


