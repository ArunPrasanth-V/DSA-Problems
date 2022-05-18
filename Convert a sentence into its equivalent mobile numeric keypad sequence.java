class Solutions{
public static void main(String[] args)
	{
		String str[] = {"2","22","222",
						"3","33","333",
						"4","44","444",
						"5","55","555",
						"6","66","666",
						"7","77","777","7777",
						"8","88","888",
						"9","99","999","9999"
					};

		String input = "GEEKSFORGEEKS";
      StringBuilder br=new StringBuilder();
       for(char c:input.toCharArray()){
         if(c==' ')
           br.append(' ');
         else
           br.append(str[c-'A']);
       }
		System.out.println(br.toString());
}
}
