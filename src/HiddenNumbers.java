

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HiddenNumbers
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            if(N%2==0){
                System.out.println(2+" "+N/2);
            }
            else{
                System.out.println(1+" "+N);
            }
        }

        // your code goes here
    }
}



