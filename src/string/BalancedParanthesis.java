package string;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String ss = sc.next();
	System.out.println(isBalanced(ss)?1:0);
	
}

public static boolean isBalanced(String s) {
	
	Stack<Character> charStach = new Stack<Character>();
	

	
	for(char ch : s.toCharArray()) {
		if(ch=='(') {
			charStach.push(')');
		}
		else if(ch=='{') {
			charStach.push('}');
		
		}
		else if (ch=='[') {
			charStach.push(']');
		}
		else if(charStach.empty() || charStach.pop()!=ch )
		{
			return false;
			
		}	
	}
	return charStach.empty();
	
}
}
