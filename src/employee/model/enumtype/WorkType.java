package employee.model.enumtype;

public enum WorkType {
	WORK("재직"),
	RESIGNATION("퇴사");

	// Enum 변수들은 불변이기 때문에 final 키워드
	private final String statusOfEmployment;

	WorkType(String statusOfEmployment) {
		this.statusOfEmployment = statusOfEmployment;
	}
	
	public String getWork() {
		return statusOfEmployment;
	}
	
}
