
import java.util.Arrays;
import java.util.Comparator;

public class SearchFunction{
	public static void main(String args[]) {
		Product Store [] = {new Product(12,"Phone","Electronics"),
				            new Product(11,"Watch","Electronics"),
				            new Product(9,"Shirt","Clothing"),
				            new Product(13,"Shoes","Footwear")};
		int targetId = 9;
		
		Product found = Search.linearSearch(Store, targetId);
		if(found != null) {
			System.out.printf("Found Product  "+found.getProductName()+",product Id : "+found.getProductId());
		}
		System.out.println();
		Arrays.sort(Store,Comparator.comparingInt(Product::getProductId));
		Product foundb = Search.binarySearch(Store,11);
		if(foundb != null) {
			System.out.printf("Found Product  "+foundb.getProductName()+",product Id : "+foundb.getProductId());
		}
	}
}
