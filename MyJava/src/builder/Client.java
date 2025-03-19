package builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director dObj1=new Director(new EngineeringStudentBuilder());
		Director dObj2=new Director(new MBAStudentBuilder());
		
		Student engStudent=dObj1.createStudent();
		Student mbaStudent=dObj2.createStudent();
		System.out.println(engStudent.toString());
		System.out.println(mbaStudent.toString());
	}

}
