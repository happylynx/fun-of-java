package playground.simple;

public class Main {
    public static void main(String[] args) {
        new Car().steer(new SteeringWheel());
    }

}

interface Vehicle<T extends SteeringDevice<U, T>, U extends Vehicle<T, U>> {
    default void steer(T steeringDevice) {}
}

interface SteeringDevice<T extends Vehicle<U, T>, U extends SteeringDevice<T, U>> {
    default void turn() {
        T vehicle = null;
        (vehicle).steer((U) this);
    }
}

class Car implements Vehicle<SteeringWheel, Car> {}

class SteeringWheel implements SteeringDevice<Car, SteeringWheel> {}
