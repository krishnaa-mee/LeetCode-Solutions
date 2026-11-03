class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);

                if(map.get(nums[i])==2){
                    ans.add(nums[i]);
                }
            }
            else{
                map.put(nums[i],1);
            }
        }
        return ans;
        
    }
}