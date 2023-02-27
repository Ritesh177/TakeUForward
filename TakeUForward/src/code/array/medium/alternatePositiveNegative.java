package code.array.medium;

public class alternatePositiveNegative {
	public static void printArr(int[] arr) {
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {9, 4, -2, -1, 5, 0, -5, -3, 2};
		int[] arr={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				c++;
		}
		int[] narr=new int[c];
		int[] parr=new int[arr.length-c];
		int neg=0,pos=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				narr[neg]=arr[i];
				neg++;
			}
			else {
				parr[pos]=arr[i];
				pos++;
			}
		}
		int[] res=new int[arr.length];
		int j=0,k=0,i=0;
		while(j<neg && k<pos) {
			res[i++]=parr[k++];
			res[i++]=narr[j++];
		}
		while(k<pos) {
			res[i++]=parr[k++];
		}
		while(j<neg) {
			res[i++]=narr[j++];
		}
		printArr(res);
		
	}

}
