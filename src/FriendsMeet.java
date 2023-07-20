

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FriendsMeet
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            if(x1>x2 || x1==x2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here
    }
}
