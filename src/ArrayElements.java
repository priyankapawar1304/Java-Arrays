import java.util.*;
//finding smaller element in array
public class ArrayElements {
    static void min(int[]arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                System.out.println(min);
            }
        }
    }
    public static void main(String[] args){
        int[] arr={4,6,1,9,5};
        min(arr);
    }
}
