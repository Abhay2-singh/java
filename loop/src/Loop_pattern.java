import java.util.Scanner;

public class Loop_pattern {
    public static void main(String[] args) {
        System.out.println("welcome to our pattern programme");
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number of rows=");
        int rows=input.nextInt();
        PrintFirstpattern(rows);
        PrintSecondpattern(rows);
        PrintThirdpattern(rows);
    }
    public static void PrintThirdpattern(int Maxrows){
        System.out.println("\nHere is left half pyramid");
        int rows=Maxrows;
        while (rows>0){
            //this loop print spaces
            int j=0;
            while (j<rows-1){
                System.out.print("  ");
                j++;
            }
            //this loop print star
            int i=0;
            while (i<=(Maxrows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }

    }
    public static void PrintSecondpattern(int Maxrows){
        System.out.println("\nHere is reverse half pyramid");
        int rows=Maxrows;
        while (rows>0){
            int i=0;
            while (i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }

    }
    public static void PrintFirstpattern(int Maxrows){
        System.out.println("\nHere is right half pyramid");
        int row=0;
        while (row<Maxrows){
            System.out.print("*");
            int i=0;
            while (i<row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }

    }
}
