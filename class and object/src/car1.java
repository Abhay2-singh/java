public class car1 {

    float price;
    String color;

    car1(){
        price = 35000;
        color = "black";
    }

    public static void main(String[] args) {
        car1 swift = new car1();
//        swift
        System.out.println(swift.color);
        System.out.println(swift.price);
        System.out.println("vikas is driving a car and the name of the car is " + swift);
    }
}
