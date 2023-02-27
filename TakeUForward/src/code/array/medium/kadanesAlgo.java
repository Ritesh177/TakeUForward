package code.array.medium;

import java.util.ArrayList;


public class kadanesAlgo {
	public static int func(int[] arr, ArrayList<Integer> sub) {
		int curr_sum=0;
		int max_sum=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			 curr_sum=0;
			for(int j=i;j<arr.length;j++) {
				curr_sum+=arr[j];
				if(curr_sum>max_sum) {
					sub.clear();
					max_sum=curr_sum;
					sub.add(i);
					sub.add(j);
				}
			}
		}
		
		
		return max_sum;
	}
	public static int kadaneFunc(int[] arr) {
		int max=arr[0];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
			if(sum>max) {
				max=sum;
			}
			if(sum<0)
				sum=0;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		ArrayList<Integer> sub=new ArrayList<>();
		int res=func(arr,sub);
		System.out.println(res);
		int res1=kadaneFunc(arr);
		System.out.println("kadane "+res1);
		
		

	}

}
