package ch_09_inheritance_ex.ex01;

public class Test {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Truck truck = new Truck();
        Car car = new Car();
        car.setSpeed(10);
        truck.setSpeed(100);
        System.out.println("Car speed: "+car.speed);
        System.out.println("Truck speed: "+truck.speed);
    }
}
