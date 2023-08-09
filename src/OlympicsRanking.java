import java.util.*;
class OlympicsRanking
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int G1=sc.nextInt();
            int S1=sc.nextInt();
            int B1=sc.nextInt();
            int G2=sc.nextInt();
            int B2=sc.nextInt();
            int S2=sc.nextInt();
            int c1=G1+S1+B1;
            int c2=G2+S2+B2;
            if(c1>c2){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }
        }
        // your code goes here
    }
}
