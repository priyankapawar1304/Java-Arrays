
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TwoDishes
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int S=sc.nextInt();
            if(N<S){
                System.out.println(N-(S-N));
            }
            else{
                System.out.println(N-(N-S));
            }
        }
        // your code goes here
    }
}
