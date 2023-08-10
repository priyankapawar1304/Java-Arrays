

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SaveWaterSaveLife
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int H=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int C=sc.nextInt();
            int a=H*(x+(y/2));
            if(a<=C){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        // your code goes here
    }
}
