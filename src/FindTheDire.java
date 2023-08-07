

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FindTheDire
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            int div=X%4;
            if(div==0){
                System.out.println("North");
            }else if(div==1){
                System.out.println("east");
            }else if(div==2){
                System.out.println("South");
            }
            else{
                System.out.println("West");
            }
        }

        // your code goes here
    }
}
