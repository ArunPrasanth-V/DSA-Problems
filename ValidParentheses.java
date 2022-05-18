// Valid Parentheses
//https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'||s.charAt(i)=='[')
               stack.push(s.charAt(i));
            else if(!stack.empty() &&stack.peek()=='(' && s.charAt(i)==')')
                stack.pop();
            else if(!stack.empty() &&stack.peek()=='{' && s.charAt(i)=='}')
                stack.pop();
            else if(!stack.empty() &&stack.peek()=='[' && s.charAt(i)==']')
                stack.pop();
            else 
                return false;
        }
        return stack.empty();
    }
}
