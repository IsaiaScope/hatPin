package it.abupro.LatLng.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.abupro.LatLng.entities.*;
import it.abupro.LatLng.function.PinHelper;

/**
 * Servlet implementation class InsertPin
 */
@WebServlet("/insertPin")
public class InsertPin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pin p1 = new Pin();
		PinHelper pH = new PinHelper();
		
		p1.setTitle(request.getParameter("titolo"));
		p1.setBody(request.getParameter("corpo"));
		p1.setLatlng(request.getParameter("latlng"));
		pH.newPin(p1);
		
		response.sendRedirect("index.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}