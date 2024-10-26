package practice;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Krishnakanth";
		String result = str.replaceAll("\\S",",");
		System.out.println(result);

	}

}
