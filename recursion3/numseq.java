package recursion3;

import java.util.ArrayList;

public class numseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> res=new ArrayList<>();
		res = numseq(1,10);
		System.out.print(res);
		
	}
	
	
	public static ArrayList<String> numseq(int start , int end){
		
		//base case
		if(start==end) {
			ArrayList <String> t= new ArrayList<>();
			t.add(Integer.toString(start));
			return t;
			
		}
		
		if(start>end) {
			
			ArrayList <String> t=new ArrayList<>();
			return t;
			
		}
				
		//
		
		ArrayList<String> mr=new ArrayList<>();
		for(int i=1;i<=6;i++) {
			
			ArrayList<String> rr=numseq(start+i,end);
			for(String ele : rr) {
				mr.add(Integer.toString(start)+" - "+ele);
				
				
			}
		}
		
		return mr;
		
	}

}
