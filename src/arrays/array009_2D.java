package arrays;

public class array009_2D {
    public static void main(String[] args) {
        int[][] array_2d = new int[3][3];
        array_2d[0][0]=90;
        array_2d[0][1]=91;
        array_2d[0][2]=93;
        array_2d[1][0]=1;
        array_2d[1][1]=2;
        array_2d[1][2]=3;
        array_2d[2][0]=4;
        array_2d[2][1]=5;
        array_2d[2][2]=6;
        for(int i=0; i <array_2d.length;i++){
            for(int j=0; j<array_2d[i].length;j++){
                System.out.print(array_2d[i][j]+"|");
            }
            System.out.println();
        }
    }
}
