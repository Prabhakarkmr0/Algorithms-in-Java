package recursion1;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(pow(3,4));
		

	}
	
	public static int pow(int num,int raise) {
		
		if(raise == 0) {
			return 1;
		}
		
		if(raise == 1) {
			
			return num;
		}
		
		
		int res=num*pow(num,raise-1);
		
		return res;
		
	}

}
