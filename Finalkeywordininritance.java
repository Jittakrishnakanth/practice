package practice;

public class Finalkeywordininritance {
		  protected String brand = "Ford";
		  public void honk() {
		    System.out.println("Tuut, tuut!");
		  }
		}

		class Class extends Finalkeywordininritance {
		  private String modelName = "Mustang";
		  public static void main(String[] args) {
		   Class myFastCar = new Class();
		    myFastCar.honk();
		    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
		  }
		}



