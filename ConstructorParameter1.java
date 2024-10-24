package practice;

public class ConstructorParameter1 {
	  int modelYear;
	  String modelName;

	  public ConstructorParameter1(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  public static void main(String[] args) {
		  ConstructorParameter1 myCar = new ConstructorParameter1 (1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	  }
	}
