

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EndlessAprtizers
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int R=sc.nextInt();
            int plate=0;
            int extraSticks=R/30;
            while(extraSticks>0){
                plate++;
                extraSticks-=Math.min(extraSticks,Y);
            }
            System.out.println(plate);
        }
    }
}
