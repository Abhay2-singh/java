import java.util.Scanner;

public class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our programme");
        int[] nums=ArrayUtility.inputArray();
        System.out.println("now,please enter the number you want to search");
        int element=input.nextInt();
        int occ=countOccurrences(nums,element);
        System.out.println("your element was found " + occ);
    }
    public static int countOccurrences(int[] nums,int element){
        int occ=0;
        for (int num:nums){
            if (num==element){
                occ++;
            }
        }
        return occ;
    }
}
