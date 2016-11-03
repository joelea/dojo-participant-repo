import com.google.common.base.Preconditions;

public class EmailAddress {
    private final String value;

    public EmailAddress(String value) {
        this.value = Preconditions.checkNotNull(value);
    }

    public String getValue() {
        return value;
    }
}
