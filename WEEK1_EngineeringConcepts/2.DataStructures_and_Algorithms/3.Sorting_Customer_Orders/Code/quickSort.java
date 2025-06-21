public class quickSort {
    public static void sort(Order[] orders, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(orders, low, high);
            sort(orders, low, partitionIndex - 1);//recursive for each half T.C : O(n/2)
            sort(orders, partitionIndex + 1, high);//T.C : O(n/2)

            // Total T.c is T.C : O(n^2)  and S.C is O(logn ) for using stack space by recursive calls

        }
    }

    private static int partition(Order[] orders, int low, int high) {
        Order pivot = orders[high]; // last element as pivot
        int i = low - 1; // pointer for smaller element

        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot.getTotalPrice()) {
                i++;
                // swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        // swap orders[i+1] and pivot (orders[high])
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1; // returning pivot index 
    }
}
