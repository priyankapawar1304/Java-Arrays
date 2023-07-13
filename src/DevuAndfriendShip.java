

import java.util.*;
import java.lang.*;
import java.io.*;


class DevuAndFriendShip
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int count=0;
            int[]days=new int[n];
            for(int i=0;i<n;i++){
                days[i]=sc.nextInt();

            }
            Arrays.sort(days);
            for(int i=0;i<n-1;i++){
                if(days[i]!=days[i+1]){
                    count++;
                }
            }
            System.out.println(count+1);

        }

    }
}
