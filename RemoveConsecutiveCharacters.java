//https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1#
//Remove Consecutive Characters
class Solution{
    public String removeConsecutiveCharacter(String s){
        StringBuilder br=new StringBuilder();
        char pointer=s.charAt(0);
        for(char c:s.toCharArray()){
            if(br.length()==0)
            br.append(c);
            else if(c !=pointer)
            {
                br.append(c);
                pointer=c;
            }
        }
        return br.toString();
    }
}
