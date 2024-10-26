package practice;

public class TheOcurrenceOfcharacterinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Automaton";
		char ch='n';
		int count = 0;
		for(char c:str.toCharArray()) {
			if(c==ch)
				count++;
			
		}
System.out.println(count);
	}

}
