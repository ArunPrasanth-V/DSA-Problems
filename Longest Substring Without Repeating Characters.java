// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// 3. Longest Substring Without Repeating Characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=0;
        Set<Character> set=new HashSet<>();
        while(j<s.length()){
            if(!set.contains(s.charAt(j)))
                set.add(s.charAt(j++));
            else
                set.remove(s.charAt(i++));
            max=Math.max(max,set.size());
        }
     return max;
    }
}
