
public class InventoryManagement{
	
	public static void main(String args[]) {
		Inventory inv = new Inventory();
		Product p1 = new Product("A1","Phone",10,20000.00);
		inv.addProduct(p1);
		inv.displayProducts();
		Product p2 = new Product("A2","Laptop",5,60000.00);
		inv.addProduct(p2);
		inv.updateProduct("A1","Phone With Charger",1,22000.00);
		inv.displayProducts();
		inv.removeProduct(p1);
		inv.displayProducts();
		
	}
}

