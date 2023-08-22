


import java.util.*;
import java.lang.*;
import java.io.*;


class WorldChessChampionship
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            String S=sc.next();
            int carl=0;
            int chef=0;
            int Z;
            for(int i=0;i<14;i++){
                Z=S.charAt(i);
                if(Z=='C'){
                    carl+=2;
                }
                else if(Z=='N'){
                    chef+=2;
                }
                else{
                    chef+=1;
                    carl+=1;
                }
            }
            if(chef==carl){
                System.out.println(55*X);
            }
            else if(carl>chef){
                System.out.println(60*X);
            }
            else{
                System.out.println(40*X);
            }
        }
        // your code goes here
    }
}
