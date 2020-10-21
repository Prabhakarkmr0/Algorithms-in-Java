package recursion2;

public class printar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {23,45,12,65,445,22,2};
		
		printar(arr,0);
		

	}
	
	public static void printar(int[] arr,int vi) {
		
		if(vi==arr.length) {
			return;
		}
		
		System.out.print(arr[vi]+" ");
		printar(arr,vi+1);
		
		
	}

}
