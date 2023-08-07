/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefOnIsland
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int Xr=sc.nextInt();
            int Yr=sc.nextInt();
            int D=sc.nextInt();
            double a=X/Xr;
            double b=Y/Yr;
            double c=Math.min(a,b);
            if(c>=D){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here
    }
}
