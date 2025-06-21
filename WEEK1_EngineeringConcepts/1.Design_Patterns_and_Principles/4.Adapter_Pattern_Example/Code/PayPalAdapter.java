class PayPalAdapter implements PaymentProcessor {
    private PayPal payPalway;

    public PayPalAdapter(PayPal payPalway) {
        this.payPalway = payPalway;
    }

    public void processPayment(double amount) {
        payPalway.sendMoney(amount);
    }
}