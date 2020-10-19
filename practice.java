import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {5,2,4,3,2,1};
		
			System.out.println(li(arr,0,2));
	

}



public static int li(int[] arr , int vi ,int target) {
	
	if(vi==arr.length) {
		
		return -1;
	}
	
		
	int maax = li(arr,vi+1,target);
	//i'll check if max is -1 or not
		//if max is not -1 i'll return the max else
	if(maax!=-1) {
		return maax;
	}
	
	else
	{
		if(arr[vi]==target)
			return vi;
		else 
			return -1;
	}
	//i'll check myself (if i am the target number then i'll return my index)
	//else i return -1
	
	
}







}