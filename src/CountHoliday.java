
import java.util.*;
        import java.lang.*;
        import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class CountHoliday
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int count=0;
            for(int i=0;i<N;i++){
                int a=sc.nextInt();

                if(a%7!=0 && (a+1)%7!=0){
                    count++;
                }

            }
            System.out.println(8+count);
        }
    }
}
