import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class QuestionAnswererTest {

    private final QuestionAnswerer answerer = new QuestionAnswerer();

    @Test
    public void should_return_an_unknown_query_message_when_the_query_is_unrecognized() {
        assertThat(answerer.answer("Invalid query"), equalTo("Unknown query 'Invalid query'"));
    }
}
