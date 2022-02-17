package racingCar.domain;

import java.util.Objects;

public class Car {
    private static final int GO_NUM = 4;
    public final Name name;
    public final Position position = new Position();

    public Car(String name) {
        this.name = new Name(name);
    }

    public void go(int number) {
        if (number >= GO_NUM) {
            position.move();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return name.equals(car.name) && position.equals(car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}