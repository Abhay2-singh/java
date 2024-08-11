public class Parameter {
    public static void main(String[] args) {
        int num=sumofnumber(5,5);
        System.out.println(num);
    }
    public static  int sumofnumber(int first,int second){
        System.out.println("First number is received="+  first);
        System.out.println("Second number is received="+ second);
        int sum=first+second;
        return sum;

    }
}
