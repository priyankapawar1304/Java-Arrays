

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FuelCheaper
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){

            int X=sc.nextInt();
            int Y=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            int K=sc.nextInt();
            for(int i=0;i<K;i++){
                X=X+A;
                Y=Y+B;
            }
            if(X>Y){
                System.out.println("DIESEL");
            }
            else if(X<Y){
                System.out.println("PETROL");
            }
            else{
                System.out.println("SAME PRICE");
            }
        }
    }
}