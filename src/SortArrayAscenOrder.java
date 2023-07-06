import java.util.*;
public class SortArrayAscenOrder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={6,8,3,1,60,88,44};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }


    }
}
