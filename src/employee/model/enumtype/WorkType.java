package employee.model.enumtype;

public enum WorkType {
	WORK("����"),
	RESIGNATION("���");

	// Enum �������� �Һ��̱� ������ final Ű����
	private final String statusOfEmployment;

	WorkType(String statusOfEmployment) {
		this.statusOfEmployment = statusOfEmployment;
	}
	
	public String getWork() {
		return statusOfEmployment;
	}
	
}
