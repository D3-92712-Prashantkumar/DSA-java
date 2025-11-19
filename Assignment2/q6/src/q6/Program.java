package q6;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int menu() {
		System.out.print("-------------------------------------------------\n"
				+ "0) Exit\n"
				+ "1) Add employee (Perfrom any add operation)\n"
				+ "2) Display all employees\n"
				+ "3) Search employee by name\n"
				+ "4) Delete employee by empid\n"
				+ "5) Update salary of employee\n"
				+ "   Enter Your Choice : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		List l = new List();
		int choice=0;
		while((choice=menu())!=0) {
			switch (choice) {
			case 1:
				Employee e = new Employee();
				System.out.print("Enter Id     :");
				e.setId(sc.nextInt());
				System.out.print("Enter name   :");
				e.setName(sc.next());
				System.out.print("Enter sal    :");
				e.setSal(sc.nextDouble());
				System.out.print("Enter age    :");
				e.setAge(sc.nextInt());
				l.addLast(e);
				break;
			case 2:
				l.display();
				break;
			case 3:
				System.out.print("To Search:- \nEnter name   :");
				String name = sc.next();
				Employee e1 = l.findByName(name);
				System.out.println(e1.toString());
				break;
			case 4:
				//delete Emp by id
				System.out.print("Enter Id to delete : ");
				l.deleteById(sc.nextInt());
				break;
			case 5:
				//update emp sal
				System.out.println("Update Salary :-");
				System.out.print("Enter Id : ");
				int id = sc.nextInt();
				System.out.print("Enter new Sal : ");
				l.updateSal(id, sc.nextDouble());
				break;
			default:
				break;
			}
		}
	}

}
