import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ExtremeStartupTest {

    private final QuestionAnswerer answerer = new QuestionAnswerer();

    @Test
    public void should_return_an_unknown_query_message_when_the_query_is_unrecognized() {
        assertThat(answerer.answer("Invalid query")).isEqualTo("Unknown query 'Invalid query'");
    }
}
