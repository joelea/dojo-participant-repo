import tell.dont.ask.EmailService;
import tell.dont.ask.Patient;


public class PatientReminder {

    private final EmailService emailService;

    public PatientReminder(EmailService emailService) {
        this.emailService = emailService;
    }

    public void remind(Patient emailPatient) {
        emailService.emailReminderTo(emailPatient.getEmailAddress());
    }

}
