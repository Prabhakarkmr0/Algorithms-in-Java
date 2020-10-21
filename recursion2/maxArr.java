package recursion2;

public class maxArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {23,45,12,65,445,22,2};
		
		System.out.println(max(arr,0));
		
		
	}
	
	public static int max(int[] arr,int vi) {
		
		if(vi==arr.length-1) {
			return arr[vi];
		}
		

		int maxsub=max(arr,vi+1);
		
		if(maxsub>arr[vi]) {
			return maxsub;
			
		}
		else {
			return arr[vi];
		}
		
	}

}
