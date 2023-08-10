

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndIpcCertificate
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner Obj= new Scanner(System.in);

        int N= Obj.nextInt();
        int M=Obj.nextInt();
        int K=Obj.nextInt();

        int T[][]=new int[N][K];
        int Q[]=new int[N];
        int X[]= new int[N];


        for(int i=0;i<N;i++)
        {
            int sum=0;
            for(int j=0;j<K;j++)
            {
                T[i][j]=Obj.nextInt();
                sum+=T[i][j];
            }

            Q[i]=Obj.nextInt();
            X[i]=sum;
        }

        int count=0;
        for(int i=0;i<N;i++)
        {
            if(X[i]>=M && Q[i]<=10)
                count++;
        }
        System.out.println(count);

    }
}