class Solution {
    public int[] twoSum(int[] nums, int target) {
        int compliment = 0;
        Map <Integer, Integer> output = new HashMap<>();
        for(int i=0; i<nums.length; i++){
              compliment = target - nums[i];
            if(output.containsKey(compliment)){
                return new int[] {output.get(compliment), i};
        }
        
        output.put(nums[i], i);
    
    }
        return null;
        
    }
   
}