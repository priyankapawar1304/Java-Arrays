

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HowManyMaximums
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            String S=sc.next();
            int last=0;
            int count=1;
            int curr;
            for(int i=0;i<N-1;i++){
                curr=S.charAt(i)-'0';
                if(curr<last){
                    count++;
                }
                last=curr;
            }
            System.out.println(count);
        }
        // your code goes here
    }
}
