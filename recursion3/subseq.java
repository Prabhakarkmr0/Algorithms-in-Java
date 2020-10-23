package recursion3;

import java.util.ArrayList;

public class subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abcde";
		
		ArrayList<String> ss=getss(str);
		
		System.out.print(ss);

	}
	
	
	public static ArrayList<String> getss(String str){
		
		if(str.length()==0) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
			
		}
		
		
		char ch=str.charAt(0);
		String res=str.substring(1);
		ArrayList<String> subs=getss(res);
		
		ArrayList<String> result=new ArrayList<>();
		
		for(String s:subs) {
			result.add(""+s);
			result.add(ch+s);
		}
		
		return result;
		
		
	}
	

}
