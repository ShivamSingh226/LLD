package inventoryMS;

public class Invoice {
	int totalItemPrice;
    int totalTax;
    int totalFinalPrice;
    public void generateInvoice(Order order) {
    	this.totalItemPrice=200;
    	this.totalTax=20;
    	this.totalFinalPrice=220;
    }
}
