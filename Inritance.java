package practice;
public class Inritance {
		  protected String brand = "Ford";
		  public void honk() {
		    System.out.println("Tuut, tuut!");
		  }
		}

		class Car extends Inritance {
		  private String modelName = "Mustang";
		  public static void main(String[] args) {
			  Car myFastCar = new Car();
		    myFastCar.honk();
		    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
		  }
		}
