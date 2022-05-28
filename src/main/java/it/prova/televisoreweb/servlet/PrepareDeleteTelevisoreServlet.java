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
 * Servlet implementation class PrepareDeleteTelevisoreServlet
 */
@WebServlet("/PrepareDeleteTelevisoreServlet")
public class PrepareDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();

		String idTelevisoreDaEliminare = request.getParameter("idDaInviareComeParametro");

		Televisore result = null;
		try {
			result = televisoreServiceInstance.mostraTelevisore(Long.parseLong(idTelevisoreDaEliminare));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("televisoreDaInviareAPaginaDelete", result);

		RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
		rd.forward(request, response);

	}

}
