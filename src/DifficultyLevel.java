

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DifficultyLevel
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int[] arr=new int[N];
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            int j;

            for(j=1;j<N;j++){
                if(arr[j]<arr[j-1]){
                    System.out.println("No");
                    break;

                }


            }
            if(j==N){
                System.out.println("Yes");
            }

        }

    }

}
