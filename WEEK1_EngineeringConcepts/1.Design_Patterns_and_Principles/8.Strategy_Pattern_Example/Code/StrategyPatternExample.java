public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Paying using Credit Card
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "Dastagiri");
        context.setPaymentStrategy(creditCard);
        context.payAmount(2500);

        System.out.println();

        // Paying using PayPal
        PaymentStrategy payPal = new PayPalPayment("dastagiri@gmail.com");
        context.setPaymentStrategy(payPal);
        context.payAmount(1800);
    }
}


