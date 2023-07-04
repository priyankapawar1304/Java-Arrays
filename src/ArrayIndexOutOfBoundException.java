import java.util.*;
public class ArrayIndexOutOfBoundException {
    public static void main(String[] args){
        int[] arr={1,5,99,33};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
