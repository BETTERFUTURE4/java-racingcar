package racingCar.model;

public class CarDTO {
    public String name;
    public int position;

    public CarDTO(Car car) {
        this.name = car.name.toString();
        this.position = car.position.get();
    }
}