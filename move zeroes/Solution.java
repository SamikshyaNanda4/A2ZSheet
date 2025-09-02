class Solution {
    public void moveZeroes(int[] nums) {
        //     int zeroesFound=0;
        //     for(int i=0;i<nums.length;i++){
        //         int foundCount=0;
        //         if(nums[i]==0){
        //             zeroesFound++;
        //             for(int j=i;j<nums.length-zeroesFound;j++){
        //                 if(nums[j]==nums[j+1]){
        //                     foundCount++;
        //                 }
        //                 swap(nums,j,j+1);
        //             }
        //             if(foundCount==nums.length-1){
        //                 return;
        //             }
        //         }
        //     }
        // }
        // public static void swap(int[] arr, int a, int b){
        //     int temp=arr[a];
        //      arr[a]=arr[b];
        //      arr[b]=temp;
        // } 
        //snowball style
        int snowball = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowball++;
            } else if (snowball > 0) {
                nums[i - snowball] = nums[i];
                nums[i] = 0;
            }
        }
    }
}