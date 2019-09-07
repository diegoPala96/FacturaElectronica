package control;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.ModProducto;
import modelo.ModProveedor;


public class ProveedorBD {

	

	
	
	

	
	public void Insertar(ModProveedor proveedor) {
		
		
		Connection c=null;
        
		 String query = "INSERT INTO proveedor (IdProveedor, Ruc,Empresa, TelefonoUno, TelefonoDos,  Email, Direccion) values (?, ?,?, ?, ?, ?, ?)";
	    
		
		
	       
	       try {
	    	   
	    	   c=ConexionBD.getConnection();
				PreparedStatement rs=c.prepareStatement(query);
				rs.setInt       (1, proveedor.getId());
				rs.setString    (2, proveedor.getRuc());
	            rs.setString    (3, proveedor.getEmpresa());
	            rs.setString    (4, proveedor.getTelefonoUno());
	            rs.setString   	(5, proveedor.getTelefonoDos());
	            rs.setString   	(6, proveedor.getEmail());
	            rs.setString    (7, proveedor.getDireccion());
	            
				
				
		            
				
				
	            // Indicamos que comience la actualizaci�n de la tabla en nuestra base de datos
	            rs.executeUpdate();
	        	JOptionPane.showMessageDialog(null, "Operaci�n realizada correctamente");
	            // Cerramos las conexiones, en orden inverso a su apertura
	    

	}catch(Exception e){
		e.printStackTrace();
		
	}finally{
		ConexionBD.close(c);
	}	    
    

	
}

	public int NextCodProv() {
	
			
		Connection c = null;
			String sql="SELECT  count(*)"
					+" FROM proveedor";		
			try {
				   c=ConexionBD.getConnection();
					PreparedStatement rs=c.prepareStatement(sql);
			   
			    ResultSet ps=rs.executeQuery();
			  
			    while(ps.next())
			    {
			
			  int valor=ps.getInt(1);
			 
			  System.out.println(valor+"este es el valor actual");
			 return valor+1;
				  
			    }
			} catch (Exception e) {
			   // e.printStackTrace();
			} finally {
				ConexionBD.close(c);
			}
			JOptionPane.showMessageDialog(null, "no existe dato");	
			return 1;
		}

	public ModProveedor SelectRuc(String ruc) {
		// TODO Auto-generated method stub
		

	
	Connection c = null;
		String sql="SELECT  IdProveedor, Ruc,Empresa, TelefonoUno, TelefonoDos,  Email, Direccion "
				+" FROM proveedor"
				+" WHERE ruc = ?";
	
		try {
			   c=ConexionBD.getConnection();
				PreparedStatement rs=c.prepareStatement(sql);
		    rs.setString(1, ruc);
		    ResultSet ps=rs.executeQuery();
		  
		    while(ps.next())
		    {
		  ModProveedor mp= new ModProveedor();
		  mp.setId(ps.getInt("IdProveedor"));
		  mp.setEmpresa(ps.getString("Empresa"));
		  mp.setRuc(ps.getString("Ruc"));
		  mp.setTelefonoUno(ps.getString("TelefonoUno"));
		  //System.out.println(ps.getString("TelefonoDos"));
		  mp.setTelefonoDos(ps.getString("TelefonoDos")+"");
		 // System.out.println(ps.getString("TelefonoDos"+"pasooo"));
		  mp.setEmail(ps.getString("Email"));
		  mp.setDireccion(ps.getString("Direccion"));
		 return mp;
			  
		    }
		} catch (Exception e) {
		   // e.printStackTrace();
		} finally {
			ConexionBD.close(c);
		}
		JOptionPane.showMessageDialog(null, "no existe dato");	
		return null;
	}

	public List<ModProveedor> listar(){

	
		List<ModProveedor> listProveedor= new ArrayList<ModProveedor>();             
		String sql="SELECT  *  FROM proveedor";
				
				
		System.out.println(sql);
		Connection con = null;
		try {
			con = ConexionBD.getConnection();
		    PreparedStatement ps= con.prepareStatement(sql);
		   
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
		       ModProveedor c=new ModProveedor();
		       
		       
		       c.setId			(rs.getInt("IdProveedor"));
		       c.setRuc			(rs.getString("ruc"));
		       c.setEmpresa		(rs.getString("Empresa"));
		       c.setTelefonoUno	(rs.getString("TelefonoUno"));
		       c.setTelefonoDos	(rs.getString("TelefonoDos"));
		       c.setEmail		(rs.getString("Email"));
		       c.setDireccion	(rs.getString("Direccion"));
		       
		      
		       
		        
		        listProveedor.add(c);
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
			ConexionBD.close(con);
		}
		return listProveedor;
	}

	
	

public List<ModProveedor> ListarSelectRuc(String des) {

	
	List<ModProveedor> listProveedor= new ArrayList<ModProveedor>();   
	Connection con = null;
		String sql="SELECT  * "
				+" FROM proveedor"
				+" WHERE Empresa  LIKE ?";
	
	
		try {
			   con=ConexionBD.getConnection();
				PreparedStatement ps=con.prepareStatement(sql);
		    ps.setString(1, "%"+des+"%");
		    System.out.println("descri"+des);
		    ResultSet rs=ps.executeQuery();
		  
		    while(rs.next())
		    {
		    	   ModProveedor c=new ModProveedor();
			       
			       
			       c.setId			(rs.getInt("IdProveedor"));
			       c.setRuc			(rs.getString("ruc"));
			       c.setEmpresa		(rs.getString("Empresa"));
			       c.setTelefonoUno	(rs.getString("TelefonoUno"));
			       c.setTelefonoDos	(rs.getString("TelefonoDos"));
			       c.setEmail		(rs.getString("Email"));
			       c.setDireccion	(rs.getString("Direccion"));
			       
		  listProveedor.add(c);
		
		  
		 
			  
		    }
		    return listProveedor;
		} catch (Exception e) {
			return null;
		   // e.printStackTrace();
		} finally {
			ConexionBD.close(con);
		}
		
	
}



public void update(ModProveedor proveedor) {
	Connection c=null;

	String query = "update  proveedor  set Empresa=?, TelefonoUno=?, TelefonoDos=?,  Email=?, Direccion=?  where ruc=? ";

	try {

		c=ConexionBD.getConnection();
		PreparedStatement rs=c.prepareStatement(query);
		rs.setString(1, proveedor.getEmpresa());
		rs.setString(2, proveedor.getTelefonoUno());
		rs.setString(3, proveedor.getTelefonoDos());
		rs.setString(4, proveedor.getEmail());
		rs.setString(5, proveedor.getDireccion());
		rs.setString(6, proveedor.getRuc());
		
		
		

		// Indicamos que comience la actualizaci�n de la tabla en nuestra base de datos
		rs.executeUpdate();
		JOptionPane.showMessageDialog(null, "Operaci�n realizada correctamente");
		// Cerramos las conexiones, en orden inverso a su apertura


	}catch(Exception e){
		//e.printStackTrace();

	}finally{
		ConexionBD.close(c);
	}	    




	


		
}}




		


	
	
	
	
	
	





