package recursion1;

public class increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		printinc(10);

	}

	public static void printinc(int num) {
		
		if(num == 0) {
			return;
		}
		
		printinc(num-1);
		System.out.println(num);
		
	}
	
}
