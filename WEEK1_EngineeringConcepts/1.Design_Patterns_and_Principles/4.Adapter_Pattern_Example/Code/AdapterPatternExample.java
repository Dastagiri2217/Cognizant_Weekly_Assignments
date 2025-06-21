public class AdapterPatternExample{
	 public static void main(String[] args) {
	        PaymentProcessor phonep = new PhonePayAdapter(new Phonepay());
	        phonep.processPayment(500);
	        System.out.println();
	        PaymentProcessor paypal = new PayPalAdapter(new PayPal());
	        paypal.processPayment(1000);
	    }
}

