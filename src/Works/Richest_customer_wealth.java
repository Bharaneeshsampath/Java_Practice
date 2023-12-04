package Works;

public class Richest_customer_wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2},{0,1},{6,7},{2,4}};
        int large=0;
        for(int i=0;i< accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            if(sum>large){
                large=sum;
            }
        }
        System.out.println(large);
    }
}
