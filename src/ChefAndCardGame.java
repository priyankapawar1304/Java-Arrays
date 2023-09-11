

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndCardGame
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int k=0;k<T;k++){
            int N=sc.nextInt();
            int[] A=new int[N];
            int[] B=new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
                B[i]=sc.nextInt();
            }
            int a=0;
            int b=0;
            for(int i=0;i<N;i++){
                int suma=0;
                int sumb=0;
                while(A[i]>0){
                    suma=suma + A[i]%10;
                    A[i]=A[i]/10;
                }
                while(B[i]>0){
                    sumb=sumb+B[i]%10;
                    B[i]=B[i]/10;
                }
                if(sumb>suma){
                    b++;
                }
                else if(suma>sumb){
                    a++;
                }
                else{
                    a++;
                    b++;
                }
            }
            if(a>b){
                System.out.println(0+" "+a);
            }
            else if(b>a){
                System.out.println(1+" "+b);
            }
            else{
                System.out.println(2+" "+a);
            }

        }
        // your code goes here
    }
}
