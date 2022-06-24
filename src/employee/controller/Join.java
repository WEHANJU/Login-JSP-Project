package employee.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/join")
public class Join extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Join() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Add member");
	}

	public void destroy() {
		System.out.println("Finish adding member");
	}

//	protected void addMember(EmployeeBean employeeBean) throws ServletException, IOException {
//		return employeeBean;
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empId = Integer.parseInt(request.getParameter("employeeId"));
		String empPw = request.getParameter("employeePasswd");
		String empNm = request.getParameter("employeeName");
		String empAddr = request.getParameter("employeeAddr");
		String empEmail = request.getParameter("employeeAddr");
		String empPhone = request.getParameter("employeePhone");
		Date empHireDate = java.sql.Date.valueOf(request.getParameter("employeeHireDate"));
		
		EmployeeBean emplyeeBean= new EmployeeBean(empId,empPw, empNm, empAddr, empEmail, empPhone, empHireDate);
		result = EmployeeDAO.insertEmployee(employeeBean);
		System.out.println(result);
		request.getRequestDispatcher("views/login.jsp").forward(request, response);
		
	}

}
