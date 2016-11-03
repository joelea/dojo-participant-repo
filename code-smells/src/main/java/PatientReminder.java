import tell.dont.ask.EmailService;
import tell.dont.ask.Patient;
import tell.dont.ask.TextMessageService;


public class PatientReminder {

    private final EmailService emailService;
    private final TextMessageService phoneService;

    public PatientReminder(EmailService emailService, TextMessageService phoneService) {
        this.emailService = emailService;
        this.phoneService = phoneService;
    }

    public void remind(Patient patient) {
        remindViaEmailIfTheyHaveEmailAddress(patient);
        remindViaPhoneIfTheyHaveAPhoneNumber(patient);
    }

    private void remindViaPhoneIfTheyHaveAPhoneNumber(Patient patient) {
        String phoneNumber = patient.getPhoneNumber();

        if (isValidPhoneNumber(phoneNumber)) {
            if(isMobileNumber(phoneNumber)) {
                phoneService.sendTextReminderTo(phoneNumber);
            } else {
                phoneService.callWithReminder(phoneNumber);
            }
        }
    }

    private void remindViaEmailIfTheyHaveEmailAddress(Patient patient) {
        String emailAddress = patient.getEmailAddress();

        // Email addresses are null when the patient doesn't have one
        if (emailAddress != null) {
            emailService.emailReminderTo(emailAddress);
        }
    }

    private boolean isMobileNumber(String phoneNumber) {
        return phoneNumber.startsWith("07");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        // Phone numbers are null when the patient doesn't have one
        return phoneNumber != null && phoneNumber.length() == 11;
    }

}
