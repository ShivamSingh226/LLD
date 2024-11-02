package observer.observable;

import observer.observerDp.NotificationAlertObserver;

public interface stockObservable {
	public void add(NotificationAlertObserver observer);
	public void remove(NotificationAlertObserver observer);
	public void notifySubscribers();
	public void setStockCount(int newStocks);
	public int getStockCount();
}
