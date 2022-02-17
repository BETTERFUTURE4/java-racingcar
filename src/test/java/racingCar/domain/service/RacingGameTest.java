package racingCar.domain.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingCar.domain.CarDto;

@SuppressWarnings("NonAsciiCharacters")
public class RacingGameTest {
    private RacingGame racingGame;

    @BeforeEach
    void setup() {
        racingGame = new RacingGame("juri,hunch", "5");
    }

    @Test
    void 생성자_cars_값이_들어가는지_테스트() {
        //when
        List<String> names = new ArrayList<>();
        for (CarDto carDTO : racingGame.getCars().get()) {
            names.add(carDTO.name);
        }

        //then
        assertThat(names).isEqualTo(Arrays.asList("juri","hunch"));
    }

    @Test
    void 생성자_roundCount_값이_들어가는지_테스트() {
        assertThat(racingGame.getRoundCount().get()).isEqualTo(5);
    }

    @Test
    void getWinnerCars_우승자_찾기_테스트() {
        //given
        racingGame.go();
        racingGame.go();

        //when
        int max = racingGame.getCars().getMaxPosition();
        List<CarDto> result = racingGame.getCars().get()
                .stream()
                .filter(carDTO -> carDTO.position == max)
                .collect(Collectors.toList());

        //then
        assertThat(result)
                .isEqualTo(racingGame.getWinnerCars());
    }
}