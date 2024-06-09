import static org.mockito.Mockito.*;

import controller.StartServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.io.IOException;

public class StartServletTest {

    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @Mock
    HttpSession session;

    @Mock
    ServletConfig servletConfig;

    @Mock
    ServletContext servletContext;

    @Mock
    RequestDispatcher requestDispatcher;

    StartServlet initServlet;

    @Before
    public void setUp() throws ServletException {
        MockitoAnnotations.openMocks(this);
        initServlet = new StartServlet();
        when(servletConfig.getServletContext()).thenReturn(servletContext);
        when(servletContext.getRequestDispatcher("/index.jsp")).thenReturn(requestDispatcher);
        initServlet.init(servletConfig);
        when(request.getSession(true)).thenReturn(session);
    }

    @Test
    public void testDoGet() throws IOException, ServletException {
        initServlet.doGet(request, response);
        verify(request).getSession(true);
        verify(servletContext).getRequestDispatcher("/index.jsp");
        verify(requestDispatcher).forward(request, response);
    }
}
