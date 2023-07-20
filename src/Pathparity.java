

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PathParity
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            if(N%2!=0 && K==0){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
        // your code goes here
    }
}
