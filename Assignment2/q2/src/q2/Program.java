package q2;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int menu() {
		System.out.print("----------------------------------------"
				+ "\n0) Exit\n"
				+ "1) push\n"
				+ "2) pop\n"
				+ "3) peek\n"
				+ "4) Visualize Queue\n"
				+ "   Enter Your Choice: ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		CircularQueue c = new CircularQueue(5);
		int choice=0;
		while((choice=menu())!=0) {
			switch (choice) {
			case 1:
				System.out.print("Enter data: ");
				c.push(sc.nextInt());
				break;
			case 2:
				c.pop();
				break;
			case 3:
				c.peek();
				break;
			case 4:
				c.display();
			}
		}
	}

}
