

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solubility
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            int c=(A+(100-X)*B);
            System.out.println(c*10);
        }
        // your code goes here
    }
}
