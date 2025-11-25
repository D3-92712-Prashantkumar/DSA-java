package q3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class WordOccurance {

	public static void main(String[] args) {
		String line = "Do they know we know they know we know !!";
		System.out.println("The Line : "+line);
		String[] arr = line.split(" ");
		System.out.println("\nAfter Split Array: "+Arrays.toString(arr));
		
		countOccurances(arr);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nTo get Specific Word occurances, Enter Word: ");
		int Occurances = countOccurancesOfWord(arr,sc.next());
		if(Occurances!=-1)
			System.out.println("Key Word Occarance Count : "+Occurances);
		else	
			System.out.println("Key is not present in the Line!!!");
	}

	private static void countOccurances(String[] arr) {
		HashMap<String, Integer> map = new HashMap<>();
		for(String s : arr) {
			if(map.containsKey(s))
				map.put(s,map.get(s)+1);
			else
				map.put(s, 1);
		}
		System.out.print("Word Occurances:- ");
		System.out.println(map.toString());
	}

	private static int countOccurancesOfWord(String []arr,String key) {
		int occ=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i].equals(key)) {
					occ++;
			}
		}
		return occ;
		}
}
