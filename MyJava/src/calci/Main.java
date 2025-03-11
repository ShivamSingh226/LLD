package calci;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticExpression one=new Number(1);
		ArithmeticExpression two=new Number(2);
		ArithmeticExpression seven=new Number(7);
		
		ArithmeticExpression addExpression=new Expression(one,seven,Operation.ADD);
		ArithmeticExpression multiply=new Expression(two,addExpression,Operation.MULTIPLY);
		System.out.println("The final evaluation is=" + multiply.evaluate());
	}

}
