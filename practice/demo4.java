public class demo4 {
    int a,b,c;
    demo4(int x,int y){
        a=x;
        b=y;
    }
    void add(){
        c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        demo4 s=new demo4(30,30);
        demo4 k=new demo4(50,50);
        s.add();
        k.add();
    }
}
