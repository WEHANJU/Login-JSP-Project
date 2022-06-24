package employee.model.enumtype;

public enum GradeType {
	EMPLOYEE("���"),
	CHIEF("����"),
	MANAGER("�븮"),
	SECTION_CHIEF("����"),
	DEPUTY_HEAD("����"),
	HEAD_OF_DEPARTMENT("����"),
	DIRECTOR("�̻�"),
	CEO("����");
	
	// Enum �������� �Һ��̱� ������ final Ű����
	private final String grade;
	
	GradeType(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
}
