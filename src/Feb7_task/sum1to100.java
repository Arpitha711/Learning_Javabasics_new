package Feb7_task;

public class sum1to100 {
    public static void main(String[] args) {
        int n =100;
        int sum=0;
        for(int i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);

        int j =1;
        int sum1=0;
        while(j<=n){
            sum1=sum1+j;
            j++;
        }
        System.out.println(sum1);
    }
}
