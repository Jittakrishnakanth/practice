package practice;
import java.util.Scanner;
public class SimpleLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserName = "admin";
		String Password = "PAssword";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name:");
		String inputUsername = scan.nextLine();
		System.out.println("Enter Password:");
		String inputPassword = scan.nextLine();
		if(UserName.equals(inputUsername)&&Password.equals(inputPassword));
		System.out.println("Login successfull");
	}// else {
	//	System.out.println("Login Failed");
		
	}

//}
