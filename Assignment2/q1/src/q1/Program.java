package q1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Input Done!!");
		
		System.out.print("Array : [");
		for(int i:arr) {
			System.out.print(" "+i);
		}
		System.out.print(" ]\n");
		
		Stack s = new Stack(n);
		//1. push all from array
		for(int i:arr) {
			s.push(i);
		}
		//2. pop all to array
		for(int i=0;i<n;i++) {
			arr[i] = s.pop();
		}
		
		System.out.print("Reversed Array : [");
		for(int i:arr) {
			System.out.print(" "+i);
		}
		System.out.print(" ]\n");
		
	}

}
