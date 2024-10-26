package practice;
import java.util.HashMap;
public class MaxOccuringCharacter {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str = "programming";
	HashMap<Character,Integer>charCount = new HashMap<>();
	for(char c : str.toCharArray()) {
		charCount.put(c,charCount.getOrDefault(c,0)+1);
	}
	char maxChar = str.charAt(0);
	int maxCount = 0;
	for(char c:charCount.keySet()) {
		if(charCount.get(c)>maxCount) {
			maxCount = charCount.get(c);
			maxChar = c;
		}
		
	}
	System.out.println(maxChar);
	}

}
