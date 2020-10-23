package recursion3;

import java.util.ArrayList;

public class totalpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> res=new ArrayList<>();
		res=path(1,1,5,5);
		
		for(String s : res) {
			System.out.println(s);
		}
		
		

	}
	
	
	public static ArrayList<String> path(int r,int c,int er,int ec){
		
			if(r==er && c==ec) {
				ArrayList<String> t=new ArrayList<>();
				t.add("");
				return t;
			}
			
			
			
			if(r>er || c>ec) {
				ArrayList<String> t=new ArrayList<>();
				return t;
			}
		
			
		
			
			ArrayList<String> rr=path(r+1,c,er,ec);
			ArrayList<String> mr=new ArrayList<>();
			
			for(String ele : rr) {
				
				mr.add("V "+ ele);
				
			}
			rr=path(r,c+1,er,ec);
			
			for(String ele : rr) {
				
				mr.add("H "+ele);
			}
			
			rr=path(r+1,c+1,er,ec);
			
			for(String ele : rr) {
				
				mr.add("D "+ele);
				
			}
			
			return mr;
			
		}
		
		
}
