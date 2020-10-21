package recursion;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(fact(5));

	}
	
	public static int fact(int x) {
		
		if(x==0)
			return 1;
		
		
		int f=x*fact(x-1);
		return f;
		
		
		
		
		
		
	}

}
