class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;

      int expsum= n*(n+1)/2;

      int actualsum = 0;

      for(int j = 0;j<n;j++){
        actualsum += nums[j];
      }

      return expsum-actualsum;

    }
}