package recursion;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		for(int i=0;i<9;i++) {
			
			System.out.print(fibo(i)+" ");
		}
			

	}
	
	
	   static int fibo(int x) {
		
		if(x<=1) {
			return x;
			
		}
		
		int fib1 = fibo(x-1);
		int fib2 = fibo(x-2);
	
		
		return fib1+fib2;
		
	}
	
	

}
