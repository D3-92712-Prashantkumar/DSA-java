package q5;
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
		System.out.print("Enter the size of Descending stack: ");
		Stack s = new Stack(sc.nextInt());
		int choice=0;
		while((choice=menu())!=0) {
			switch (choice) {
			case 1:
				System.out.print("Enter Data: ");
				s.push(sc.nextInt());
				break;
			case 2:
				int pop = s.pop();
				if(pop>0)
					System.out.println("Popped : "+pop);
				else
					System.out.println("Nothing to pop :)");
				break;
			case 3:
				int peek = s.peek();
				if(peek>0)
					System.out.println("Top    : "+peek);
				else
					System.out.println("Dont Peek!!! Stack is Already suffering from emptyness :)");
				break;
			default:
				break;
			}
		}
		
	}

}
