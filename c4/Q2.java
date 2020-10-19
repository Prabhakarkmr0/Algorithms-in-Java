import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int s=0,l=0;
		for(int i=0;i<count;i++) {
			int temp=sc.nextInt();
			if(temp>l) {l=temp;}
			else if(temp<s) {s=temp;}
			
		}
		
		System.out.println("largest number "+l+" smallest number "+s);

	}

}
