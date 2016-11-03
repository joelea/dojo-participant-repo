public class Patient {

    private EmailAddress email;
    private PhoneNumber phoneNumber;

    public void setEmailAddress(EmailAddress email) {
        this.email = email;
    }

    public EmailAddress getEmailAddress() {
        return email;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

}
