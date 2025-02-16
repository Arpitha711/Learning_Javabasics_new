package Feb9_task;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        System.out.println("Before sorting "+ Arrays.toString(numbers));
        sort(numbers);
        System.out.println("After sorting " + Arrays.toString(numbers));

    }
    static void sort(int[] numbers){
        int n = numbers.length;
        boolean swapped;
        for(int i=0; i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(numbers[j]> numbers[j+1]){
                    int temp= numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1]= temp;
                    swapped= true;
                }
            }

        }
    }


    }


