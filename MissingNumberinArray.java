package practice;

public class MissingNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,4,5,6};
		int n=arr.length+1;
		int total = n*(n+1)/2;
		for(int num:arr) {
			total -= num;
			}
		System.out.println(total);
	}

}
