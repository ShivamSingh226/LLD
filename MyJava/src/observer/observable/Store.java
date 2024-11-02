package observer.observable;
import observer.observerDp.EmailNotificationAlert;
import observer.observerDp.MobileNotificationAlert;
import observer.observerDp.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stockObservable IphoneStocks=new IphoneStock();
		NotificationAlertObserver observer1=new EmailNotificationAlert("abbc@gmail.com",IphoneStocks);
		NotificationAlertObserver obsever2=new MobileNotificationAlert("abbcvgs",IphoneStocks);
		
		IphoneStocks.add(observer1);
		IphoneStocks.add(obsever2);
		IphoneStocks.setStockCount(10);
	}

}
