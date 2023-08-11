import java.util.*;
public class FindDulicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<n-1;i++){
                if(arr[i]==arr[i+1]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
