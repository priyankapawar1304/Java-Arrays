
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Bidding
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=sc.nextInt();
            if(A>B && A>C){
                System.out.println("Alice");
            }
            else if(B>A && B>C){
                System.out.println("Bob");
            }
            else{
                System.out.println("Charlie");
            }
        }
    }
}
