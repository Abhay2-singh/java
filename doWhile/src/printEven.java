public class printEven {
    public static void main(String[] args) {
        System.out.println("welcome to our programme");
        for (int i=1; i<=100; i++){
            if (i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
