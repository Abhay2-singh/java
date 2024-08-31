public class MaxArray {
    public static void main(String[] args) {
        System.out.println("welcome to our programme");
        int[] arr=ArrayUtility.inputArray();
        int max=Integer.MIN_VALUE;
        for (int num : arr){
            if (max<num){
                max=num;
            }
        }
        System.out.println("maximum number is " + max);
    }
}
