package q3;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int menu() {
		System.out.print("-------------------------------"
				+ "\n0) Exit"
				+ "\n1) Add at First Position"
				+ "\n2) Add at Last Position"
				+ "\n3) Add at a Given Position"
				+ "\n4) Delete From First Position"
				+ "\n5) Delete From Last Position"
				+ "\n6) Delete From Given Position"
				+ "\n7) Display List"
				+ "\n   Enter Your Choice: ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		CircularList c = new CircularList();
		
		int choice = 0;
		while((choice=menu())!=0) {
			switch (choice) {
			case 1:
				System.out.print("Enter Data : ");
				c.addFirst(sc.nextInt());
				c.display();
				break;
			case 2:
				System.out.print("Enter Data : ");
				c.addLast(sc.nextInt());
				c.display();
				break;
			case 3:
				System.out.print("Enter Position : ");
				int pos = sc.nextInt();
				System.out.print("Enter Data : ");
				c.addAtPosition(pos, sc.nextInt());
				c.display();
				break;
			case 4:
				c.deleteFirst();
				System.out.println("Node Deleted From First Position!!");
				c.display();
				break;
			case 5:
				c.deleteLast();
				System.out.println("Node Deleted From Last Position!!");
				c.display();
				break;
			case 6:
				System.out.print("Enter Data : ");
				int pos2 = sc.nextInt();
				c.deleteAtPosition(pos2);
				System.out.println("Node Deleted From "+pos2+" Position!!");
				c.display();
				break;
			case 7:
				c.display();
			}
		}
	}

}
