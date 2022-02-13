package racingCar.model;

import racingCar.utlis.Constants;
import racingCar.utlis.Util;
import racingCar.validator.NameValidator;

public class Car {

	private final String name;
	private int position = 0;

	public Car(String name) throws Exception {
		NameValidator.validateName(name);
		this.name = name;
	}

	public void go() {
		if (Util.getRandomInteger() >= Constants.GO_RANDOM_INTEGER) {
			move();
		}
	}

	public void move() {
		position++;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	public boolean isSamePosition(int position) {
		return this.position == position;
	}

	public String getStateString() {
		return name + Constants.ROUND_REGEX + Constants.POSITION_SIGNATURE.repeat(position) + System.lineSeparator();
	}
}
