package Works;

import java.util.Arrays;

public class Shuffle_array_1470 {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int ans[] = new int[nums.length];
        int [] ans_m1 = new int [n];
        int [] ans_m2 = new int [n];
        for(int i=0;i< n ;i++){
            ans_m1[i%n]=nums[i];
        }
        for(int i=n;i< nums.length ;i++){
            ans_m2[i%n]=nums[i];
        }
        int index = 0;
        for(int i=0;i< n ;i++){
            ans[index++] = ans_m1[i];
            ans[index++] = ans_m2[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
