class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer>map = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                return nums[i];
            }
        }
        return -1;
    }
}