import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		
		int as=a1+a2+a3;
		
		if(as == 180) {
			System.out.println("valid triangle");
		}
		else {
			System.out.println("not valid triangle");
		}
		
		
	}

}
