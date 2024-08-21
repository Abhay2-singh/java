public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("welcome to our  array sorted programme");
        int[] numArr = Arrayutility.inputArray();
        boolean isInc = isIncresing(numArr);
        boolean isDec = isDecreasing(numArr);
        if (isInc || isDec){
            System.out.println("your array is sorted");
        }
        else {
            System.out.println("your array is not sorted");
        }

    }
    public static boolean isDecreasing(int[] numArr){
        int i=1;
        while (i<numArr.length){
            if (numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isIncresing(int[] numArr){
        int i=1;
        while (i<numArr.length){
            if (numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
