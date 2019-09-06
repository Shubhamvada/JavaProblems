package string;

public class LongestPallindromeString 
{
   private static String getLongestPallindrome(String input)
   {
	   StringBuilder inptStr;
	   String output="";
	   String s="";
	   for (int i=0;i<input.length();i++)
	   {
		   String str;
		   for(int x=i+1;x<=input.length();x++)
		   {
			   str=input.substring(i, x);
			   inptStr=new StringBuilder(str);
			   inptStr.reverse();
			   if (input.contains(inptStr.toString()))
			   {
				   s=str;
			   }
			   if (output.length()<s.length())
				   output=s;
		   }
	   }		   
	   return output;
   }
	public static void main(String[] args)
	{
		String longDuplicateString=LongestPallindromeString.getLongestPallindrome("abaradar121");
        System.out.println("longest pallindrome substring is "+longDuplicateString);
	}

}
