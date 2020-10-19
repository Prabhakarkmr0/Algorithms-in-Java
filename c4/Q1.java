import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cp=0,cn=0,cz=0,count=0;
		Scanner sc=new Scanner(System.in);
		count = sc.nextInt();
		
		for(int i=0;i<count;i++) {
			
			int num = sc.nextInt();
			if(num<0) {cn++;}
			else if(num>0) {cp++;}
			else {cz++;}
		}
		
		
		System.out.println("possitive value "+cp+" negative value "+cn+" zeros "+cz);
		

	}

}
