// 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
     
        StringBuilder br=new StringBuilder();
        s=s.toLowerCase();
        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
                br.append(c+"");
        }
        int a=0,b=br.length()-1;
        s=br.toString();
        while(a<=b)
        {
            if(s.charAt(a)!=s.charAt(b))
                return false;
            a++;
            b--;
        }
        return true;
    }
}
