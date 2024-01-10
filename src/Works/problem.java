package Works;

public class problem {
    public static void main(String[] args) {
        int sum = 134;
        System.out.println(count(sum));
    }
    static int count(int num){
        int sum=0;
        while(num>0){
            int tem = num%10;
            sum=sum+tem;
            num = num/10;
        }
        return sum;
    }
}
