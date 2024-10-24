package practice;

public class VowelsConstonts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="krishnakanth";
		int vowels=0,consonants=0;
		for(char c:str.toCharArray()) {
			if("aeiouAEIOU".indexOf(c)!=-1) {
				vowels++;
			}
			else if(Character.isLetter(c)){
				consonants++;
			}
			
		}
System.out.println("vowels:"+vowels+"consonants:"+consonants);
	}

}
