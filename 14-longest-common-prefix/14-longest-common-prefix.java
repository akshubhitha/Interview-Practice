class Solution {
     public String longestCommonPrefix(String[] strs) {
         StringBuilder lcp = new StringBuilder();
         if(strs[0] == null || strs.length == 0){
             return lcp.toString();
         }
         
         // find the shortest string //
         int smallestStringlength = strs[0].length();
         for(int i =0; i<strs.length; i++){
             smallestStringlength = Math.min(smallestStringlength, strs[i].length());
         }
         
         
         for(int i=0; i<smallestStringlength; i++){
             char currChar = strs[0].charAt(i);
             for (String str: strs){
                 if (str.charAt(i) != currChar){
                     return lcp.toString();
                 }
             }
             lcp.append(currChar);
         }
         return lcp.toString();
 }
}