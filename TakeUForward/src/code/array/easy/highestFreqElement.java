package code.array.easy;

public class highestFreqElement {
	public static void func(int[] arr) {
		int count=0;
		int can=0;
		for(int num:arr) {
			if(count==0) {
				can=num;
			}
			if(num!=can) {
				count--;
			}else
				count++;
		}
		System.out.println(can);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,1,1,1,2,2};
		func(arr);
		
	}

}
