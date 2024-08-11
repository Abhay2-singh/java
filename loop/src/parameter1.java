public class parameter1 {
    public static void main(String[] args) {
        System.out.println(mul(10,5));
        System.out.println(mul(2,5));
        System.out.println(mul(10,2));


    }
    public static int mul(int first,int second){
        System.out.println("First number is received="+ first);
        System.out.println("second number is received="+ second);
        int mul=first*second;
        return mul;
    }
}
