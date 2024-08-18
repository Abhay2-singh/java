public class TwodimensionalArray {
    public static void main(String[] args) {
        System.out.println("welcome to our 2D array");
        int[][] arr = {{2,3,4},{5,6,7}};
//        System.out.println(arr[0].length);
        int i=0;
        while (i<arr.length){
            int j=0;
            while (j<arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
