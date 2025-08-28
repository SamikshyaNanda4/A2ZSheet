class Solution {
    public boolean isSorted(int[] arr) {
        // code here

        if (arr.length <= 1) {
            return true;
        }

        return recursiveSortCheck(arr, 0);
    }

    public static boolean recursiveSortCheck(int arr[], int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return recursiveSortCheck(arr, index + 1);

    }
}