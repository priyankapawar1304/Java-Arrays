
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SecretRecipe
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X1=sc.nextInt();
            int X2=sc.nextInt();
            int X3=sc.nextInt();
            float V1=sc.nextInt();
            float V2=sc.nextInt();
            float c=(X3-X1) / V1;
            float d=(X2-X3) / V2;
            if(c>d){
                System.out.println("Kefa");
            }
            else if(c < d){
                System.out.println("Chef");
            }

            else{
                System.out.println("Draw");
            }
        }
        // your code goes here
    }
}
