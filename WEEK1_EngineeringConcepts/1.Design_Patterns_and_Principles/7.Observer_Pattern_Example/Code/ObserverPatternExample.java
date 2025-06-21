

public class ObserverPatternExample{
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        StockMarket market2 = new StockMarket();
        Observer mobile = new MobileApp("Navi");//like subscribers 
        Observer web = new WebApp("Amazon");

        market.register(mobile);
        market.register(web);

        market.setStock("Gold", 3650.75);
        System.out.println();
        market.setStock("Silver", 1520.00);
        System.out.println("Deregistering WebApp...\n");
        market.deregister(web);

        market.setStock("Petrol", 2900.10);
        System.out.println();
        //market 2
        // Observer electrics = new MobileApp("Sekho");
        // market2.register(electrics);
        // market2.setStock("Fan",3000.00);
        // System.out.println();
    }
}



