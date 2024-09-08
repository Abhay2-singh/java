public class Car {
    int noOfWheel;

    int noOfDoor;

    int maxSpeed;

    String name;

    String modelNumber;

    String company;

    public Car(int noOfWheel,int noOfDoor,int maxSpeed,String name,String modelNumber,String company) {
        this.noOfWheel = noOfWheel;
        this.noOfDoor=noOfDoor;
        this.maxSpeed=maxSpeed;
        this.name=name;
        this.modelNumber=modelNumber;
        this.company=company;
    }

//    @Override
//    public String toString() {
//        return "my car name is " + name;
//    }


    @Override
    public String toString() {
        return "Car{" +
                "noOfWheel=" + noOfWheel +
                ", noOfDoor=" + noOfDoor +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car swift=new Car(4,4,100,"swift","78fw7","honda");
        System.out.println(swift);

    }
}
