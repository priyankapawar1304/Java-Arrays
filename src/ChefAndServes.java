
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndServes
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int p1=sc.nextInt();
            int p2=sc.nextInt();
            int K=sc.nextInt();
            int add=(p1+p2)/K;
            if(add%2==0){
                System.out.println("CHEF");
            }
            else{
                System.out.println("COOK");
            }
        }
        // your code goes here
    }
}
