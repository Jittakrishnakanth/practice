package practice;

public class MulObjects {

		  int x = 5;

		  public static void main(String[] args) {
			  MulObjects myObj1 = new MulObjects();
			  MulObjects myObj2 = new MulObjects();
		    myObj2.x = 25;
		    System.out.println(myObj1.x);
		    System.out.println(myObj2.x);
		  }
		}