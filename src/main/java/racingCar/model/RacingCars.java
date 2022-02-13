package racingCar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import racingCar.validator.NameValidator;

public class RacingCars {
	private final List<Car> cars = new ArrayList<>();

	public RacingCars(List<String> cars) throws Exception {
		NameValidator.validateNameList(cars);
		for (String car : cars) {
			this.cars.add(new Car(car));
		}
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}
	public void GoRound() {
		for (Car car : cars) {
			car.go();
		}
	}

	public String getRoundResult() {
		StringBuilder result = new StringBuilder();
		for (Car car : cars) {
			result.append(car.getStateString());
		}
		return result.toString();
	}

	public ArrayList<Integer> getPositions() {
		ArrayList<Integer> positions = new ArrayList<>();
		for (Car car : cars) {
			positions.add(car.getPosition());
		}
		return positions;
	}

	public List<String> getSamePositionCars(int position) {
		return cars
			.stream()
			.filter(car -> car.isSamePosition(position))
			.map(Car::getName)
			.collect(Collectors.toList());
	}
}
