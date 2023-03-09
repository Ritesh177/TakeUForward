package code.array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UnionOfTwoArray {
	public static void printArr(ArrayList<Integer> arr) {
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}
	public static void UsingSet(int[] nums1,int[] nums2,int n,int m) {
		HashSet<Integer> sol=new HashSet<Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			sol.add(nums1[i]);
		}
		for(int i=0;i<m;i++) {
			sol.add(nums2[i]);
		}
		for(int k:sol) {
			list.add(k);
		}
		printArr(list);
	}
	public static void UsingMap(int[] nums1,int[] nums2,int n,int m) {
		ArrayList<Integer> union=new ArrayList<Integer>();
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
		}
		for(int i=0;i<m;i++) {
			map.put(nums2[i],map.getOrDefault(nums2[i], 0)+1);
		}
		for(int k:map.keySet()) {
			union.add(k);
		}
		printArr(union);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,m=7;
		int[] arr1={1,2,3,4,5,6,7,8,9,10};
		int[] arr2={2,3,4,4,5,11,12};
		
		//UsingMap(arr1, arr2, n, m);
		UsingSet(arr1, arr2, n, m);
	}

}
