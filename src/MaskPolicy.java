

import java.util.*;
import java.lang.*;
import java.io.*;


class MaskPolicy
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int A=sc.nextInt();
            if(A<N){
                System.out.println(Math.min(A,N-A));
            }
        }
        // your code goes here
    }
}
