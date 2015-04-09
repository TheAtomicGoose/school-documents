public class BinarySearch {

    /**
     * Checks if an array is in ascending order.
     * @param a an array which is checked to see if it is in ascending order
     * @return true if <code>a</code> is in ascending order, false if not
     */
    public static boolean isSorted(int[] a) {

        boolean sorted;
        sorted = true;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                sorted = false;
            }
        }

        return sorted;
    }

    /**
     * Performs a binary search to check if <code>b</code> is in <code>a</code>.
     * @param a an array of integers which is being searched through
     * @param b an integer which is being looked for in <code>a</code>
     * @return if <code>b</code> is found in <code>a</code>, return its
     *      index. Otherwise, return -1.
     */
     public static int binarySearch(int[] a, int b) {

         int low, high, mid;
         low = 0;
         high = a.length - 1;
         mid = (low + high) / 2;
         while (high >= low) {
             System.out.print(low + " ");
             System.out.print(high + " ");
             System.out.println(mid);
             if (b > mid) {
                 low = mid;
                 mid = (low + high) / 2;
             } else if (b < mid) {
                 high = mid;
                 mid = (low + high) / 2;
             } else {
                 return mid;
             }
         }

         return -1;
     }

     public static void main(String[] args) {

         int[] arr = {1, 2, 4, 3, 5, 6, 7, 8, 9, 10};
         System.out.println(isSorted(arr));
         System.out.println(binarySearch(arr, 3));
     }
}