package q1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List l = new List();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		//list before :
		System.out.println("Before:- ");
		l.display();
		
		//i. insert a new node after a given node(data)
		System.out.print("Enter the node data after which you want to Insert New Node:");
		int afterThis = sc.nextInt();
		System.out.print("Enter the new node data:");
		int newNodeData = sc.nextInt();
		l.insertAfter(afterThis, newNodeData);//insertAfter(int afterThis,int newNodeData)		
		System.out.println("After (i):- ");
		l.display();
		
		//ii. insert a new node before a given node(data)
		System.out.print("Enter the node data before which you want to Insert New Node:");
		int beforeThis = sc.nextInt();
		System.out.print("Enter the new node data:");
		int newNode2Data = sc.nextInt();
		l.insertBefore(beforeThis, newNode2Data);//insertBefore(int afterThis,int newNodeData)
		System.out.println("After (ii):- ");
		l.display();
		
	}

}
