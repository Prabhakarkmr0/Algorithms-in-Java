import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int fact=sc.nextInt();
		int res=1;
		while(fact>0) {
			res=res*fact;
			fact--;
		}
		
		System.out.println(res);

	}

}
