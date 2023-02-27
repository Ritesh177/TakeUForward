///find the maximumoccuring number greater than n/3
package code.array.hard;

import java.util.ArrayList;
import java.util.HashMap;

public class maximumNumber {
	public static void func(int[] arr) {
		ArrayList<Integer> ans=new ArrayList<>();
		HashMap<Integer,Integer> mp=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
		}
		for(int k:mp.keySet()) {
			if(mp.get(k)>arr.length/3) {
				ans.add(k);
			}
		}
		System.out.println(ans.toString());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 2, 3, 2};
		//func(arr);
		

	}

}
