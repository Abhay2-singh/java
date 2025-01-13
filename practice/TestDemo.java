 class TestDemo {
    private int a=50,b=10,c;
    void display(){
        c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        TestDemo t;
        t= new TestDemo();
        t.display();
    }
}
