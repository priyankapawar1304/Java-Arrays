
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefOnVacation
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int Z=sc.nextInt();
            if((X+Y)>Z){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
        // your code goes here
    }
}
