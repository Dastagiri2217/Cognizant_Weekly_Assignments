public class SortingMain {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("A1", "Daya", 1500.50),
            new Order("B2", "Subbu", 950.00),
            new Order("C3", "Charan", 1200.75),
            new Order("D4", "Arjun", 3000.00)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Bubble Sort
        Order[] bubbleSorted = orders.clone();
        bubbleSort.sort(bubbleSorted);
        System.out.println("\nBubble Sorted Orders by totalPrice:");
        printOrders(bubbleSorted);

        // Quick Sort 
        Order[] quickSorted = orders.clone();
        quickSort.sort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nQuick Sorted Orders by totalPrice:");
        printOrders(quickSorted);
    }

    private static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
