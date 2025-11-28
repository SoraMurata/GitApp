import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GitInputServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");

        
        String lastName = request.getParameter("myoji");
        String firstName = request.getParameter("namae");

        
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>あなたの回答</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>あなたの回答</h1>");
        out.println("姓は" + lastName + "ですね。");
        out.println("名は" + firstName + "ですね。");
        out.println("</body>");
        out.println("</html>");
    }
}