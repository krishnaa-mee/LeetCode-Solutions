class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length-k;
        return quickselect(nums,0,nums.length-1,target);

    }
    public int quickselect(int[]nums,int low ,int high,int target){
        int pivot = nums[high];
        int i = low;

        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]= temp;
                i++;
            }
        }

            int temp = nums[i];
            nums[i] = nums[high];
            nums[high] = temp; 
        if(i==target){
            return nums[i];
        }
        else if(i<target){
            return quickselect(nums,i+1,high,target);
        }
        else{
            return quickselect(nums,low,i-1,target);
        }
                        
    }
}