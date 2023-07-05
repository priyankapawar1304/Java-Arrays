import java.util.*;

class ChefAndDolls
{
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int []a=new int[n+1];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a, 0, n);
            for(int j=0;j<n+1;j=j+2)
            {
                if(a[j]!=a[j+1]){
                    System.out.println(a[j]);
                    break;
                }
            }

        }
    }
}
