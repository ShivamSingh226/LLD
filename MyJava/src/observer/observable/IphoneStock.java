package observer.observable;

import java.util.ArrayList;
import java.util.List;

import observer.observerDp.NotificationAlertObserver;

public class IphoneStock implements stockObservable {
	public List<NotificationAlertObserver> observerList=new ArrayList<>();
	public int stockCount=0;
	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);
	}
	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.remove(observer);
	}
	@Override
	public void notifySubscribers() {
		for(NotificationAlertObserver observer:observerList) {
			observer.update();
		}
	}
	public void setStockCount(int newStocks) {
		if(stockCount==0) {
			notifySubscribers();
		}
		stockCount=stockCount+newStocks;
	}
	public int getStockCount() {
		return stockCount;
	}
}
