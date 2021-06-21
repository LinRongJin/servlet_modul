package servlet;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IndexServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setAttribute("message","hello word");
        response.setContentType("text/html");
        response.getWriter().println("<h1>hello word</h1>");
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {

        doGet(request,response);
    }

    public void destroy(){

    }
}
