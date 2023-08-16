

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Existance
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long X=sc.nextLong();
            long Y=sc.nextLong();
            long A = (X*X*X*X)+(4*Y*Y);
            long B=(4*X*X*Y);
            if(A==B){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        // your code goes here
    }
}
