package code.array.medium;

public class stockbuysell {
	public static void optimal(int[] arr) {
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			max=Math.max(arr[i]-min, max);
		}
		System.out.println("optimal :"+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {7,6,4,3,1};
		int[] arr= {7,1,5,3,6,4};
		int c=0,max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					c=arr[j]-arr[i];
					if(c>max) {
						max=c;
					}
				}else {
					continue;
				}
			}
		}
		if(max==Integer.MIN_VALUE) {
			System.out.println(0);
		}else
			System.out.println(max);
		optimal(arr);

	}

}
