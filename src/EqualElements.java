/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EqualElements
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int[] arr=new int[N+1];
            for(int j=0;j<N;j++){
                int b    =sc.nextInt();
                arr[b]++;


            }
            int sum=0;
            for(int j=0;j<N+1;j++){
                if(arr[j]>sum){
                    sum=arr[j];

                }
            }


            System.out.println(N-sum);
        }
    }
}





















