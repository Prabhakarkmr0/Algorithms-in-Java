import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count = (int) Math.sqrt(num);
		String res="";
		
		for(int i=2 ; i<=count ; i++) {
			if(num%i==0) {
				res="NO";
				break;
			}
			else {
				res="YES";
			}
		}
		
		System.out.println(res);
	}

}
