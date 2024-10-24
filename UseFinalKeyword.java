package practice;

public class UseFinalKeyword {
		  final int x = 10;

		  public static void main(String[] args) {
			  UseFinalKeyword myObj = new UseFinalKeyword();
		    //myObj.x = 25; // will generate an error
		    System.out.println(myObj.x); 
		  }
		}


