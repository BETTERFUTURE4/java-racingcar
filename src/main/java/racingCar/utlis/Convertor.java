package racingCar.utlis;

public class Convertor {
	public static final String REGEX = ",";

	public String[] separateNamesByDelimiter(String names) {
		return names.split(REGEX);
	}
}
