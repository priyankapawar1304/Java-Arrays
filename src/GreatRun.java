
import java.util.*;
import java.lang.*;
import java.io.*;

class GreatRun
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while(T-- >0){
            int A = input.nextInt();
            int K = input.nextInt();
            int[] girls = new int[A];
            int sum = 0;
            for(int i = 0; i < A; i++){
                girls[i] = input.nextInt();
                if(i < K){
                    sum+= girls[i];}

            }

            int max = sum;
            int i =0;
            int j = K;
            while(j < A){
                sum-=girls[i];
                i++;
                sum+=girls[j];
                j++;
                if(sum > max){
                    max = sum;
                }
            }
            System.out.println(max);
        }
    }
}
