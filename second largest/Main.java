import java.util.Arrays;

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int last = arr[n - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < last) {
                return arr[i];
            }
        }
        return -1;
    }
}
