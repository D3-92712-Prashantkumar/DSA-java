package q2;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int getVal() { 
		System.out.print("Enter value: ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		List l = new List();
		int d = 0;
		System.out.println("Keep on inserting values! (Enter Negative Value to Exit)");
		while((d=getVal())>0) {
			l.add(d);
			l.display();
		}
	}

}
