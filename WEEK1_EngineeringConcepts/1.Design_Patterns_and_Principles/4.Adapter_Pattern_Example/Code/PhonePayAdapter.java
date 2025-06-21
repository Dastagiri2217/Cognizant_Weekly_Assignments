class PhonePayAdapter implements PaymentProcessor{
	 private Phonepay phonepayway;
	    public PhonePayAdapter(Phonepay phonepayway) {
	        this.phonepayway =  phonepayway;
	    }
	    //here we use only processPayment which is works for all payments unaware of type
	    public void processPayment(double amount) {
	        phonepayway.makePayment(amount);
	    }
}