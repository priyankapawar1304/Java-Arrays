import java.util.*;
public class AdjacantSumAndParity {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            int sum=0;
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
                sum+=a[j];
            }
            if(sum%2==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
        // your code goes here
    }
}
