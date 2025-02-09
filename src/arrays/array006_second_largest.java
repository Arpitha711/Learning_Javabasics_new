package arrays;

import java.util.Arrays;

public class array006_second_largest {
    public static void main(String[] args) {
        int[] num = {12,10,67,5};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);
    }
}
