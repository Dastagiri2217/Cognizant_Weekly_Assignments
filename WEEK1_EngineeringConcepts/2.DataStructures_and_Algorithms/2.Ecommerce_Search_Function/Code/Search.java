public class Search {
	public static Product linearSearch(Product s[],int targetId) {
		for(Product p : s) {
			if(p.getProductId()== targetId) {
				return p;
			}
		}
		return null;
	}
	public static Product binarySearch(Product s[],int targetId) {
		int low = 0,high = s.length - 1;
		while(low<=high) {
			int mid = (low+high)/2;
			int id = s[mid].getProductId();
			if(id == targetId) {
				return s[mid];
			}
			else if(id < targetId) {
				low = mid + 1;
			}
			else {
				high = mid -1;
			}
		}
		return null;
	}
}