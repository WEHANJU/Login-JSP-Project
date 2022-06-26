package employee.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import employee.model.EmployeeBean;
import employee.model.EmployeeDAO;

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
      response.setContentType("text/html;charset=UTF-8");
      
      request.setCharacterEncoding("utf-8");
		
		
		String command=request.getParameter("command");
		
//		System.out.println("out : " + command);
				
		if(command.equals("login")){
//			System.out.println("in : " + command);
			login(request, response);
		}else if(command.equals("logout")){
			System.out.println("logout : " + command);
			logout(request, response);
		}
		
		
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int id = Integer.parseInt(request.getParameter("employeeId"));
		      String pw = request.getParameter("employeePasswd");
		      HttpSession session=request.getSession();
		      EmployeeBean employee=null;
		     
	    	
	    		  try {
					employee = EmployeeDAO.getEmployee(id);
					if(employee!=null) {
						if(employee.getEmployeePasswd().equals(pw)) {
							session.setAttribute("emp", id);
							request.getRequestDispatcher("views/main.jsp").forward(request, response);
						} else {
							System.out.println("2222");
							response.sendRedirect("views/login.jsp");
							return;		    			  
						}
		    		  }
		    		  else {
			    	       //java.lang.IllegalStateException: 응답이 이미 커밋된 후에는, sendRedirect()를 호출할 수 없습니다.
		    		  }
				} catch (SQLException e) {
					e.printStackTrace();
				}
	    		 
//				
	    		  
	    		 
	
	    	 
	    	 
	 }
		
	

	private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("logout in");
//		HttpSession session=request.getSession();
//		 System.out.println(session.getId());
//		 System.out.println(session);
//		if(session.getAttribute("emp")!=null) {
//			session.setAttribute("emp", null);
//			 session.invalidate();
//			 session.setMaxInactiveInterval(0);
//			 System.out.println(session.getAttribute("emp"));
//			
//		}
		
	}
	
	


// DAO에서 받아온 id와 파라미터로 넘어온 id가 같고 DAO에서 받아온 pw와 파라미터로 넘어온 pw와 같으면 session 생성
//      for(int i=0;i<employees.size();i++) {
//    	  if(id==employees.get(i).getEmployeeId()&&employees.get(i).getEmployeePasswd().equals(pw)) {
//    	         session.setAttribute("emp", id);
//    	         request.getRequestDispatcher("views/main.jsp").forward(request, response);
//    	      }
//    	      else if((id==123&&!"".equals(pw)||(id!=123&&"".equals(pw)||(id!=123&&!"".equals(pw))))) {
//    	         response.sendRedirect("views/login.jsp");
//    	      }
//    	      else {
//    	         response.sendRedirect("views/login.jsp");
//    	      }
//      }

}


