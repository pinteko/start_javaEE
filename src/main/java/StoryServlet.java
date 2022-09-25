import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "StoryServlet", urlPatterns = "/story")
public class StoryServlet implements Servlet {

    private static Logger log = LoggerFactory.getLogger(StoryServlet.class);
    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest reg, ServletResponse res) throws ServletException, IOException {
        log.info("start request");
        res.getWriter().println("<h1>fuck putin</h1>");
        log.info("end request");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        log.info("Servlet done!");
    }
}
