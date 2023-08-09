

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PeacefulParty
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int Pa=sc.nextInt();
            int Pb=sc.nextInt();
            int Pc=sc.nextInt();
            if((Pa+Pc)>Pb){
                System.out.println(Pa+Pc);
            }
            else{
                System.out.println(Pb);
            }
        }
        // your code goes here
    }
}
