class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] empty = {};
        for(int i = 0 ; i < nums.length ; i++){
            if(mp.containsKey(target - nums[i])){
                int[] out ={mp.get(target - nums[i]) - 1,i};
                return out;
            }
            mp.put(nums[i],i+1);
        }
        
        return empty;
    }
}
