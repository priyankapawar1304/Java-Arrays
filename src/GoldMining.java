

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GoldMining
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt()+1;
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int mul=N*Y;
            if(mul>=X){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        // your code goes here
    }
}
