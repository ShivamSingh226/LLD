package flyWeight.wordProcessor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILetter object1 = LetterFactory.createLetter('t');
        object1.display(0,0);

        ILetter object2 = LetterFactory.createLetter('t');
        object2.display(0,6);

	}

}
