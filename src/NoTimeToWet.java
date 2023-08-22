

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NoTimeToWet
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int H=sc.nextInt();
        int X=sc.nextInt();
        int diff=H-X;
        int[] T=new int[N];
        int count=0;
        for(int i=0;i<N;i++){
            T[i]=sc.nextInt();
        }
        for(int j=0;j<N;j++){
            if(T[j]>=diff){
                count++;
            }
        }
        if(count>0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        // your code goes here
    }
}
