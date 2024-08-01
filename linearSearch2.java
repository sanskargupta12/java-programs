// search the target and return the element
public class linearSearch2 {
    public static void main(String[] args) {
	    int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
	    int target = 45;
	    int ans = linearSearch2(nums,target);
	    System.out.println(ans);
    }
	    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element:arr){
            if (element == target){
                return element;
            
            }
        }
        return -1;
    }

}
