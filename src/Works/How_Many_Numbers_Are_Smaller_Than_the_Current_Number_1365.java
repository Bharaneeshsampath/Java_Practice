package Works;

import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365 {
    public static void main(String[] args) {
        int[]nums = {8,1,2,2,3};
        int [] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){ // here j=0 notifies that all the elements are checked back and fourth
                if (nums[i]>nums[j]){
                    count++;
                }
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
