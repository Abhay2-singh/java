public class continueLoop {
    public static void main(String[] args) {
        System.out.println("welcome to our programme");
        System.out.println("before loo");
        for (int i=0; i<=10; i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("out of the loop");
    }
}
