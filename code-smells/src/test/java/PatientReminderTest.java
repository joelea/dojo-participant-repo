import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import tell.dont.ask.EmailService;
import tell.dont.ask.Patient;


public class PatientReminderTest {
    private static final String EMAIL_ADDRESS = "an@email.address";
    private final Patient emailPatient = new Patient();
    private final EmailService emailService = mock(EmailService.class);

    @Test public void
    a_patient_with_an_email_address_receives_an_email() {
        emailPatient.setEmailAddress(EMAIL_ADDRESS);

        PatientReminder reminder = new PatientReminder(emailService);
        reminder.remind(emailPatient);
        verify(emailService).emailReminderTo(EMAIL_ADDRESS);

    }
}
