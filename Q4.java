import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prev=0;
		int current=1;
		for(int i=0;i<n-2;i++) {
			
			if(prev==0 && current==1) {System.out.println(prev);
			System.out.println(current);}
			int num = prev+current;
			
			System.out.println(num);
			prev=current;
			current=num;
			
		}

	}

}
