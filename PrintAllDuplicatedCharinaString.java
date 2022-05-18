import java.util.*;
public class PrintAllDuplicatedCharinaString {

	public static void main(String[] args) {
        String str = "test string";
        Map<Character,Integer> map=new HashMap<>();
          for(char c:str.toCharArray()) {
        		  map.put(c,map.getOrDefault(c,0)+1);
          }
          for(char c:map.keySet()){
        	  int n=map.get(c);
        	  if(n>1)
        		  System.out.println(c+" -> "+n);
          }
	}

}
