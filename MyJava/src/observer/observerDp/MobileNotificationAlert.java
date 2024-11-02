package observer.observerDp;

import observer.observable.stockObservable;

public class MobileNotificationAlert implements NotificationAlertObserver {
	String username;
	stockObservable stockobs;
	public MobileNotificationAlert(String username,stockObservable stockobs){
		this.username=username;
		this.stockobs=stockobs;
	}
	@Override
	public void update() {
		sendMsg(username,"Product is back in stock. Please buy!");
	}
	public void sendMsg(String username, String Msg) {
		System.out.println("message sent to "+ username);
	}
}
