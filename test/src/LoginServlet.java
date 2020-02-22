import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String logo = null;

        System.out.println("name: " + name);
        System.out.println("password: " + password);
        if("111".equals(name)&&"123".equals(password)){
            logo = "<div style='color:green'>登陆成功</div>";
        }
        else{
            logo =  "<div style='color:red'>登陆失败</div>";
        }
        PrintWriter p = response.getWriter();
        p.println(logo);


    }
}
