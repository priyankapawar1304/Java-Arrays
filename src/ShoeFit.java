
import java.util.*;
class ShoeFit
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=sc.nextInt();
            if(A==B){
                if(A==C){
                    System .out.println(0);
                }
                else{
                    System.out.println(1);
                }

            }
            else{
                System.out.println(1);
            }
        }
        // your code goes here
    }
}
