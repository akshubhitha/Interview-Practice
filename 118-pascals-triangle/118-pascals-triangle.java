class Solution {
    public List<List<Integer>> generate(int numRows) {
       
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        
        for(int i=0; i< numRows; i++){
            curr.add(0,1);
            for (int j = 1; j<curr.size() -1; j++){
                curr.set(j, curr.get(j)+curr.get(j+1));
            }
            output.add(new ArrayList<>(curr));
        }
        return output;
    } 
}