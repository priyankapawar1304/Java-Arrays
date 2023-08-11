import java.util.*;
import java.util.Arrays;
class MissingNumberInArray {
    public static int findMissing(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==i+1){
                continue;
            }
            else{
                return i+1;
            }
        }
        return n;

    }
    public static void main(String[] args){
        int[] arr={1,2,3,5,6};
        int number=findMissing(arr);
        System.out.println(number);
    }
}
