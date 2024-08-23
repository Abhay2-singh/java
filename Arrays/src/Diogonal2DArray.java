public class Diogonal2DArray {
    public static void main(String[] args) {
        System.out.println("welcome to Diogonal sum");
        int[][] numArr = Arrayutility.input2DArray();
        long sum = sumofDiagonals(numArr);
        System.out.println("sum of diagonal is " + sum);

    }
    public static long sumofDiagonals(int[][] numArr){
        long leftSum=sumofLeftDiagonal(numArr);
        long rightSum=sumofRightDiagonal(numArr);
        long sum=leftSum+rightSum;
        if (numArr.length % 2!=0){
            int ind =numArr.length/2;
            sum-=numArr[ind][ind];
        }
        return sum;
    }
    public static long sumofLeftDiagonal(int[][] numArr){
        long sum =0;
        int i=0;
        while (i<numArr.length){
            sum+=numArr[i][i];
            i++;
        }
        return sum;
    }
    public static long sumofRightDiagonal(int[][] numArr){
        int sum=0;
        int i=0;
        while (i< numArr.length){
            int col= numArr.length-1-i;
            sum+=numArr[i][col];
            i++;
        }
        return sum;
    }
}
