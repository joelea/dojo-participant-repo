package stringcalc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorShould {
    @Test
    public void return_0_for_the_empty_string() {
        int total = StringCalculator.calculate("");
        assertThat(total).isEqualTo(0);
    }

    @Test
    public void return_2_for_just_the_number_2() {
        int total = StringCalculator.calculate("2");
        assertThat(total).isEqualTo(2);
    }

    @Test
    public void return_4_for_just_the_number_4() {
        int total = StringCalculator.calculate("4");
        assertThat(total).isEqualTo(4);
    }
}
