package practice;
import java.util.HashSet;
public class RemoveDuplicate {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[]arr= {1,2,3,3,4,5,5};
	HashSet<Integer>set=new HashSet<>();
	for(int num:arr) {
		set.add(num);
	}
	System.out.println(set);

	}

}
