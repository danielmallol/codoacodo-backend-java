package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateController")
public class CreateController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//recibe los datos que vienen del front; en req vienen los parámetros que postea el html
		
		String nombre = req.getParameter("nombre");
		String precio = req.getParameter("precio"); //pasar a float con parseFloat
		String fechaCreacion = ""; //Se la damos nosotros
		String imagen = req.getParameter("imagen");
		String codigo = req.getParameter("codigo");
		
		Connection con = AdministradorDeConexiones.getConnection();
	    if(con != null) {
	    	// insert into DB
	    	String sql = "INSERT INTO PRODUCTO (nombre, precio, fecha_creacion, imagen, codigo)";
	    	 
	    	//la siguiente línea vale para mysql, pero no para postgres
	        // sql += "VALUES('"+nombre+"', "+precio+",CURDATE(), '"+imagen+"','"+codigo+"')";

	    	sql += "VALUES('"+nombre+"',"+precio+",CURRENT_DATE,'"+imagen+"','"+codigo+"')";
	    	
	    	//control de errores:
	    try {
	    	Statement st = con.createStatement() ;
	    	st.execute(sql);
	    	con.close();
	    	
		//	getServletContext().getRequestDispatcher("/api/listadoController.jsp").forward(req, resp);
	    resp.sendRedirect(req.getContextPath()+"/api/ListadoController");
	    	
	    } 
	    catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    }
  	}
}
  