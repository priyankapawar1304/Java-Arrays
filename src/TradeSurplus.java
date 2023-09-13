

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TradeSurplus
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int A1=sc.nextInt();
            int A2=sc.nextInt();
            int B1=sc.nextInt();
            int B2=sc.nextInt();
            int diff1=A1-A2;
            int diff2=B1-B2;
            int sum=diff1+diff2;
            if(sum<0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here
    }
}
