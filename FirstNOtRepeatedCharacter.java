package practice;
import java.util.LinkedHashMap;
import java.util.Map;
public class FirstNOtRepeatedCharacter {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="Swiss";
	Map<Character,Integer>charCount = new LinkedHashMap<>();
	for(char c:str.toCharArray()) {
		charCount.put(c, charCount.getOrDefault(c,0)+1);
		
	}
	for(Map.Entry<Character,Integer>entry:charCount.entrySet()) {
		if(entry.getValue()==1) {
			System.out.println(entry.getKey());
		}
	}

	}

}