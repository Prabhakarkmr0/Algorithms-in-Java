package recursion3;

import java.util.*;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num=("012");
		
		ArrayList<String> res=new ArrayList<String>();
				
		res=permutation(num);
		
		System.out.println(res);
	}
	
	public static ArrayList<String> permutation(String num) {
		
		if(num.length()==0) {
			ArrayList<String> t=new ArrayList<>();
			t.add("");
			return t;
			
		}
		
	
		char ch=num.charAt(0);
		String ss=num.substring(1);
		
		ArrayList<String> rr=permutation(ss);
		
		ArrayList<String> mres=new ArrayList<>();
		
		for(String elm : rr ) {
			
			for(int i=0;i<=elm.length();i++) {
				
				String pre=elm.substring(0,i);
				String post=elm.substring(i);
				mres.add(pre+ch+post);
				
			}
			
		}	
		
		
		
		return mres;
	}
	
	

}
