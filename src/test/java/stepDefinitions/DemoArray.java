package stepDefinitions;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {
		int[] numbers = {2,1,2,4,3,5,-2,4,7,8,9};
		printPretty(numbers, 5);
	}
		public static void printPairs(int[] array, int sum) {
			
			for(int i=0;i<array.length;i++) {
				int first=array[i];
				for(int j=i+1;j<array.length;j++) {
					int second = array[j];
					
					if((first+second)==sum) {
						System.out.printf("(%d,%d)%n",first,second);
					}
					
				}
			}
			
		}
		
		
	

	private static void printPretty(int[] givenArray, int givenSum) {
		// TODO Auto-generated method stub
		printPairs(givenArray, givenSum);
		
	}
}
		
		