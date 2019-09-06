package string;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring 
{
    public static String getLongestUniqueSubstring(String input)
    {
    	 HashSet<Character> set = new HashSet<Character>();

         String longestOverAll = "";
         String longestTillNow = "";

         for (int i = 0; i < input.length(); i++) {
             char c = input.charAt(i);

             if (set.contains(c)) {
                 longestTillNow = "";
                 set.clear();
             }
             longestTillNow += c;
             set.add(c);
             if (longestTillNow.length() > longestOverAll.length()) {
                 longestOverAll = longestTillNow;
             }
         }

         return longestOverAll;
    }
    
	public static void main(String[] args) 
	{
		String longDuplicateString=LongestUniqueSubstring.getLongestUniqueSubstring("stackoverflow");
        System.out.println("longest substring without repeating characters is "+longDuplicateString);
	}

}
