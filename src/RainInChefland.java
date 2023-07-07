
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RainInChefland
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            if(X<3){
                System.out.println("LIGHT");
            }
            else if(X>=3 && X<7){
                System.out.println("MODERATE");
            }
            else{
                System.out.println("HEAVY");
            }
        }
        // your code goes here
    }
}
