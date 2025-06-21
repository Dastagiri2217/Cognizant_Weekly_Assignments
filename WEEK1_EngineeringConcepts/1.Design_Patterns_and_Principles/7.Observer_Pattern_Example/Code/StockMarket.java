import java.util.*;
class StockMarket implements Stock{
	private List<Observer> observers = new ArrayList<>();
	private String stockName;
	private double stockPrice;
	public void setStock(String stockName,double stockPrice) {
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		notifyMembers();
	}
        @Override
	public void register(Observer e) {
		observers.add(e);
	}
    @Override
	public void deregister(Observer e) {
		observers.remove(e);
	}
    @Override
	public void notifyMembers() {
		for(Observer e : observers) {
			e.update(stockName, stockPrice);
		}
		
	}
}