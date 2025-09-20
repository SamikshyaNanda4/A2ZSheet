class XORSolution {
        public int missingNumber(int[] nums) {
          int xor1=nums.length;
          int xor2=0;
          for(int i=0;i<nums.length;i++){
            xor2^=nums[i];
            xor1^=i;
          }
          return xor1^xor2;
    }
}