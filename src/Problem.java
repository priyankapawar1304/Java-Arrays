
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Problem
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=Math.abs(A-B);
            if(C%2==0){
                System.out.println("YES");

            }
            else{
                System.out.println("NO");
            }
        }
        // your code goes here
    }
}
