

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Catagory
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            if(X>=1 && X<100){
                System.out.println("Easy");
            }else if(X>=100 && X<200){
                System.out.println("Medium");
            }
            else{
                System.out.println("Hard");
            }
        }
        // your code goes here
    }
}
