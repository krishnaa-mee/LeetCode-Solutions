class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
         if (n <= 2) {
            return n;
        }

        int k = 2;

        for (int j = 2; j < n; j++) {

            if (nums[j] != nums[k - 2]) {

                nums[k] = nums[j];
                k++;
            }
        }

        return k;
    }
}