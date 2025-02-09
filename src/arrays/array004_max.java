package arrays;

public class array004_max {
    public static void main(String[] args) {
        int[] num = {1,5,7,18,8,9};
        int output = max(num);
        System.out.println(output);

    }
    static int max(int[] num){
       int max= num[0];
       for(int i =0;i< num.length;i++){
           if(max<num[i]){
               max= num[i];
           }
        }
       return max;
    }

}
