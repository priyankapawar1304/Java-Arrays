
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PassingMarks
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T =sc.nextInt();
        while(T-->0){
            int Amin=sc.nextInt();
            int Bmin=sc.nextInt();
            int Cmin=sc.nextInt();
            int Tmin=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=sc.nextInt();
            if(A>=Amin && B>=Bmin && C>=Cmin && (A+B+C)>=Tmin){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here
    }
}
