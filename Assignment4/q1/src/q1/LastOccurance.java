package q1;

import java.util.Arrays;
import java.util.Scanner;

public class LastOccurance {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,3,7,8,2,11,2};
		System.out.println("Array: "+Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key: ");
		int index = linearSearch(arr,sc.nextInt());
		if(index!=-1)
			System.out.println("Key Last Occurance is : "+index);
		else	
			System.out.println("Key is not present in Array!!!");
	}

	private static int linearSearch(int []arr,int key) {
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
