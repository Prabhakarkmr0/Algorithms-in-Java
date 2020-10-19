import java.io.*;
import java.util.*;

public class pr2{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr=new int[l];
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum<0)
                    count++;
            }
            
        }
    System.out.print(count);
    
    }
}