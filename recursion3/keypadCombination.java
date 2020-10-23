package recursion3;

import java.util.ArrayList;

public class keypadCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kpc="345";
		ArrayList<String> res=getkpc(kpc);
		System.out.println(res);
		

	}
	
	static String[] codes= {".,","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static ArrayList<String> getkpc(String str) {
		
		if(str.length()==0) {
			ArrayList<String> t=new ArrayList<>();
			t.add("");
			return t;
		}
		
				
		char ch=str.charAt(0);
		String res=str.substring(1);
		ArrayList<String> rres=getkpc(res);
		
		ArrayList<String> mres=new ArrayList<>();
		
		String codeforch = codes[ch - '0'];
		for(int i=0;i<codeforch.length();i++) {
			char chcode=codeforch.charAt(i);
			for(String s:rres) {
				
				mres.add(chcode+s);
			}
			
		}
		
		
		
			return mres;
		
	}
	

}
