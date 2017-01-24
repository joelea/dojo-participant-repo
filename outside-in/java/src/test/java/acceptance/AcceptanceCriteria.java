package acceptance;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Ignore;
import org.junit.Test;

import accounts.Account;

public class AcceptanceCriteria {
    
    private Clock clock;
    private Account account;
    private Printer printer;

    @Ignore
    @Test public void
    account_should_be_able_to_print_out_a_bank_statement_with_the_transactions_in_chronological_order() {
        setToday("01/04/2014");
        account.deposit(1000);

        setToday("02/04/2014");
        account.withdraw(100);

        setToday("01/05/2014");
        account.deposit(500);
        
        account.printStatement();
        
        verify(printer).printLine("DATE | AMOUNT | BALANCE");
        verify(printer).printLine("01/05/2014 | 500 | 1400");
        verify(printer).printLine("02/04/2014 | -100 | 900");
        verify(printer).printLine("01/04/2014 | 1000 | 1000");
        
    }

    private void setToday(String date) {
        when(clock.today()).thenReturn(date);
    }
}
