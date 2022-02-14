package racingCar.controller;

import static racingCar.view.Output.printStartMessage;

import racingCar.controller.service.RacingCarsService;
import racingCar.controller.service.RequestService;
import racingCar.model.RacingCars;
import racingCar.model.RoundCount;
import racingCar.view.Output;

public class GameController {
    public final RacingCars cars;
    public final RoundCount roundCount;

    public GameController() {
        RacingCarsService carsService = new RacingCarsService();
        this.cars = carsService.initiateCars(RequestService.requestNames());
        this.roundCount = carsService.initiateCount(RequestService.requestCount());
    }

    public GameController(String name, int count) {
        RacingCarsService carsService = new RacingCarsService();
        this.cars = carsService.initiateCars(name);
        this.roundCount = carsService.initiateCount(count);

    }

    public void run() {
        playGame();
        endGame();
    }

    public void playGame() {
        printStartMessage();
        goRound();
        if (roundCount.isFinish()) {
            return;
        }
        playGame();
    }

    public void goRound() {
        cars.go();
        roundCount.minusOne();
        Output.printRoundResult(cars.get());
    }

    public void endGame() {
        Output.printWinner(cars.getSamePositionCars(cars.getMaxPosition()));
    }
}