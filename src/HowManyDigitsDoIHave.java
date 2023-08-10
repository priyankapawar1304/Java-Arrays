

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HowManyDigitsDoIHave
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N>=1 && N<=9){
            System.out.println(1);
        }
        else if(N>=10 && N<=99){
            System.out.println(2);
        }
        else if(N>=100 && N<=999){
            System.out.println(3);
        }
        else{
            System.out.println("More than 3 digits");
        }

        // your code goes here
    }
}
