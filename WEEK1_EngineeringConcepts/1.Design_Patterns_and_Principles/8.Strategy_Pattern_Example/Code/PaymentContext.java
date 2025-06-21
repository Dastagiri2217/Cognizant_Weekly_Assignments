public class PaymentContext {
	private PaymentStrategy strategy;
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	public void payAmount(int amount) {
		strategy.Pay(amount);
	}
}
