package arrays;

public class array005_sum {
    public static void main(String[] args) {
        int[] num = {12,24, 8};
        int sum=0;
        for(int i=0; i<num.length;i++){
            sum = sum+ num[i];
        }
        System.out.println(sum);

        int sum1=0;
        for(int n : num){
            sum1 = sum1 +n;
        }
        System.out.println(sum1);

    }
}
