import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class PhoneNumberTest {

    @Test(expected = NullPointerException.class)
    public void fails_to_create_if_null_value() {
        new PhoneNumber(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fails_to_create_if_length_isnt_11() {
        new PhoneNumber("123456789");
    }

    @Test
    public void is_mobile_number_if_begins_with_07() {
        final PhoneNumber phoneNumber = new PhoneNumber("07123456789");
        assertThat(phoneNumber.isMobileNumber(), is(true));
    }

    @Test
    public void is_not_mobile_number_if_it_does_not_begin_with_07() {
        final PhoneNumber phoneNumber = new PhoneNumber("00123456789");
        assertThat(phoneNumber.isMobileNumber(), is(false));
    }
}
