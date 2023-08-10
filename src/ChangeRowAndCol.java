

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChangeRowAndCol
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int Sx=sc.nextInt();
            int Sy=sc.nextInt();
            int Ex=sc.nextInt();
            int Ey=sc.nextInt();
            if(Sx==Ex || Sy==Ey){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
        // your code goes here
    }
}
