package recursion2;

public class lastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,4,2,4,5,3,2};
		
		System.out.println(lastidx(arr,arr.length-1,4));

	}
	
	public static int lastidx(int[] arr,int idx ,int num) {
		
		if(idx==0) {
			return -1;
		}
		
		if(arr[idx]==num) {
			return idx;
		}
		
		 return lastidx(arr,idx-1,num);
		
		
	}

}
