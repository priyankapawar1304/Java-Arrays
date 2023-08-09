

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class UtkarshAndPlacements
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            char[] arr=new char[3];
            for(int i=0;i<3;i++){
                arr[i]=sc.next().charAt(0);
            }
            char X=sc.next().charAt(0);
            char Y=sc.next().charAt(0);
            for(int i=0;i<3;i++){
                if(arr[i]==X){
                    System.out.println(X);
                    break;
                }
                else if(arr[i]==Y){
                    System.out.println(Y);
                    break;
                }

            }

        }
        // your code goes here
    }
}
