package Works;

public class Number_of_good_pairs_lc_1512 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        int good_pairs_count = 0;
        String ans_pairs = "";
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){ // here j=i+1 notifes that all elements in array are checked with other 1 time
                if(nums[i]==nums[j]){
                    good_pairs_count +=1;
                    String str1 = String.valueOf(i);
                    String str2 = String.valueOf(j);
                    ans_pairs = ans_pairs + str1 +" "+ str2+"  ";
                }
            }
        }
        System.out.println(good_pairs_count);
        System.out.println(ans_pairs);
    }
}
