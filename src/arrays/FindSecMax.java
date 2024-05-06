package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindSecMax {

	
	public static void main(String[] args) {
		
	int [] arr = {2,0,4,1,0,0};
	int [] arrn = new int[arr.length];
//	int j=0;
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]!=0) {
//			arrn[j]=arr[i];
//			j++;
//		}
//	}
//	System.out.println(Arrays.toString(arrn));
//	
	int j=arr.length-1;
	for(int i=arr.length-1;i>=0;i--) {
			
			if(arr[i]!=0) {
				arrn[j]=arr[i];
				j--;
			}
		}
	System.out.println(Arrays.toString(arrn));
		
		
	}
	
	
	
}
