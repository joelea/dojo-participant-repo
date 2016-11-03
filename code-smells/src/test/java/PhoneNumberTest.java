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
}
