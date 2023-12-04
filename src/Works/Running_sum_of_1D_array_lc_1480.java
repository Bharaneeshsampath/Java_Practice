package Works;

public class Running_sum_of_1D_array_lc_1480 {
    public static void main(String[] args) {
        int[]nums = {1,2,4,5};
        int sum=0;
        int []ans = new int[nums.length];
        for(int i=0;i< nums.length;i++){
            sum=sum+nums[i];
            ans[i]=sum;
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
