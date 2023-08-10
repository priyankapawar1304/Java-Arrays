import java.util.*;
import java.lang.*;
import java.io.*;
public class TwoRanges {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=sc.nextInt();
            int D=sc.nextInt();
            HashSet<Integer> set=new HashSet<>();
            for(int i=A;i<=B;i++){
                set.add(i);
            }
            for(int i=C;i<=D;i++){
                set.add(i);
            }
            System.out.println(set.size());
        }
    }
}
