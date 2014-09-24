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
        String emailAddress = patient.getEmailAddress();
        
        if(emailAddress != null) {
            emailService.emailReminderTo(emailAddress);
        }
        
        String phoneNumber = patient.getPhoneNumber();

        if(isValidPhoneNumber(phoneNumber)) {
            phoneService.sendTextReminderTo(phoneNumber);
        }
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null 
            && phoneNumber.length() == 11
            && phoneNumber.startsWith("07");
    }

}