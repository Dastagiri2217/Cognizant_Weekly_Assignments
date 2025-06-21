public class PayPalPayment implements PaymentStrategy{
	private String email;
	public PayPalPayment(String email) {
		this.email = email;
	}
    
    @Override
	public void Pay(int amount) {
		System.out.println("Paid Amount : " + amount + " using PayPal by mail id : " + email);
	}
}
