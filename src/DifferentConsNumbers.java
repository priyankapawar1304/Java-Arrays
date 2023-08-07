
import java.util.*;
import java.lang.*;
import java.io.*;
class DifferentConsNumbers
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            String s=sc.next();
            int count=0;
            for(int j=1;j<N;j++){
                if(s.charAt(j-1) == s.charAt(j)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}












