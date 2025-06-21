import java.util.HashMap;
import java.util.Map;
public class Inventory{
	private Map<String,Product> store = new HashMap<String,Product>();
	public void addProduct(Product p) {
		if(store.containsKey(p.getProductId())) { //O(1) as this is an HashMap it requres Constant time to search 
			System.out.println("Store already contains that product");
		}
		else {
			System.out.println("Product Added "+p.getProductName());
			store.put(p.getProductId(), p);// to add product into store it takes O(1)
		}
		// so Total T.C of this function is O(1)
	}
	public void removeProduct(Product p) {
		if(!store.containsKey(p.getProductId())) {//O(1) 
			System.out.println("Error Check ProductId");
		}
		else {
			store.remove(p.getProductId());//O(1)
			System.out.println("Product Removed from Store : "+p.getProductName());
		}
		//O(1)
	}
	public void updateProduct(String productId,String productName,int quantity,double price) {
		Product p = store.get(productId);//same O(1) for search
		if(p!=null) {
		p.setPrice(price);
		p.setProductName(productName);
		p.setQuantity(quantity);//take O(1) for setting
		System.out.println("Prodcut Updated with Latest Details ");
		}
		else {
			System.out.println("Product Doesnt Exist in Store");
		}
	}
	public void displayProducts() {
		for(Product p : store.values()) {
			System.out.println(p);
		}
	}
}
