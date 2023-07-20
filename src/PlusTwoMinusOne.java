
import java.util.*;
import java.lang.*;
import java.io.*;
class PlusTwoMinusOne
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int Y=sc.nextInt();
            if(Y>0){
                System.out.println(Y*3);
            }
            else{
                System.out.println(1);
            }
        }

    }
}
