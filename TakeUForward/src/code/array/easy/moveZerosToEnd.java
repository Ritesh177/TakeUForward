package code.array.easy;

public class moveZerosToEnd {
	public static void printArray(int[] arr) {
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
	public static void optimal(int[] arr) {
		int k=0;
		while(k<arr.length) {
			if(arr[k]==0)
				break;
			else
				k+=1;
		}
		int i=k,j=k+1;
		while(i<arr.length && j<arr.length) {
			if(  arr[j]!=0) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
				
			}
			else
				j++;
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
		int[] arr= {1,2,0,1,0,4,0};
//		int j=0;
//		int[] temp=new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>0) {
//				temp[j]=arr[i];
//				j++;
//			}
//		}
//		while(j<arr.length) {
//			temp[j]=0;
//			j++;
//		}
//		
//		printArray(temp);
		optimal(arr);
	}

}
