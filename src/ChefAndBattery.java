

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndBattery
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int count=0;
            while(N!=50){
                if(N<50){
                    N+=2;
                }
                else{
                    N-=3;
                }
                count++;

            }
            System.out.println(count);
        }
        // your code goes here
    }
}
