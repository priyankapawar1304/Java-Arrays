

        import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DateAndMonth
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            String[] S=sc.next().split("/");
            int d=Integer.parseInt(S[0]);
            int m=Integer.parseInt(S[1]);
            if(d>12){
                System.out.println("DD/MM/YYYY");
            }
            else if(m>12){
                System.out.println("MM/DD/YYYY");
            }
            else{
                System.out.println("Both");
            }
        }
        // your code goes here
    }
}
