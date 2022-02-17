package racingCar.controller;

import racingCar.domain.service.InputValidator;
import racingCar.domain.service.RacingGame;
import racingCar.view.InputView;
import racingCar.view.OutputView;

public class GameController {
    private final RacingGame racingGame;

    public GameController() {
        String names = InputValidator.validate(InputView.getNames());
        String count = InputValidator.validate(InputView.getCount());
        racingGame = new RacingGame(names, count);
    }

    public void run() {
        playGame(racingGame);
        endGame(racingGame);
    }

    private void playGame(RacingGame racingGame) {
        OutputView.printStartMessage();
        playRounds(racingGame);
    }

    private void endGame(RacingGame racingGame) {
        OutputView.printWinner(racingGame.getWinnerCars());
    }

    private void playRounds(RacingGame racingGame) {
        racingGame.go();
        OutputView.printRoundResult(racingGame.getCars().get());
        if (racingGame.getRoundCount().isFinish()) {
            return;
        }
        playRounds(racingGame);
    }
}