package racingCar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import racingCar.domain.exception.name.NameDuplicatedException;
import racingCar.domain.exception.name.NameOnlyOneException;
import racingCar.domain.moveStratege.NumGenerator;
import racingCar.domain.moveStratege.RandomNumGenerator;

public class Cars {
    private final List<Car> cars = new ArrayList<>();

    public Cars(List<String> cars) {
        validate(cars);
        for (String car : cars) {
            this.cars.add(new Car(car, 0));
        }
    }

    private static void validate(List<String> cars) {
        if (cars.size() <= 1) {
            throw new NameOnlyOneException();
        }
        if (new HashSet<>(cars).size() != cars.size()) {
            throw new NameDuplicatedException();
        }
    }

    public void go() {
        NumGenerator numGenerator = new RandomNumGenerator();
        for (Car car : cars) {
            car.move(numGenerator);
        }
    }

    public int getMaxPosition() {
        ArrayList<Integer> positions = new ArrayList<>();
        for (Car car : cars) {
            positions.add(car.getPosition());
        }
        return Collections.max(positions);
    }

    public List<CarDto> getSamePositionCarsDto(int position) {
        return getDto().stream()
                .filter(car -> car.position == position)
                .collect(Collectors.toList());
    }

    public List<CarDto> getDto() {
        List<CarDto> carsDto = new ArrayList<>();
        for (Car car : cars) {
            carsDto.add(new CarDto(car));
        }
        return carsDto;
    }
}