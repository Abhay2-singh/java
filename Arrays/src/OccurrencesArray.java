import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our array occurrences");
        int[] arr=Arrayutility.inputArray();
        System.out.println("Enter the number you want to find=");
        int num =  input.nextInt();
        int Occurrences = noOFOccurrences(arr,num);
        System.out.println("your element was found " + Occurrences  +  "times in the array");
    }
    public static int noOFOccurrences(int[] arr,int num){
        int occ=0;
        int i=0;
        while (i<arr.length){
            if (arr[i]==num){
                occ++;
            }
            i++;
        }
        return occ;

    }
}
