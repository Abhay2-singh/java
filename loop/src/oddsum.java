import java.util.Scanner;

public class oddsum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our oddsum");
        System.out.println("please enter the first nnumber=");
        int num=input.nextInt();
        int sum=oddsum(num);
        System.out.println("the oddsum till" + num + "is: "+ sum);

    }
    public static  int oddsum(int num){
        int sum=0;
        int i=1;
        while (i<=num){
            sum=sum+i;
            i=i+2;
        }
        return sum;
    }
}
