public class Search {
    public static Book linearSearch(Book[] books, String targetTitle) {
        targetTitle = targetTitle.toLowerCase();
        for (Book b : books) {
            if (b.getTitle().equals(targetTitle)) {
                return b;
            }
        }
        return null;
    }
        public static Book binarySearch(Book[] books, String targetTitle) {
        targetTitle = targetTitle.toLowerCase();
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].getTitle().compareTo(targetTitle);
            if (cmp == 0)
                return books[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }
}

