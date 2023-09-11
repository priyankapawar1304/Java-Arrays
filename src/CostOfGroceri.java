

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CostOfGroceri
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int X=sc.nextInt();
            int[] A=new int[N];
            int[] B=new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            for(int i=0;i<N;i++){
                B[i]=sc.nextInt();
            }
            int total=0;
            for(int i=0;i<N;i++){
                if(A[i]>=X){
                    total+=B[i];
                }
            }
            System.out.println(total);
        }
        // your code goes here
    }
}
