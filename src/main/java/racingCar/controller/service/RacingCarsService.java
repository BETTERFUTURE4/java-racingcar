package racingCar.controller.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import racingCar.model.Car;
import racingCar.model.RacingCars;
import racingCar.model.RoundCount;
import racingCar.model.utlis.Util;
import racingCar.view.Output;

public class RacingCarsService {
    private RacingCars cars;
    private RoundCount roundCount;

    public RacingCars initiateCars(String nameString) {
        String[] names = Util.separate(nameString);
        return new RacingCars(new ArrayList<>(Arrays.asList(names)));
    }

    public RoundCount initiateCount(int countInput) {
        return new RoundCount(countInput);
    }
}