package inventoryMS;


import java.util.Map;

public class Order {
	User user;
	Address deliveryAddress;
	Map<Integer,Integer> productCategoryAndCount;
	Warehouse warehouse;
	Invoice invoice;
	Payment payment;
	OrderStatus orderStatus;
	Order(User user, Warehouse warehouse){
		this.user=user;
		this.warehouse=warehouse;
		this.deliveryAddress=user.address;
		this.productCategoryAndCount=user.getUserCart().getCartItems();
		invoice=new Invoice();
		invoice.generateInvoice(this);
	}
	public void checkout() {
		warehouse.removeItemFromInventory(productCategoryAndCount);
		boolean isPaymentSuccess=makePayment(new UPIPaymentMode());
		if(isPaymentSuccess) {
			user.getUserCart().emptyCart();
			System.out.println("Your order is successfull");
		}else {
			warehouse.addItemToInventory(productCategoryAndCount);
		}
	}
	public boolean makePayment(PaymentMode paymentMode) {
		payment=new Payment(paymentMode);
		return payment.makePayment();
	}
	public void generateOrderInvoice() {
		invoice.generateInvoice(this);
	}
}
