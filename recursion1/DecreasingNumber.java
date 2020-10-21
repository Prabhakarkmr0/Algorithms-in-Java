package recursion;

public class DecreasingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printdec(10);

	}
	
	
	public static void printdec(int x) {
		
		if(x<1) {
			return ;
		}
		
		System.out.println(x);
		printdec(x-1);
		
	}

}
