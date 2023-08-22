

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ProcessingAString
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            String s=sc.next();
            int sum=0;
            for(int i=0;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
                }
            }
            System.out.println(sum);

        }
        // your code goes here
    }
}
