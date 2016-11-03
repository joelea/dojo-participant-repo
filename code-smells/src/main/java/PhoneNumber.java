import com.google.common.base.Preconditions;

public class PhoneNumber {
    private static final int UK_PHONE_NUMBER_LENGTH = 11;

    private final String value;

    public PhoneNumber(String value) {
        Preconditions.checkNotNull(value, "A phone number may not have a null value.");
        Preconditions.checkArgument(
                value.length() == UK_PHONE_NUMBER_LENGTH,
                "A phone number must be 11 characters long."
        );
        this.value = value;
    }

    public boolean isMobileNumber() {
        return value.startsWith("07");
    }

    public String getValue() {
        return value;
    }
}
