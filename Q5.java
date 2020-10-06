import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		double result=0;
		
		for(int i=1;i<n+1;i++) {
			result = result + (double)(1.0/i);
			
			
			
		}
		
		System.out.println(result);

	}

}
