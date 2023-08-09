import java.util.*;
class ChefAndSnackdown
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            if(N==2010 || N==2015 || N==2016 || N==2017 || N==2019){
                System.out.println("HOSTED");

            }
            else{
                System.out.println("NOT HOSTED");
            }
        }
        // your code goes here
    }
}
