package practice;

public class ConvertStringtoArray {
		  public static void main(String[] args) {
		    String myStr = "Hello";
		    char[] myArray = myStr.toCharArray();
		    for (char i : myArray) {
		      System.out.println(i);
		    }
		  }
		}
