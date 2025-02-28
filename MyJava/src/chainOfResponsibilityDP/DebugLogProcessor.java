package chainOfResponsibilityDP;

public class DebugLogProcessor extends LogProcessor {
	DebugLogProcessor(LogProcessor nextLevelLogProcessor){
		super(nextLevelLogProcessor);
	}
	
	public void log(int logLevel, String message) {
		if(logLevel == DEBUG) {
			System.out.println("DEBUG: "+ message);
		}else {
			super.log(logLevel, message);
		}
	}
}
