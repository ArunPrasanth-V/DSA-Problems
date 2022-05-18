// 14. Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        char arr[]=strs[0].toCharArray();
        if(arr.length==0)
            return "";
        int starter=0;
        int maxlen=arr.length;
        for(int i=0;i<strs.length;i++){
           
            for(int j=0;j<strs[i].length();j++){
                if(j<arr.length && arr[j]==strs[i].charAt(j))
                {
                    starter++;
                }
                else
                    break;
            }
          if(maxlen>starter)
                maxlen=starter;
            starter=0;
        }
        if(maxlen==0)
            return "";
        StringBuilder br=new StringBuilder();
        for(int i=0;i<maxlen;i++){
            br.append(arr[i]);
        }
        return br.toString();
    }
}
