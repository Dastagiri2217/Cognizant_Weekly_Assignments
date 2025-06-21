public class WebApp implements Observer{
	private String webAppName;

	public WebApp(String webAppName) {
		this.webAppName = webAppName;
	}

        @Override
	public void update(String stockName, double stockPrice) {
		System.out.println(webAppName+" : "+stockName+" new price is: "+stockPrice);
	}
	

}