
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ThatsMyScore
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] arr=new int[20];
            for(int i=0;i<N;i++){
                int si=sc.nextInt();
                int pi=sc.nextInt();
                if(pi>arr[si]){
                    arr[si]=pi;
                }
            }
            int sum=0;
            for(int i=0;i<=8;i++){
                sum=sum+arr[i];
            }
            System.out.println(sum);
        }
    }
}
