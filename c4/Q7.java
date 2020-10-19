
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a
		for(int i=0;i<4;i++) {
			int j=0;
			while(j<10) {
				
				System.out.print("*");
				
				j++;
			}
			System.out.println();
			
		}
		
		//b
		for(int i=0;i<6;i++) {
			int j=0;
			while( j < i) {
				
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
		
		//c
		int l=8;
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<l;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
				
			}
			
			System.out.println();			
			
		l=l-2;
		
		}
		
		//d
		int l1=8;
		int i, j, k=1;     
		 for(i=0; i<5; i++){  
			 
			 for(int lf=0;lf<l1;lf++) {
				 System.out.print(" ");
			 }
			 for(j=0; j<k; j++){              
				 System.out.print("*");          
		 }
			 l1-=2;
			 k = k + 2;
			 System.out.println(); 
		 
		 
		 }
		 
		 //e
			int ll1=8;
			int i1, j1, k1=1;     
			 for(i1=0; i1<5; i1++){  
				 
				 for(int lf=0;lf<ll1;lf++) {
					 System.out.print(" ");
				 }
				 for(j1=0; j1<k1; j1++){              
					 System.out.print(i1+1);          
			 }
				 ll1-=2;
				 k1 = k1 + 2;
				 System.out.println(); 
			 
			 
			 }
			
			 
//			 //f
//			 
//			 int mll1=8;
//				int mi1, mj1, mk1=1;     
//				 for(mi1=0; mi1<5; mi1++){  
//					 
//					 for(int mlf=0;mlf<mll1;mlf++) {
//						 System.out.print(" ");
//					 }
//					 
//					 for(mj1=0; mj1<mk1; mj1++){ 
//						 
//						 System.out.print(mi1+1);          
//				     }		 
//					 
//					 
//					 
//					 
//					 
//					 mll1-=2;
//					 mk1 = mk1 + 2;
//					 System.out.println(); 
//				 
//				 
//				 }	 
			 
			 	
	

	}

}
