class MySolution {
    public int singleNumber(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
          if(!hs.contains(nums[i])){
            hs.add(nums[i]);
          }else{
            hs.remove(nums[i]);
          }
        }
        int res=hs.iterator().next();
        return res;
    }
}