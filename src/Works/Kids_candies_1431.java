package Works;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kids_candies_1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> ans = new ArrayList<Boolean>();
        int lar = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>lar){
                lar=candies[i];
            }
            candies[i]= candies[i]+extraCandies;
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]>=lar){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        System.out.println(ans);
    }
}
