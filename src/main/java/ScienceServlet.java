import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ScienceServlet", urlPatterns = "/science")
public class ScienceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("ContextPath: " + req.getContextPath());
        resp.getWriter().println("Header: " + req.getHeader("application-type"));
        resp.getWriter().println("Method: " + req.getMethod());
    }
}
