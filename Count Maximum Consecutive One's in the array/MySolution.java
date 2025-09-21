class MySolution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int maxNumber=0;
      int countOfOnes=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
          countOfOnes++;
          maxNumber=maxOfTwo(maxNumber,countOfOnes);
        }else{
          countOfOnes=0;
        }
      }
      return maxNumber;
    }

    static int maxOfTwo(int a, int b){
     return a>b?a:b;
    }
}