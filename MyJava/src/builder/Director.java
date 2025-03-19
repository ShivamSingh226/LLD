package builder;

public class Director {
	StudentBuilder studentBuilder;
	Director(StudentBuilder studentBuilder){
		this.studentBuilder=studentBuilder;
	}
	public Student createStudent() {
		if(studentBuilder instanceof EngineeringStudentBuilder) {
			return createEngineeringStudent();
		}
		else if(studentBuilder instanceof MBAStudentBuilder) {
			return createMBAStudent();
		}
		return null;
	}
	private Student createEngineeringStudent() {
		return studentBuilder.setRollNumber(23).setAge(12).setName("SS").setSubjects().build();
	}
	private Student createMBAStudent() {
		return studentBuilder.setRollNumber(11).setAge(11).setName("HBK").setSubjects().build();
	}
	
}
