package employee.model;

import java.sql.Date;

public class EmployeeBean {
	
	private int employeeId;				// �����ȣ
	private String employeeName; 		// ����̸�
	private String employeePasswd;  	// ��й�ȣ
	private String employeeAddr;		// ����ּ�
	private String employeeEmail;		// �������
	private String employeePhone;		// �������ó
	private Date employeeHiredate;		// ����Ի���
	private String employeeWorkYN;		// �����������
	private int employeeAdminIdentify;	// �����ڽĺ�����
	private String employeeGrade;		// �������
	private String employeeImg;			// ����̹���
	private int departmentId;			// �μ���ȣ
	
	public EmployeeBean() {}
	public EmployeeBean(int employeeId, String employeeName, String employeePasswd, String employeeAddr,
			String employeeEmail, String employeePhone, Date employeeHiredate, String employeeWorkYN,
			int employeeAdminIdentify, String employeeGrade, String employeeImg, int departmentId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePasswd = employeePasswd;
		this.employeeAddr = employeeAddr;
		this.employeeEmail = employeeEmail;
		this.employeePhone = employeePhone;
		this.employeeHiredate = employeeHiredate;
		this.employeeWorkYN = employeeWorkYN;
		this.employeeAdminIdentify = employeeAdminIdentify;
		this.employeeGrade = employeeGrade;
		this.employeeImg = employeeImg;
		this.departmentId = departmentId;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeePasswd() {
		return employeePasswd;
	}
	public void setEmployeePasswd(String employeePasswd) {
		this.employeePasswd = employeePasswd;
	}
	public String getEmployeeAddr() {
		return employeeAddr;
	}
	public void setEmployeeAddr(String employeeAddr) {
		this.employeeAddr = employeeAddr;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	public Date getEmployeeHiredate() {
		return employeeHiredate;
	}
	public void setEmployeeHiredate(Date employeeHiredate) {
		this.employeeHiredate = employeeHiredate;
	}
	public String getEmployeeWorkYN() {
		return employeeWorkYN;
	}
	public void setEmployeeWorkYN(String employeeWorkYN) {
		this.employeeWorkYN = employeeWorkYN;
	}
	public int getEmployeeAdminIdentify() {
		return employeeAdminIdentify;
	}
	public void setEmployeeAdminIdentify(int employeeAdminIdentify) {
		this.employeeAdminIdentify = employeeAdminIdentify;
	}
	public String getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public String getEmployeeImg() {
		return employeeImg;
	}
	public void setEmployeeImg(String employeeImg) {
		this.employeeImg = employeeImg;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}	
	
}
