public class bubbleSort {
    public static void sort(Order[] orders) {
        int n = orders.length;
        //Repeatedly compares adjacent elements and swaps them if they are in the wrong order 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (orders[j].getTotalPrice() > orders[j+1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                }
            }
        }
        //T.C: O(n²) and S.C: O(1)
    }
}
