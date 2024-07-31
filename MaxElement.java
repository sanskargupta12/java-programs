import java.util.Arrays;
public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1, 45, 29, 11};
        System.out.println(Max(arr));
    }
 static int Max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int MaxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > MaxVal) {
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    }
}
   
