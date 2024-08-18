import java.util.Scanner;

public class QuestionNo40 {
    public static void main(String[] args) {
        System.out.println("welcome to sum of array and average");
        int[] numArray =Arrayutility.inputArray();
        long sum=sum(numArray);
        int avg=avg(numArray);
        System.out.println("the sum of the number is " + sum);
        System.out.println("the average of the number is " + avg);

    }
    public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while (i<numArray.length){
            sum=sum+numArray[i];
            i++;
        }
        return sum;
    }
    public static int avg(int[] numArray){
        long sum=sum(numArray);
        return (int) (sum/numArray.length);
    }
}
