class MySolution {
    public int missingNumber(int[] nums) {
      int answer=nums.length;
      boolean notFound=true;
      for(int i=0;i<nums.length;i++){
        boolean found=false;
        int target=i;
        for(int j=0;j<nums.length;j++){
          if(nums[j]==i){
            found=true;
            break;
          }
        }
        if (found==false){
          answer=i;
          break;
        }
      }
      return answer;
    }
}