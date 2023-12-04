package Works;

public class Concatenation_of_array_LC_1929 {
    public static void main(String[] args) {
        int [] nums = {1,2,1};
        int [] ans = new int[nums.length*2];
        for (int i =0;i< ans.length;i++){
            ans[i] = nums[i% nums.length];
        }
    for(int i:ans){
        System.out.print(i+" ");
    }
    }
}