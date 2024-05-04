package string;

import java.util.Scanner;

public class PrintWeightAscii {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for( char ch : s.toCharArray()) {
			sum=(int)ch+sum;
		}
System.out.println(sum);
}
}