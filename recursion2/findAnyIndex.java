package recursion2;

public class findAnyIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,3,2,4,2,5,6,4,3};
		
		System.out.println(findidx(arr,0,2));
		

	}
	
	public static int findidx(int[] arr,int vi,int num) {
		
		if(vi==arr.length) {
			return -1;
		}
		
		if(arr[vi]==num) {
			return vi;
		}
		
		int index = findidx(arr,vi+1,num);
		return index;
		
		
		
		
		
	}

}
