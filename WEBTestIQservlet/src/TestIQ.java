

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestIQ
 */
@WebServlet("/TestIQ")
public class TestIQ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public TestIQ() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    private int checkTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	int count = 0;
    	if(request.getParameter("intr_1").equals("2")){ count++;}
    	if(request.getParameter("intr_2").equals("2")){count++;} 
    	if(request.getParameter("intr_3").equals("2")){count++;} 
    	if(request.getParameter("intr_4").equals("3")){count++;} 
    	if(request.getParameter("intr_5").equals("1")){count++;} 
    	if(request.getParameter("intr_6").equals("3")){count++;} 
    	if(request.getParameter("intr_7").equals("4")){count++;} 
    	if(request.getParameter("intr_8").equals("2")){count++;}
    	if(request.getParameter("intr_9").equals("1")){count++;}
    	if(request.getParameter("intr_10").equals("2")){count++;} 
    	
    	return count;
    }
    
    private void resultTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out = response.getWriter();
    	int c = checkTest(request, response);
    	if(c == 10){
    				out.println("<h4>Ai raspuns corect la toate intrebarile. </h4>\n" +
    				"<ul>");
    	} else {
    	out.println("<h4>Ai raspuns la destul de multe intrebari si, cu siguranta, cind vezi raspunsurile corecte iti dai seama ca doar neatentia si, poate, graba, te-au facut sa nu stii toate raspunsurile. Raspunsuri corecte:</h4>\n" +
    				"<ul>");
    	}
    	
    	if(request.getParameter("intr_1").equals("2")){
    		out.println("<li class =\"answer\">Ati raspuns corect. Raspunsul dvs. este 16.</li>");
    		
    	} else {
    		out.println("<li class =\"answer\">Ati gresit raspunsul. Raspunsul corect este 16.</li>");
    	}
    	
    	if(request.getParameter("intr_2").equals("2")){
    		out.println("<li class =\"answer\">Ati raspuns corect. Raspunsul dvs. este Veverita.</li>");
    		
    	} else {
    		out.println("<li class =\"answer\">Ati gresit raspunsul. Raspunsul corect este Veverita.</li>");
    	}
    	
    	if(request.getParameter("intr_3").equals("2")){
    		out.println("<li class =\"answer\">Ati raspuns corect. Raspunsul dvs. este 4 kilograme.</li>");
    		
    	} else {
    		out.println("<li class =\"answer\">Ati gresit raspunsul. Raspunsul corect este 4 kilograme.</li>");
    	}
    	
    	if(request.getParameter("intr_4").equals("3")){
    		out.println("<li class =\"answer\">Ati raspuns corect. Raspunsul dvs. este Avion.</li>");
    		
    	} else {
    		out.println("<li class =\"answer\">Ati gresit raspunsul. Raspunsul corect este Avion.</li>");
    	}
    	
    	if(request.getParameter("intr_5").equals("1")){
    		out.println("<li class =\"answer\">Ati raspuns corect. Raspunsul dvs. este 8 zile (deoarece in a 8-a zi ajunge si abia noaptea coboara iar 2 metri).</li>");
    		
    	} else {
    		out.println("<li class =\"answer\">Ati gresit raspunsul. Raspunsul corect este 8 zile (deoarece in a 8-a zi ajunge si abia noaptea coboara iar 2 metri).</li>");
    	}
    	
    	if(request.getParameter("intr_6").equals("3")){
    		out.println("<li class =\"answer\">Ati raspuns corect. Raspunsul dvs. este Triunghi.</li>");
    		
    	} else{
    		out.println("<li class =\"answer\">Ati gresit raspunsul. Raspunsul corect este Triunghi.</li>");
    	}
    	
    	if(request.getParameter("intr_7").equals("4")){
    		out.println("<li class =\"answer\">Ati raspuns corect. Raspunsul dvs. este niciuna dintre variante (aprinzi primul chibritul).</li>");
    		
    	} else{
    		out.println("<li class =\"answer\">Ati gresit raspunsul. Raspunsul corect este niciuna dintre variante (aprinzi primul chibritul).</li>");
    	}
    	
    	if(request.getParameter("intr_8").equals("2")){
    		out.println("<li class =\"answer\">Ati raspuns corect. Raspunsul dvs. este 7.</li>");
    		
    	} else {
    		out.println("<li class =\"answer\">Ati gresit raspunsul. Raspunsul corect este 7.</li>");
    	}
    	
    	if(request.getParameter("intr_9").equals("1")){
    		out.println("<li class =\"answer\">Ati raspuns corect. Raspunsul dvs. este Da.</li>");
    		
    	} else {
    		out.println("<li class =\"answer\">Ati gresit raspunsul. Raspunsul corect este Da.</li>");
    	}
    	
    	if(request.getParameter("intr_10").equals("2")){
    		out.println("<li class =\"answer\">Ati raspuns corect. Raspunsul dvs. este 23.</li>");
    	} else {
    		out.println("<li class =\"answer\">Ati gresit raspunsul. Raspunsul corect este 23.</li>");
    	}
    }
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 String title = "Test Logic";
		 String docType = "<!DOCTYPE html>";
		 
		 out.println(docType + "<html>\n" + 
				 	"<head>" + 
				 	"<meta charset=\"UTF-8\">" +
				 	"<title>"+ title + "</title>" + 
					"<link href=\"" + request.getContextPath() + "/resources/css/bootstrap.min.css\" rel=\"stylesheet\">" +
					"<link href=\"" + request.getContextPath() + "/resources/css/theme.css\" rel=\"stylesheet\">" +
					"<link href=\"" + request.getContextPath() + "/resources/css/mystyle.css\" rel=\"stylesheet\">" +
					"</head>" +
					
					"<nav class=\"navbar navbar-inverse navbar-fixed-top\">" +
						"<div class=\"container\">" +
							"<div class=\"navbar-header\">" +
								"<a class=\"navbar-brand\" href=\"index.html\">TesteLogica</a>" +
							"</div>" +
						"</div>" +
					"</nav>" +
						
					"<div class=\"container theme-showcase\" role=\"main\">" +
						"<div class=\"jumbotron\">" +
							"<div class=\"row\">");
		 					
		 						this.resultTest(request, response);
		 
		 out.println(		
				 			"</div> " +
						"</div>" +
					"</div>" +
					
					"<footer class=\"footer\">" +
						"<div class=\"container\">" +
							"<p class=\"text-muted\">Done by Sarateanu D.</p>" +
						"</div>" +
					"</footer>" +

						
						"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>" +
						"<script src=\"js/bootstrap.min.js\"></script>"
				 );
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
