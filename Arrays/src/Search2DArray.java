import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("\nwelcome to 2D search");
        int[][] numArr = Arrayutility.input2DArray();
        System.out.println("please enter the number you want to search");
        int num =input.nextInt();
        boolean isFound = Search(numArr,num);
        if (isFound){
            System.out.println("Number is found");
        }else {
            System.out.println("Number is not found");
        }


    }
    public static boolean Search(int[][] numArr,int num){
        int i=0;
        while (i<numArr.length){
            int j=0;
            while (j<numArr[i].length){
                if (numArr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
