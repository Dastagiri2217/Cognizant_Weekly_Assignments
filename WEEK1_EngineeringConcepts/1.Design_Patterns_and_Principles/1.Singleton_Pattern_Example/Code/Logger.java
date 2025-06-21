public class Logger {
    private static Logger log;
	private Logger() {
		System.out.println("Instance Created ");
	}
	//there are may types of singleton pattern ways i choose lazy Initilization
	public static Logger getInstance() {
		if(log == null) {
			log = new Logger();
		}
		return log;
	}
}
