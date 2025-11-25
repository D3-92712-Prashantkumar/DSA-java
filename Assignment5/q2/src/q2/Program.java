package q2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		BST t = new BST();
		
		t.add(8);
		t.add(4);
		t.add(5);
		t.add(23);
		t.add(12);
		
		t.inorder();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key: ");
		BST.Node res = t.binarySearch(sc.nextInt());
		if(res==null) {
			System.out.println("Key Not Found!!");
		}
		else
			System.out.println("Key Found : "+res.data);
		
		BST.Node succ = t.findSuccessor(res);
		if(succ ==null) System.out.println("error finding Successor");
		else System.out.println("Successor : "+ succ.data);
	}

}
