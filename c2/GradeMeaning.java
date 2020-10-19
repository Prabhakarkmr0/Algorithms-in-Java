import java.util.Scanner;

public class GradeMeaning {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(ch == 'A') {
			System.out.println("Excellent");
		}
		
		else if(ch == 'B') {
			System.out.println("Good");
		}
		else if(ch == 'C') {
			System.out.println("Average");
		}
		else if(ch == 'D') {
			System.out.println("Deficient");
		}
		else if(ch == 'F') {
			System.out.println("Failing");
		}
		
	}

}
