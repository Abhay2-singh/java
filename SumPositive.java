public class SumPositive {
    public static void main(String[] args) {
        System.out.println("welcome to our programme");
        int[] numArr=ArrayUtility.inputArray();
        int sum=0;
        for (int num : numArr){
            if (num<0){
                continue;
            }
            sum=sum+num;
        }
        System.out.println("sum of number is " + sum );
    }
}
