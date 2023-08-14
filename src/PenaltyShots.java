

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PenaltyShots
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0)
        {
            int team1=0, team2=0;
            for(int i=1; i<=10; i++)
            {
                int a= sc.nextInt();
                if(i%2!=0)
                    team1+=a;
                else
                    team2+=a;
            }
            if(team1>team2)
                System.out.println(1);
            else if(team1<team2)
                System.out.println(2);
            else
                System.out.println(0);
        }

    }
}