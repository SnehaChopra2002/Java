package Java;
import java.util.Scanner;
public class SumOfArrayElementsExceptCurrentIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] arr = {1,2,3,4,5,6};
        int[] result= new int[6];
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        for (int i = 0; i < result.length; i++) {
            result[i]=sum-arr[i];
            System.out.print(result[i]+" ");
        }
    }
}
