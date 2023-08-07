
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BodyMassIndex
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int M=sc.nextInt();
            int H=sc.nextInt();
            int bmi=M/(H*H);
            if(bmi<=18){
                System.out.println(1);
            }else if(bmi>=19 && bmi<=24){
                System.out.println(2);
            }else if(bmi>=25 && bmi<=29){
                System.out.println(3);
            }
            else{
                System.out.println(4);
            }

        }
        // your code goes here
    }
}
