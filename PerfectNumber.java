package practice;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 28,sum=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				sum+=i;
				}
		}
System.out.println(num==sum);
	}

}
