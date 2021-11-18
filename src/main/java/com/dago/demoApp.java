package com.dago;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demoApp
 */
@WebServlet("/demo")
public class demoApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public demoApp() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> listaUtenti = new ArrayList<String>();
		listaUtenti.add("User01");
		listaUtenti.add("Utente afk");
		listaUtenti.add("Io sono io");
		listaUtenti.add("E voi non siete");
		request.setAttribute("lista", listaUtenti);
		request.getRequestDispatcher("demo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
