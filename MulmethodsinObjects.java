package practice;

public class MulmethodsinObjects {
		  public void fullThrottle() {
		    System.out.println("The car is going as fast as it can!");
		  }

		  public void speed(int maxSpeed) {
		    System.out.println("Max speed is: " + maxSpeed);
		  }
		
class Second {
	  public static void main(String[] args) {
		  MulmethodsinObjects myCar = new MulmethodsinObjects();     // Create a myCar object
	    myCar.fullThrottle();      // Call the fullThrottle() method
	    myCar.speed(200);          // Call the speed() method
	  }
}
}