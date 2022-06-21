package employee.model;


public enum Grade {
	A("사원"),
	B("주임"),
	C("대리"),
	D("과장"),
	E("차장"),
	F("부장"),
	G("이사"),
	H("사장");
	
	private String grade;
	
	Grade(String grade) {}
	
	public String getGrade() {
		return grade;
	}
	

	
}
