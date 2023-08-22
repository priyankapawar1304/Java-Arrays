

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndString
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            String S=sc.next();
            char[] arr=S.toCharArray();
            int count=0;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]=='x' && arr[i+1]=='y' || arr[i]=='y' && arr[i+1]=='x'){
                    count++;
                    i+=1;
                }


            }
            System.out.println(count);
        }

        // your code goes here
    }
}
