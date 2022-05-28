package it.prova.televisoreweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.televisoreweb.service.MyServiceFactory;

@WebServlet("/ExecuteSearchTelevisoreServlet")
public class ExecuteSearchTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String destinazione = null;

		String marcaDaPagina = request.getParameter("marcaInput");
		String modelloDaPagina = request.getParameter("modelloInput");
		
		if (marcaDaPagina.equals("") && modelloDaPagina.equals("")) {
			String messaggioDaInviareAPagina = "Attenzione! E' necessario valorizzare almeno un campo.";
			request.setAttribute("messaggioDiErrore", messaggioDaInviareAPagina);
			destinazione = "searchForm.jsp";
		} else {
			request.setAttribute("listTelevisoriAttributeName",
					MyServiceFactory.getTelevisoreServiceInstance().cercaPerMarcaEModello(marcaDaPagina, modelloDaPagina));
			destinazione = "results.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	
	}

}
