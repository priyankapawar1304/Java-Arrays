import java.util.*;
public class OddEvenInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println("even number"+arr[i]);
            }
            else{
                System.out.println("odd numbers"+arr[i]);
            }
        }
    }
}
