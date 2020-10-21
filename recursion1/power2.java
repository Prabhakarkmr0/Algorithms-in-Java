package recursion1;

public class power2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(pow(3,3));

	}
	
	public static int pow(int num,int raise) {
		
		if(raise==0) {
			return 1;
		}
		if(raise==1) {
			return num;
		}
		
		int res=pow(num,raise/2);
		
		if(raise%2==0) {
			return res*res;
		}
		else
			
			return res*res*num;
		
		
		
	}

}
