import java.util.Scanner;

public class Arrayutility {
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of element=");
        int size=input.nextInt();
        int[] nums = new int[size];
        int i=0;
        while (i<size){
            System.out.println("please enter the no " + (i+1) + ":");
            nums[i]= input.nextInt();
            i++;
        }
        return nums;
    }
}
