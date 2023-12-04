package Works;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Create_Target_Array_in_the_Given_Order_1389 {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        List<Integer> ans = new ArrayList<Integer>();
// This code explains that with the help of array list we can insert an element easily
//        System.out.println(Arrays.toString(nums));
//        List<Integer> Lis = new ArrayList<Integer>();
//        for(int i=0;i<nums.length;i++){
//            Lis.add(nums[i]);
//        }
//        Lis.add(4,5);
//        System.out.println(Lis);
        for(int i=0;i< nums.length;i++){
            ans.add(index[i],nums[i]);
        }
        int answer[] = new int[nums.length];
        for(int i=0;i<answer.length;i++){
            answer[i] = ans.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
