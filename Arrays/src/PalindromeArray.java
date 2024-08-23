public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("welcome to our palindrome checker");
        int[] numArr = Arrayutility.inputArray();
        boolean isPalin = isPalindrome(numArr);
        if (isPalin){
            System.out.println("the number is palindrome");
        }
        else {
            System.out.println("the number is not palindrome");
        }

    }
    public static boolean isPalindrome(int[] numArr){
        int i=0;
        while (i<numArr.length/2){
            if (numArr[i] !=numArr[numArr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
