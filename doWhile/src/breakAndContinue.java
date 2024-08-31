public class breakAndContinue {
    public static void main(String[] args) {
        System.out.println("before loop");
        for (int i=0; i<=1000; i++){
            if (i==101){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of the loop");
    }
}
