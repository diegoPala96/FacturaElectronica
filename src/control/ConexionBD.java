package control;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConexionBD {

	static Connection con = null;

	String url = "jdbc:mysql://db4free.net:3306/facelectronica";
	String user = "ptzadmin";
	String pass = "ptz11990";

	public ConexionBD() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(url, user, pass);

			System.out.println("conexion exitosa");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error de conexion" + e);
		}

	}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return con;
	}

	public static void close(Connection c) {
		// TODO Auto-generated method stub
		
	}



}
