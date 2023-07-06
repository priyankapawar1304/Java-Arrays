import java.util.*;
//public class SortArray {
//    public static void main(String[] args){
//        int[]A={4,1,886,44,6,2};
//        Arrays.sort(A);
//        for(int i=0;i<A.length;i++){
//            System.out.println(A[i]);
//        }
//    }
//}
import java.util.*;
public class SortArray{
    public static int calculateSecondLargest(int[] A,int total){
        Arrays.sort(A);
        return A[total-2];
    }
    public static void main(String[] args){
        int[]A={3,66,21,777,54,654,23,2};
        System.out.println(calculateSecondLargest(A,8));
    }
}