
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddsAndEven
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if((a+b)%2==0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
        // your code goes here
    }
}
