class Solution {
    public char repeatedCharacter(String s) {
        HashMap <Character, Integer>count = new HashMap<Character, Integer>();
        int n = s.length();
        
        for (int i=0; i<n; i++){
            char c = s.charAt(i);
            if(count.containsKey(c)){
                return c;
            }
            else {
                count.put(c, count.getOrDefault(c,0) + 1);
            }
        }
        return 'a';
    }
}