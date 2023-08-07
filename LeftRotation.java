import java.io.*;
import java.util.*;

public class Solution {
    
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        String[] d=sc.nextLine().split(" ");                
        String[] arr=sc.nextLine().split(" ");
        int len=Integer.parseInt(d[0]);
        int rot=Integer.parseInt(d[1]);
        /* Using algo solve problem efficient time-comlexity:log(n^2)*/
        String[] result=new String[len];
        for(int i=0;i<len;i++){
            int index=(i+len-rot)%len;
            result[index]=arr[i];
        }
        for(int j=0;j<len;j++){
            
        System.out.print(result[j]+" ");
        }
     /* Traditional method to solve time-comlexity:log(n)*/
        // for(int i=1;i<=rot;i++){
        //     String temp=arr[0];
        //     for(int j=0;j<len-1;j++){
                
        //         arr[j]=arr[j+1];
        //     }
        //     arr[len-1]=temp;
        // }
        
        // for(int i=0;i<len;i++){
        //     System.out.print(arr[i]+" ");
        // }

            }
}
