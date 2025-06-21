public class CreditCardPayment implements PaymentStrategy {
	private String cardNum;
	private String cardHolder;
	
	public CreditCardPayment(String cardNum, String cardHolder) {
		this.cardNum = cardNum;
		this.cardHolder = cardHolder;
	}
	public void Pay(int amount) {
		System.out.println("Paid Amount: "+amount+" Using Credit Card Number is "+cardNum+" Card Holder is: "+cardHolder);
		
	}

}