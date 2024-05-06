package arrays;

public class FindMissingNuminFirstSumOfNaturalNumbers {

	public static void main(String[] args) {
		
		
		int[] arr = {1,4,3,7,5,9,8,6,10};
		System.out.println(findMissingNum(arr));
		
		
		
		
	}
	public static int findMissingNum(int[] array) {
		int n = array.length+1;
		int sum = n*(n+1)/2;
		for(int num:array) {
			sum=sum-num;
		}
		
		return sum;
	}
	
	
}
