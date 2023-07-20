

import java.util.*;
import java.lang.*;
import java.io.*;


class AdaOnCrayons
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            String S=sc.next();
            int count=0;
            for(int j=0;j<S.length()-1;j++){
                if(S.charAt(j)!=S.charAt(j+1)){
                    count++;
                }
            }
            System.out.println((count+1)/2);
        }
        // your code goes here
    }
}
