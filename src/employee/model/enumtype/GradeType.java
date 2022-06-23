package employee.model.enumtype;

public enum GradeType {
	EMPLOYEE("사원"),
	CHIEF("주임"),
	MANAGER("대리"),
	SECTION_CHIEF("과장"),
	DEPUTY_HEAD("차장"),
	HEAD_OF_DEPARTMENT("부장"),
	DIRECTOR("이사"),
	CEO("사장");
	
	// Enum 변수들은 불변이기 때문에 final 키워드
	private final String grade;
	
	GradeType(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
}
