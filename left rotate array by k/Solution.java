class Solution {
    public void rotate(int[] nums, int k) {
        // double reversal technique that I am gonna use here????
        k = k % nums.length;
        if (k == 0)
            return; // No rotation needed
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        // for left shift we do first both two then whole
        // for right shift we dont first whole then both

    }

    public static void reverse(int[] arr, int left, int right) {

        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}2