public class Pattern {
    public static void main(String[] args) {
        printpatterna();

    }
    public static void printpatterna(){

        int rows=0;
        while (rows<5){
            System.out.println("*");
            int i=0;
            while (i<rows){
                System.out.println(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}