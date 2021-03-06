package com.dago;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.client.FindIterable;

@WebServlet("/ricercaModello")
public class RicercaModelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RicercaModelloServlet() {}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Reading post parameters from the request
		String par = request.getParameter("modello").toLowerCase(); 
		System.out.println(par);		

		// Checking for null and empty values
		if(par == null || "".equals(par)) {
			request.setAttribute("error_message", "Inserisci il modello");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
			List<String> lista = new ArrayList<String>();
			FindIterable<Document> cursor = DB.ricercaModelloAuto(par);
			for(Document doc: cursor) {
				lista.add(doc.getString("marca") + " " + doc.getString("modello") + " " + doc.getString("colore") + " (id: " + doc.getInteger("id").toString() + ")");
			}
			System.out.println(lista);	
			if(lista.size() != 0) {
				request.setAttribute("lista", lista);
				request.getRequestDispatcher("/ricerca.jsp").forward(request, response);
			}
			else {
				request.setAttribute("message", "Nessuna auto trovata con la ricerca del modello: " + par);
				request.getRequestDispatcher("/ricerca.jsp").forward(request, response);
			}
		}
	}		

}
