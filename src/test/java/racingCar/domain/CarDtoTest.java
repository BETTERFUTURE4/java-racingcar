package racingCar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

@SuppressWarnings("NonAsciiCharacters")
public class CarDtoTest {
    @Test
    void 이름확인() {
        assertThat(new CarDto(new Car("hunch", 0)).name)
                .isEqualTo("hunch");
    }

    @Test
    void position_확인() {
        assertThat(new CarDto(new Car("hunch", 5)).position)
                .isEqualTo(5);
    }
}