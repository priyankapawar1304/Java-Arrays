
import java.util.*;
import java.lang.*;
import java.io.*;
class Palindromw
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            char[] arr=sc.next().toCharArray();
            int s=0;
            Arrays.sort(arr);
            for(int i=0;i<N-1;i++){
                if(arr[i]==arr[i+1]){
                    s=1;
                    break;
                }
            }
            if(s==0){
                System.out.println(-1);
            }
            else{
                System.out.println(arr.length-2);

            }
        }
    }
}
