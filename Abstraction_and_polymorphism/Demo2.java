package Abstraction_and_polymorphism;

public class Demo2 {
    public static void main(String[] args) {
        Car car1 = new FuelCar();
        car1.accelerate();
        car1.brake();
    }
}

interface Car {
    void accelerate();

    void brake();
}

class FuelCar implements Car {

    @Override
   public void accelerate() {
        System.out.println("Fuel car is accelerating");
    }

    @Override
   public void brake() {
        System.out.println("Fuel car is stopping");
    }

}

class ElectricCar implements Car {
    @Override
   public void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
   public void brake() {
        System.out.println("Electric car is stopping");
    }

}