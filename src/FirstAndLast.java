

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FirstAndLast
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] A=new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();

            }
            int count=0;
            int d=0;
            for(int i=0;i<N;i++){
                count=A[i]+A[(i+1)%N];
                d=Math.max(count,d);
            }
            System.out.println(d);


        }
        // your code goes here
    }
}
