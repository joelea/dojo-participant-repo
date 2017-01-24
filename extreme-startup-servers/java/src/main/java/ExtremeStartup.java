import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExtremeStartup extends HttpServlet {

    private QuestionAnswerer answerer = new QuestionAnswerer();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String query = req.getParameter("q");
        System.out.println("A request has arrived:");
        System.out.println(query);

        final String answer = answerer.answer(query);
        resp.getWriter().write(answer);
    }
}
