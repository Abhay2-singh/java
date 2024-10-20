public class Overloading {
    public int sum(int x ,int y){
        return  x+y;
    }
    public int sum(int x,int y,int z){
        return x+y+z;
    }

    public static void main(String[] args) {
        System.out.println("welcome to our function overlaoding programme");
        Overloading overload=new Overloading();
        System.out.println(overload.sum(5,3));
        System.out.println(overload.sum(6,12));
    }
}
