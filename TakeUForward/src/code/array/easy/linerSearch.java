package code.array.easy;

public class linerSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,3,2,1};
		int num=3;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println(i);
				break;
			}
		}

	}

}
