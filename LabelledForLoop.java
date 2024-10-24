package practice;

public class LabelledForLoop {

	public static void main(String[] args) {
Outer:		for(int i=1;i<=3;i++) {
			System.out.println(i);
inner:			for(int j=0;j<=3;j++) {
				//System.out.println(j);
				System.out.println("krishna");
				break Outer;
			}
		}


	}

}


