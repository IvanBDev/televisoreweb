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

/**
 * Servlet implementation class PrepareUpdateServlet
 */
@WebServlet("/PrepareUpdateServlet")
public class PrepareUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TelevisoreService televisioneServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		String idTelevisoreDaModificare = request.getParameter("idDaInviareComeParametro");
		
		Televisore result = null;
		try {
			result = televisioneServiceInstance.mostraTelevisore(Long.parseLong(idTelevisoreDaModificare));
			request.setAttribute("televisoreDaInviareAPaginaUpdate", result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
		
	}

}
