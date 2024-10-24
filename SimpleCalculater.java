package practice;
import java.util.Scanner;
public class SimpleCalculater {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first Number:");
		double num1 = scan.nextDouble();
		System.out.println("Enter Second Number:");
		double num2 = scan.nextDouble();
		System.out.println("Enter Operation(=,-,*,/):");
		char Operation = scan.next().charAt(0);
		double result;
		switch(Operation){
		case'+':result=num1+num2;break;
		case'-':result=num1-num2;break;
		case'*':result=num1*num2;break;
		case'/':result=num1/num2;break;
		default:throw new IllegalArgumentException("Invalid Operation");
}
		System.out.println("Result:"+result);	

	}

}
