
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RemoveBadElements
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] A=new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            Arrays.sort(A);
            int max=0;
            int count=1;
            for(int j=0;j<N-1;j++){
                if(A[j]==A[j+1]){
                    count++;
                }
                else{
                    count=1;
                }
                if(count>max){
                    max=count;
                }
            }
            System.out.println(N-max);
        }
        // your code goes here
    }
}
