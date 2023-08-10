

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OnlineOrOffline
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();while(T-->0){
        int N=sc.nextInt();
        int M=sc.nextInt();
        double a=N-(N * (0.1));
        if(a>M){
            System.out.println("DINING");
        }
        else if(a<M){
            System.out.println("ONLINE");
        }
        else{
            System.out.println("EITHER");
        }
    }
        // your code goes here
    }
}
