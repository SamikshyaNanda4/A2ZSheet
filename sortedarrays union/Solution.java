mport java.util.Arrays;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int[] temp = new int[nums1.length + nums2.length]; // Maximum possible size
        int k = 0;
        
        while (i < nums1.length && j < nums2.length) {
        
            while (i > 0 && i < nums1.length && nums1[i] == nums1[i - 1]) {
                i++;
            }

            while (j > 0 && j < nums2.length && nums2[j] == nums2[j - 1]) {
                j++;
            }
            
            if (i >= nums1.length || j >= nums2.length) {
                break;
            }
            
            if (nums1[i] == nums2[j]) {
                temp[k] = nums1[i];
                i++;
                j++;
                k++;
            } else if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
                k++;
            } else {
                temp[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < nums1.length) {

            if (i > 0 && nums1[i] == nums1[i - 1]) {
                i++;
                continue;
            }
            temp[k] = nums1[i];
            k++;
            i++;
        }

        while (j < nums2.length) {

            if (j > 0 && nums2[j] == nums2[j - 1]) {
                j++;
                continue;
            }
            temp[k] = nums2[j];
            k++;
            j++;
        }
        
        // Return only the filled portion of the array
        return Arrays.copyOf(temp, k);
    }
}