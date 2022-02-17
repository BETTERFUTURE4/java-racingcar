package racingCar.view;

import java.util.LinkedHashMap;
import java.util.List;

public class OutputView {
    private static final String RESULT_FRONT_MESSAGE = System.lineSeparator() + "실행 결과";
    private static final String WINNER_REGEX = ", ";
    private static final String WINNER_RESULT_LAST_MESSAGE = "가 최종 우승했습니다.";
    private static final String ROUND_REGEX = " : ";
    private static final String POSITION_SIGNATURE = "-";

    public static void printStartMessage() {
        System.out.println(RESULT_FRONT_MESSAGE);
    }

    public static void printRoundResult(LinkedHashMap<String, Integer> cars) {
        cars.forEach((carName, carPosition) -> System.out.println(
                carName + ROUND_REGEX + POSITION_SIGNATURE.repeat(carPosition)));
        System.out.println();
    }

    public static void printWinner(List<String> winnerCars) {
        StringBuilder Result = new StringBuilder();
        for (String winnerCar : winnerCars) {
            Result.append(winnerCar).append(WINNER_REGEX);
        }
        System.out.println(Result.substring(0, Result.length() - 2) + WINNER_RESULT_LAST_MESSAGE);
    }
}