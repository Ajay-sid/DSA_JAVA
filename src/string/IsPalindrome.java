package string;

import java.io.CharArrayReader;

public class IsPalindrome {
public static void main(String[] args) {
	
	System.out.println(isPalindrome("ajay"));
	System.out.println(isPalindrome("Bob"));
	System.out.println(isPalindrome("MoM"));
	System.out.println(isPalindrome("malayalam"));
	
}
//use negative conditions in loops to return
public static boolean isPalindrome(String s) {
	char[] chararray=s.toCharArray();
	int start = 0;
	int last=chararray.length-1;
	
	while(start<last) {
		if(chararray[start]!=chararray[last]) {
			return false;
		}
		start++;
		last--;
	}
	return true;
	
	
	
}



}
