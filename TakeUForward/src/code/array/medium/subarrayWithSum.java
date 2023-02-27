package code.array.medium;

public class subarrayWithSum {
	public static void func(int[] arr,int k) {
		int sum;
		for(int i=0;i<arr.length;i++) {
			sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum==k) {
					for(int p=i;p<=j;p++) {
						System.out.print(arr[p]+" ");
						
					}
					System.out.println();
				}
			}
		}
	
	}
	public static void newFunc(int[] arr,int k) {
		int sum=0,p=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>k) {
				p=i;
				sum=arr[p];
			}
			if(sum==k) {
				for(int j=p;j<=i;j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
			if(sum<0) {
				sum=0;
				p++;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int k=6;
		//int[] arr= {1, 9, 3, 7};
		//int k=10;
		
		func(arr,k);
		newFunc(arr, k);
		

	}

}
