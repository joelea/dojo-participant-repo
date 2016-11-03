import tell.dont.ask.EmailService;
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
        PhoneNumber phoneNumber = patient.getPhoneNumber();

        if (phoneNumber == null) {
            return;
        }

        if(phoneNumber.isMobileNumber()) {
            phoneService.sendTextReminderTo(phoneNumber.getValue());
        } else {
            phoneService.callWithReminder(phoneNumber.getValue());
        }
    }

    private void remindViaEmailIfTheyHaveEmailAddress(Patient patient) {
        String emailAddress = patient.getEmailAddress();

        // Email addresses are null when the patient doesn't have one
        if (emailAddress != null) {
            emailService.emailReminderTo(emailAddress);
        }
    }
}
