public class SingletonPattern {
	public static void main(String args[]) {
	Logger obj1 = Logger.getInstance();//creating object for first time
	Logger obj2 = Logger.getInstance();// though we created object using global instance no new object created 
	// the op we get is Intance Created only once
	if(obj1 == obj2){
	    System.out.println("Instance has global access");
	}
	}
}
