

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MakeAllEqualPairs
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
            Arrays.sort(A);
            int maxCount=0;
            for(int i=0;i<N-1;i++){
                int count=0;
                for(int j=0;j<N;j++){
                    if(A[i]==A[j]){
                        count++;
                    }
                }
                if(count>maxCount){
                    maxCount=count;
                }
            }
            System.out.println(N-maxCount);
        }


        // your code goes here
    }
}
