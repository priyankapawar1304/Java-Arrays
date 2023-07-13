

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FoodChain
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int E=sc.nextInt();
            int K=sc.nextInt();
            int count=1;

            while(E/K>0){
                E=E/K;
                count++;
            }
            System.out.println(count);
        }
        // your code goes here
    }
}
