import java.util.Scanner;

public class SumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int res=0,count=0;;
		
		
		do {
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int num3=sc.nextInt();
			res = num1+num2;
			
			count = num3;
			System.out.println(res);
		} while(count != 0);
		
		

	}

}
