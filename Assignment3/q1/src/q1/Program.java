package q1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		
		//1. Stack -> Reverse -> check
		checkWithStack(str);
		//2. StringBuilder -> reverse -> check
		checkWithStringBuilder(str);
		//3. Two Pointer check
		checkWithTwoPointers(str);
		//4. Deque check
		checkWithDeque(str);
	}
	private static boolean checkWithDeque(String str) {
		Deque<Character> dq = new ArrayDeque<>();
		//Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++) {
			dq.push(str.charAt(i));
		}
		String str2="";
		for (Character c:dq) {
			str2+=dq.pop();
		}
		if(str.equals(str2)) {
			System.out.println("[Deque]          => String is a Palindrome");
			return true;
		}
		System.out.println("[Deque]          => String is not a Palindrome");
		return false;
	}
	private static boolean checkWithTwoPointers(String str) {
		Character c1,c2;
		c1 = str.charAt(0);
		int j=str.length()-1;
		c2 = str.charAt(j);
		for(int i=0;i<str.length()/2;i++) {
			if(c1!=c2) {
//				System.out.println("i= "+i+" c1 = "+c1+" c2 = "+c2);
				System.out.println("[Two Pointers]   => String is not a Palindrome");
				return false;
			}
			c1 = str.charAt(i+1);
			c2 = str.charAt(j-1);
		}
		System.out.println("[Two Pointers]   => String is a Palindrome");
		return true;
	}
	private static boolean checkWithStringBuilder(String str) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder(str);
		StringBuilder str2 = sb.reverse();
		if(sb.equals(str2)) {
			System.out.println("[String Builder] => String is a Palindrome");
			return true;
		}
		System.out.println("[String Builder] => String is not a Palindrome");
		return false;
	}
	private static boolean checkWithStack(String str) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
//			System.out.println("pushed : "+ str.charAt(i));
		}
		String str2="";
		for (int i=0;i<str.length();i++) {
			str2+=st.pop();
		}
		System.out.println(str2);
		if(str.equals(str2)) {
			System.out.println("[Stack]          => String is a Palindrome");
			return true;
		}
		System.out.println(    "[Stack]          => String is not a Palindrome");
		return false;
	}

}
