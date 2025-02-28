package chainOfResponsibilityDP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogProcessor logObj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		logObj.log(LogProcessor.ERROR, "Exception happens");
		logObj.log(LogProcessor.DEBUG, "Need to debug this");
		logObj.log(LogProcessor.INFO, "Need more info regarding this");
		
	}

}
