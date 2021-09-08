package jspTest01_20210908_ByunMinHo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JspTest01
 */
@WebServlet(urlPatterns={"/JspTest01"}, initParams= {@WebInitParam(name="job",value="학생")})
public class JspTest01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JspTest01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("EUC-KR");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mail = request.getParameter("mail");
		String job1 = request.getParameter("job");
		String job2 = getInitParameter("job");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("아이디 : "+id+"<br/>");
		writer.println("비밀번호 : "+pw+"<br/>");
		writer.println("이름 : "+name+"<br/>");
		writer.println("E-mail : "+email+ "@"+ mail + "<br/>");
		writer.println("직업 : "+job1+"<br/>");
		if(job1 =="") {
			writer.println("직업 : "+job2+"<br/>");
		}
		
		writer.println("</body></html>");
		
	}

}
