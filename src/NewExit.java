
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NewExit
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            if(X<=50){
                System.out.println("LEFT");
            }
            else{
                System.out.println("RIGHT");
            }
        }
        // your code goes here
    }
}
