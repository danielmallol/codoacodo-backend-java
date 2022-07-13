package ar.com.codoacodo.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones 
{
	public static Connection getConnection() 
	{   //el nombre de la BD en mysql es "daniel"
		/* En la clase 33 comentamos lo de mysql y agregamos lo de System.getenv para la nueva BD
		String url = "jdbc:mysql://127.0.0.1:3306/daniel?serverTimeZone=UTC&userSSL=false";
		String username = "root" ;
		String password = "root" ;
	    String driverName = "com.mysql.cj.jdbc.Driver";	//para mysql
	    */
		String url = System.getenv("DATASOURCE_URL");
		String username = System.getenv("DATASOURCE_USERNAME");
		String password = System.getenv("DATASOURCE_PASSWORD");
	    String driverName = System.getenv("DATASOURCE_DRIVER");
	    
	    //control errores
	    Connection con = null;
	    try { 
	    	Class.forName(driverName);
	    	con = DriverManager.getConnection(url,username,password);  
	    } catch(Exception e) {
			e.printStackTrace();// me dice qué fue lo que falló
	    }
 		return con;
	}


public static void main(String[] args) {
	Connection con = AdministradorDeConexiones.getConnection();
			if(con != null ) {
				System.out.println("ok");
				}
			else {
				System.out.println("kaputtttt");
				}
				
			}
}