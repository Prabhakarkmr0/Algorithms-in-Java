import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int yr = sc.nextInt();
		
		if(yr%400==0) {
			System.out.println("Leap Year");
			
		}
		else if(yr%100==0) {
			System.out.println("Not A Leap year");
			
		}
		 
		else if(yr%4==0) {
			System.out.println("Leap Year");
		}
		
		else {
			System.out.println("Not A Leap Year");
		}

	}

}
