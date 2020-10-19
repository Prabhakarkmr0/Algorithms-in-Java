import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		int avg = (m1+m2+m3)/3;
		
		if(101>avg && avg>89) {
			System.out.println("A");
		}
		else if (90>avg && avg>79) {
			System.out.println("B");
		}
		else if (80>avg && avg>69) {
			System.out.println("C");
		}
		else if (70>avg && avg>59) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}
