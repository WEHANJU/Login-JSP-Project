package employee.model;

import java.sql.Date;

import employee.model.enumtype.GradeType;
import employee.model.enumtype.WorkType;

public class EmployeeBean {
   
   private int employeeId;            // 사원번호
   private String employeeName;       // 사원이름
   private String employeePasswd;     // 비밀번호
   private String employeeAddr;      // 사원주소
   private String employeeEmail;      // 사원메일
   private String employeePhone;      // 사원연락처
   private Date employeeHiredate;      // 사원입사일
   private WorkType employeeWorkYN;   // 사원재직유무
   private int employeeAdminIdentify;   // 관리자식별유무
   private GradeType employeeGrade;   // 사원직급
   private String employeeImg;         // 사원이미지
   private int departmentId;         // 부서번호
   
   public EmployeeBean() {}
   public EmployeeBean(int employeeId, String employeeName, String employeePasswd, String employeeAddr,
         String employeeEmail, String employeePhone, Date employeeHiredate, WorkType employeeWorkYN,
         int employeeAdminIdentify, GradeType employeeGrade, String employeeImg, int departmentId) {
      super();
      this.employeeId = employeeId;
      this.employeeName = employeeName;
      this.employeePasswd = employeePasswd;
      this.employeeAddr = employeeAddr;
      this.employeeEmail = employeeEmail;
      this.employeePhone = employeePhone;
      this.employeeHiredate = employeeHiredate;
      this.employeeWorkYN = WorkType.WORK;
      this.employeeAdminIdentify = employeeAdminIdentify;
      this.employeeGrade = GradeType.EMPLOYEE;
      this.employeeImg = employeeImg;
      this.departmentId = departmentId;
   }
//   empId,empPw, empNm, empAddr, empEmail, empPhone, empHireDate
   public EmployeeBean(int employeeId, String employeePasswd, String employeeName, String employeeAddr,
         String employeeEmail, String employeePhone, Date employeeHiredate) {
      super();
      this.employeeId = employeeId;
      this.employeePasswd = employeePasswd;
      this.employeeName = employeeName;
      this.employeeAddr = employeeAddr;
      this.employeeEmail = employeeEmail;
      this.employeePhone = employeePhone;
      this.employeeHiredate = employeeHiredate;
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
   public WorkType getEmployeeWorkYN() {
      return employeeWorkYN;
   }
   public void setEmployeeWorkYN(WorkType employeeWorkYN) {
      this.employeeWorkYN = employeeWorkYN;
   }
   public int getEmployeeAdminIdentify() {
      return employeeAdminIdentify;
   }
   public void setEmployeeAdminIdentify(int employeeAdminIdentify) {
      this.employeeAdminIdentify = employeeAdminIdentify;
   }
   public GradeType getEmployeeGrade() {
      return employeeGrade;
   }
   public void setEmployeeGrade(GradeType employeeGrade) {
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