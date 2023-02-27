package code.array.hard;

import java.util.ArrayList;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
		int[] arr={-1,0,1,2,-1,-4};
		int i,j,k;
		for( i=0;i<arr.length-2;i++) {
			for(j=i+1;j<arr.length-1;j++) {
				for(k=j+1;k<arr.length;k++) {
					ArrayList<Integer> temp=new ArrayList<Integer>();
					if(arr[i]+arr[j]+arr[k]==0) {
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[k]);
						
					}
					if(temp.size()!=0) {
						ans.add(temp);
					}
				}
			}
		}
		for(int p=0;p<ans.size();p++) {
			for(int l=0;l<ans.get(p).size();l++) {
				System.out.print(ans.get(p).get(l)+" ");
			}
			System.out.println();
		}

	}

}
