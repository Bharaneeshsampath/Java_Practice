package Works;

public class Subtract_product_sum_1281 {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(product_of_digits(n)-sum_of_digits(n));
    }
    static int sum_of_digits(int num){
        int sum = 0;
        while(num>0){
            int tem = num%10;
            sum = sum+tem;
            num/=10;
        }
        return sum;
    }
    static int product_of_digits(int num){
        int product = 1;
        while(num>0){
            int tem = num%10;
            product = product*tem;
            num/=10;
        }
        return product;
    }
}
