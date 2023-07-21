
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DarkLight
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            if(K==0){
                if(N%4==0){
                    System.out.println("OFF");
                }
                else{
                    System.out.println("ON");
                }
            }
            else{
                if(N%4==0){
                    System.out.println("ON");
                }
                else{
                    System.out.println("Ambiguous");
                }
            }
        }
        // your code goes here
    }
}
