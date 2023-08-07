
import java.util.*;
class CheflandVisa
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X1=sc.nextInt();
            int X2=sc.nextInt();
            int Y1=sc.nextInt();
            int Y2=sc.nextInt();
            int Z1=sc.nextInt();
            int Z2=sc.nextInt();
            if(X2>=X1 && Y2>=Y1 && Z2<=Z1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here
    }
}
