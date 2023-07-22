
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class KeplersLaw
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            double T1=sc.nextInt();
            double T2=sc.nextInt();
            double R1=sc.nextInt();
            double R2=sc.nextInt();
            double a=(T1*T1)/(R1*R1*R1);
            double b=(T2*T2)/(R2*R2*R2);
            if(a==b){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here
    }
}
