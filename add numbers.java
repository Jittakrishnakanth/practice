package practice;
import java.util.Scanner;

class addnumbers {

	public static void main(String[] args) {
			int num1,num2,num3;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 2 numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=num1+num2;
			System.out.println("Add:"+num3);
			num3=num1-num2;
			System.out.println("Sub:"+num3);
			num3=num1*num2;
			System.out.println("Mul:"+num3);
			num3=num1/num2;
			System.out.println("Div:"+num3);
			num3=num1%num2;
			System.out.println("Mod:"+num3);

}
	}
	