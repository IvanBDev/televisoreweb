package it.prova.televisoreweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.televisoreweb.model.Televisore;
import it.prova.televisoreweb.service.MyServiceFactory;
import it.prova.televisoreweb.service.televisore.TelevisoreService;

@WebServlet("/ExecuteInsertTelevisoreServlet")
public class ExecuteInsertTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		String marcaDaPagina = request.getParameter("marcaInput");
		String modelloDaPagina = request.getParameter("modelloInput");
		int prezzoDaPagina = Integer.parseInt(request.getParameter("prezzoInput"));
		int numeroPolliciDaPagina = Integer.parseInt(request.getParameter("numeroPolliciInput"));
		String codiceDapagina = request.getParameter("codiceInput");
		
		Televisore nuovoTelevisore = new Televisore();
		nuovoTelevisore.setMarca(marcaDaPagina);
		nuovoTelevisore.setModello(modelloDaPagina);
		nuovoTelevisore.setPrezzo(prezzoDaPagina);
		nuovoTelevisore.setNumeroPollici(numeroPolliciDaPagina);
		nuovoTelevisore.setCodice(codiceDapagina);
		
		try {
			televisoreServiceInstance.inserisciNuovoTelevisore(nuovoTelevisore);
			request.setAttribute("listTelevisoriAttributeName", televisoreServiceInstance.listAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
		
	}

}
