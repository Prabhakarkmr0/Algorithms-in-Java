import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		double result=0;
		
		for(int i=1;i<n+1;i++) {
			
			if(i%2!=0) {
			result = result + (double)(1.0/i);
			}
			else {result = result - (double)(1.0/i);}
			
			
			
		}
		
		System.out.println(result);

	

	}

}
