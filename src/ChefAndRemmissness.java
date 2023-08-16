

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndRemmissness
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=A+B;
            if(A<B){
                System.out.println(B+" "+C);
            }
            else{
                System.out.println(A+" "+C);
            }
        }
        // your code goes here
    }
}
