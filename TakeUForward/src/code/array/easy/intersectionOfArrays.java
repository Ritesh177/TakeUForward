package code.array.easy;

import java.util.ArrayList;
import java.util.HashSet;

public class intersectionOfArrays {
	public static void printArr(ArrayList<Integer> arr) {
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}
	public static void optimalApp(int[] n1,int[] n2) {
		int i=0,j=0;
		ArrayList<Integer> resu=new ArrayList<Integer>();
		while(j<n2.length && i<n1.length) {
			if(n1[i]<n2[j]) {
				i++;
			}
			else if(n1[i]>n2[j]) {
				j++;
				
			}
			else {
				resu.add(n1[i]);
				i++;
				j++;
			}
		}
		printArr(resu);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,3,4,5,6};
		int[] arr2= {3,3,4,4,5,8};
		//output: 3,3,4,5
		ArrayList<Integer> res=new ArrayList<Integer>();
		int[] vis=new int[arr2.length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j] && vis[j]==0) {
					res.add(arr1[i]);
					vis[j]=1;
					break;
				}
				else if(arr1[i]<arr2[j])
					break;
			}
		}
		//printArr(res);
		optimalApp(arr1, arr2);

	}

}
