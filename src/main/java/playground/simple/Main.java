package playground.simple;

public class Main {
    public static void main(String[] args) {
        new Car().steer(new SteeringWheel());
    }

}

interface Vehicle<T extends SteeringDevice<? extends Vehicle<T>>> {
    default void steer(T steeringDevice) {}
}

interface SteeringDevice<U extends Vehicle<? extends SteeringDevice<U>>> {
    default void turn() {
        U vehicle = null;
        ((Vehicle) vehicle).steer(this);
    }
}

class Car implements Vehicle<SteeringWheel> {}

class SteeringWheel implements SteeringDevice<Car> {}
