package q2;

import java.util.Arrays;
import java.util.Scanner;

public class nthOccurance {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,3,7,8,2,11,2};
		System.out.println("Array: "+Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key: ");
		int key = sc.nextInt();
		System.out.print("Enter n to find nth occurance: ");
		int n = sc.nextInt();
		int index = linearSearch(arr,key,n);
		if(index!=-1)
			System.out.println("Key's "+n+"th Occurance is : "+index);
		else	
			System.out.println("Key is not present in Array!!!Returned :"+index);
	}

	private static int linearSearch(int []arr,int key,int n) {
		int occ=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				occ++;
				if(occ==n)
					return i;
			}
		}
		return -1;
	}

}