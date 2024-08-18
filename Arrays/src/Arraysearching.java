import java.util.Scanner;

public class Arraysearching {
    public static void main(String[] args) {
        System.out.println("welcome to our array searching");
        Scanner input=new Scanner(System.in);
        int[] array = {2,3,4,5,6,7,8,9,10};
        System.out.print("enter the number=");
        int num= input.nextInt();
        boolean isFound=isFound(array,num);
        if (isFound){
            System.out.println("Your number is found in the array");
        }
        else {
            System.out.println("Your number is not found in the array");
        }


    }
    public  static boolean isFound(int[] array,int num){
        int i=0;
        while (i< array.length){
            if (array[i]==num){
                return true;
            }
            i++;
        }
        return false;
    }
}
