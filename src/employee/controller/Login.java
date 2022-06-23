package employee.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("employeeId");
		String pw = request.getParameter("employeePasswd");
		Cookie cookie=null;
		//로그인 성공하면 Cookie 생성되도록
		//아이디가 비어있다면 => 사번을 입력하세요! alert창 띄우기
		//비밀번호가 비어있다면 => 비밀번호를 입력하세요! alert창 띄우기
		if(id==null) {
			
		}
		if(id==EmployeeDAO.getId) {
			cookie.add
		}
	}

}


