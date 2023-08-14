

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Marbles
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int k=s.nextInt();
            long a=1;
            for(long i=1;i<k;i++)
            {
                a=a*((n-k)+i)/i;
            }
            System.out.println(a);
        }
    }
}