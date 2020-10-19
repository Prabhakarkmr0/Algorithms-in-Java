import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nums=sc.nextInt();
		int ev=0,od=0;
		while(nums>0) {
			int temp = sc.nextInt();
			if(temp%2==0) {
				ev=ev+temp;
			}
			else {
				od=od+temp;
			}
			
			nums--;
			
		}
		
		System.out.println(ev+" "+od);

	}

}
