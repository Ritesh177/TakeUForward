package code.array.easy;

public class removeNelementLeft {
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void func(int[] arr, int k) {
		int n=arr.length;
		k=k%n;
		int[] temp=new int[n-k];
		for(int i=0;i<k;i++) {
			temp[i]=arr[i];
		}
		for(int i=k;i<n;i++) {
			arr[i-k]=arr[i];
		}
		for(int i=k;i<n;i++) {
			arr[i]=temp[i-k];
		}
		printArr(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int k=3;
		func(arr,k);

	}

}
