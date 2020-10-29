package recursion;

public class increasingDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		incDec(n, 1);
		


	}
	
	static void incDec(int n, int i){
		
		if(i==n+1) {
			return;
		}
		
	
			
			
		
		System.out.print(i);
	
		incDec(n,i+1);
		
		System.out.print(i);
		
//		incDec(x-1);
		
	}
	
	
}