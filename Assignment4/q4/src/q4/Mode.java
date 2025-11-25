package q4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mode {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,3,7,8,2,11,2};
		System.out.println("Array: "+Arrays.toString(arr));
		getMode(arr);
	}

	private static void getMode(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int s : arr) {
			if(map.containsKey(s))
				map.put(s,map.get(s)+1);
			else
				map.put(s, 1);
		}
		System.out.print("Occurances:- ");
		System.out.println(map.toString());
		int max=0;
		int mode=0;
		Iterator<Map.Entry<Integer,	Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = itr.next();
			if(entry.getValue()>max) {
				max = entry.getValue();
				mode = entry.getKey();
			}
		}
		System.out.println("Mode : "+mode);
	}
}
