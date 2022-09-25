import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;

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
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story("Invisible Monsters", "Chuck Palahniuk", 4.8));
        stories.add(new Story("Under the Dome", "Stephen King", 4.6));
        stories.add(new Story("Three comrades", "Remark", 4.8));
        stories.add(new Story("The Thanatonauts", "Bernard Werber", 4.9));
        stories.add(new Story("The Three Musketeers", "Alexandre Dumas", 4.7));
        stories.add(new Story("Graf Monte-Cristo", "Alexandre Dumas", 5.0));
        stories.add(new Story("The Brothers Karamazov", "Fyodor Dostoevsky", 4.8));
        stories.add(new Story("Choke", "Chuck Palahniuk", 4.7));
        stories.add(new Story("Arch of Triumph", "Remark", 4.8));
        stories.add(new Story("The catcher in the rye", "Jerome Salinger", 4.6));
        for (int i = 0; i < stories.size(); i++) {
            res.getWriter().println(stories.get(i).toString());
        }
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
