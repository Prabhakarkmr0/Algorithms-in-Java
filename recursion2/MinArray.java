package recursion2;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {23,451,1,12,65,445,22,2};
		
		System.out.println(min(arr,0));
		

	}
	
	public static int min(int[] arr,int vi) {
		
		if(vi==arr.length-1) {
			return arr[vi];
		}
		
		
		int ret=min(arr,vi+1);
		
		if(ret<arr[vi]) {
			return ret;
		}
		else {
			return arr[vi];
		}
	}
	

}
