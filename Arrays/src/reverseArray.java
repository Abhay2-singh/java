public class reverseArray {
    public static void main(String[] args) {
        System.out.println("welcome to our array reverse programme");
        int[] numArr = Arrayutility.inputArray();
        Reverse(numArr);
        System.out.println("Your reverse array is");
        Arrayutility.displayArray(numArr);


    }
    public static void Reverse(int[] arr){
        int i=0;
        while (i<arr.length/2){
            int swap =arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
            i++;
        }
        return;
    }
}
