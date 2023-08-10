
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BlackJack
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int d=21-A-B;
            if(d<=10){
                System.out.println(d);
            }
            else{
                System.out.println(-1);
            }
        }
        // your code goes here
    }
}
