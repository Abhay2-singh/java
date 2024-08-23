import java.util.Scanner;

public class SumAverage2DArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welco e to our sum and average of 2D array");
        int[][] numArr = Arrayutility.input2DArray();
        long sum = sum(numArr);
        double avg= average(numArr);
        System.out.println("your sum of array " + sum);
        System.out.println("your average of array " + avg);
    }
    public static double average(int[][] numArr){
        if (numArr.length==0){
            return 0;
        }
        int rows = numArr.length;
        int col = numArr[0].length;
        double size =rows*col;
        return sum(numArr) / size;
    }
    public static long sum(int[][] numArr){
        long sum = 0;
        int i=0;
        while (i<numArr.length){
            int j=0;
            while (j<numArr.length){
                sum = sum+numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
