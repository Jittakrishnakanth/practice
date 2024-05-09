import java.util.Scanner;
public class BiggerNumber{

	public static void main(String[] args) {
       int a=100,b=1000,c=600;
       //<,>,<=,>=,==,!=
       if(a>b)
       {
    	   if(a>c)
    	   {
    		   System.out.println("a is bigger");
    	   }
    	   else
    	   {
    		   System.out.println("c is bigger");
    	   }
       }
       else if(b>c)
       {
    	   System.out.println("b is bigger");
       }
       else
       {
    	   System.out.println("c is bigger");
       }
	}

}
