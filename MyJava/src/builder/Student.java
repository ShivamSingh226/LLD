package builder;

import java.util.List;

public class Student {
	int rollNumber;
	int age;
	String name;
	String fatherName;
	String mothersName;
	List<String> subjects;
	
	public Student(StudentBuilder studentBuilder) {
		this.rollNumber=studentBuilder.rollNumber;
		this.age=studentBuilder.age;
		this.name=studentBuilder.name;
		this.fatherName=studentBuilder.fatherName;
		this.mothersName=studentBuilder.motherName;
		this.subjects=studentBuilder.subjects;
	}
	public String toString() {
		return ""+ " roll number: " +this.rollNumber +
				" age: " +this.age+
				" name: "+this.name+
				" fatherName: "+this.fatherName+
				" mothersName: "+this.mothersName+
				" subjects: "+this.subjects;
	}
}
