

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BrokenPhone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            if(X<Y){
                System.out.println("REPAIR");
            }
            else if(X==Y){
                System.out.println("ANY");
            }
            else{
                System.out.println("NEW PHONE");
            }

        }
        // your code goes here
    }
}
