
public class Q3 {
	
	public static int isarm(int num) {
		int res=0;
		while(num>0) {
			int temp=num%10;
			res= res + (temp*temp*temp);
			num=num/10;
			
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		for(int i=1;i<501;i++) {
			int arm=isarm(i);
			if(i==arm) {System.out.println(i);}
			
		}
	}

}
