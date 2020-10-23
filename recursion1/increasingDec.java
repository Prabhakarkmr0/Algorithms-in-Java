package recursion;

public class increasingDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		incdec(5);

	}
	
	static void incdec(int x) {
		
		if(x==0) {
			return;
		}
		
	
			
			
		
		System.out.println(x);
	
		incdec(x-1);
		
		System.out.println(x);
		
			
		
	}

}
