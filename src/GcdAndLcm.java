

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GcdAndLcm
{
    static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long gcd=1;
            long a=sc.nextInt();
            long b=sc.nextInt();
            gcd=gcd(a,b);
            long lcm=(a*b)/gcd;
            System.out.println(gcd+" "+lcm);

        }

        // your code goes here
    }
}
