package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=14;
		boolean isPrime=true;
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%2==0) {
				isPrime=false;
			}
			System.out.println(isPrime);
		}

	}

}
