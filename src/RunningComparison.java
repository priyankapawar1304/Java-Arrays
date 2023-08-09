

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RunningComparison
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] A=new int[N];
            int[] B=new int[N];
            int i,j,k;

            for(i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            for(j=0;j<N;j++){
                B[j]=sc.nextInt();
            }
            int count=0;
            for(k=0;k<N;k++){
                if(2*A[k]>=B[k] && A[k]<=2*B[k]){
                    count++;
                }
            }
            System.out.println(count);
        }
        // your code goes here
    }
}
