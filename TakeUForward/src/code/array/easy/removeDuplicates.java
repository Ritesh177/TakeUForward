package code.array.easy;

public class removeDuplicates {
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void dupl(int[] arr) {
		int i=0;
		
		for(int j=0;j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		printArr(arr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,2,2,2,2,3,3,4,4,4,5,5};
		dupl(arr);
	}

}
