package observer.observerDp;

import observer.observable.stockObservable;

public class EmailNotificationAlert implements NotificationAlertObserver {
	String EmailID;
	stockObservable stockObs;
	public EmailNotificationAlert(String EmailID,stockObservable stockObs){
		this.EmailID=EmailID;
		this.stockObs=stockObs;
	}
	@Override
	public void update() {
		sendEmail(EmailID,"Product is back in the market. Please buy.");
	}
	public void sendEmail(String emailID,String message) {
		System.out.println("mail send to"+ emailID);
	}
	
}
