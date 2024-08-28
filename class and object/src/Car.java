public class Car {
    int noOfWheel;

    float maxSpeed;

    String color;

    float currentFuelInLiter;

    public void drive(){
        if (currentFuelInLiter==0){
            System.out.println("car is out of fuel");
        }
        else if (currentFuelInLiter<5){
            System.out.println("car is on reserved mode,please refuel");
            currentFuelInLiter--;
        }
        else {
            System.out.println("vikas you can start driving fuel is enough for driving");
            currentFuelInLiter--;
        }
    }
    public void addFuel(float fuel){
        currentFuelInLiter+=fuel;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiter;
    }
}
