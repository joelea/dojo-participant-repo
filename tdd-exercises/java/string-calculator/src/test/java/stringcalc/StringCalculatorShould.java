package stringcalc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorShould {
    @Test
    public void return_0_for_the_empty_string() {
        int total = StringCalculator.calculate("");
        assertThat(total).isEqualTo(0);
    }
}
