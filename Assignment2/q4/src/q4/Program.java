package q4;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int menu() {
		System.out.print("----------------------------------------"
				+ "\n0) Exit\n"
				+ "1) push\n"
				+ "2) pop\n"
				+ "3) peek\n"
				+ "   Enter Your Choice: ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		Queue q;
		System.out.print("Enter the size of queue: ");
		q = new Queue(sc.nextInt());
		int choice=0;
		while((choice=menu())!=0) {
			switch (choice) {
			case 1:
				System.out.print("Enter data: ");
				q.push(sc.nextInt());
				break;
			case 2:
				int pop = q.pop();
				if(pop>0)
					System.out.println("Popped : "+pop);
				else
					System.out.println("Nothing to pop Here :)");
				break;
			case 3:
				int peek = q.peek();
				if(peek>0)
					System.out.println("Front : "+peek);
				else
					System.out.println("Dont Peek!!! Queue is Already suffering from emptyness :)");
				break;
			default:
				System.out.println("Invalid Choice!!");
				break;
			}
		}
	}

}
