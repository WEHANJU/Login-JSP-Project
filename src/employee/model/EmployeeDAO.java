package employee.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBUtil;

public class EmployeeDAO {
	// 사원등록
	public static boolean insertEmployee(EmployeeBean vo) throws SQLException{
		Connection conn = null;	
		PreparedStatement pstmt = null;
		boolean result = false;
		String sql = "INSERT INTO employee(employee_id, employee_name, employee_passwd, employee_addr, employee_email, employee_phone, employee_hiredate) VALUES(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);

	        pstmt.setInt(1, vo.getEmployeeId());
	        pstmt.setString(2, vo.getEmployeeName());
	        pstmt.setString(3, vo.getEmployeePasswd());
	        pstmt.setString(4, vo.getEmployeeAddr());
	        pstmt.setString(5, vo.getEmployeeEmail());
	        pstmt.setString(6, vo.getEmployeePhone());
	        pstmt.setDate(7, vo.getEmployeeHiredate());
	        
			int count = pstmt.executeUpdate();			
			if(count != 0){
				result = true;
			}
		} finally{
			DBUtil.close(pstmt, conn);
		}
		return result;		
	}
	
	// 사원조회 - employee_id 기준
	public static EmployeeBean getEmployee(int employeeId) throws SQLException {		
		Connection conn = null;	
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		EmployeeBean vo  = null;
		String sql="SELECT * from employee WHERE employee_id=?";

		try {
			conn = DBUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeId);	
			rset = pstmt.executeQuery();
			
			if(rset.next()){
				vo = new EmployeeBean(employeeId, rset.getString(1),
						rset.getString(2),rset.getString(3),rset.getString(4),
						rset.getString(5),rset.getDate(6),rset.getString(7), 
						rset.getInt(8), rset.getString(9), rset.getString(10), rset.getInt(11));
			}
		} finally{
			DBUtil.close(pstmt, conn);
		}
		return vo;
	} 
	
	// 모든사원조회
	public static ArrayList<EmployeeBean> getAllEmployee() throws SQLException {
		Connection conn = null;	
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<EmployeeBean> alist = null;
		String sql="SELECT * FROM employee";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			alist = new ArrayList<EmployeeBean>();
			while(rset.next()){
				alist.add(new EmployeeBean(rset.getInt(1), rset.getString(2),
						rset.getString(3),rset.getString(4),rset.getString(5),
						rset.getString(6),rset.getDate(7),rset.getString(8), 
						rset.getInt(9), rset.getString(10), rset.getString(11), rset.getInt(12)));
			}
		} finally{
			DBUtil.close(rset, pstmt, conn);
		}
		return alist;
	}
}
