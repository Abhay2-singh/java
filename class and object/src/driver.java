public class driver {
    public static void main(String[] args) {
        Car myCar = new Car();
//        myCar.drive();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());//object calling
    }
}
