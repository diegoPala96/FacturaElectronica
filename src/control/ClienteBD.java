package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.swing.JOptionPane;

import java.util.*;
import modelo.ModProducto;


public class ClienteBD {

	

	public void Insertar(ModProducto producto) {
		
		 
		Connection c=null;

		String query = "INSERT INTO producto (CodProducto, Descripcion,PCompra,PVP,Stock,IdProveedor) values (?,?,?,?,?,?)";

		try {

			c=ConexionBD.getConnection();
			PreparedStatement rs=c.prepareStatement(query);
			rs.setInt       (1, producto.getCodProducto());
			rs.setString    (2, producto.getDescripcion());
			rs.setDouble    (3, producto.getPCompra());
			rs.setDouble    (4, producto.getPVP());
			rs.setInt   	(5, producto.getStock());
			rs.setInt   	(6, producto.getIdProveedor());

			// Indicamos que comience la actualizaci�n de la tabla en nuestra base de datos
			rs.executeUpdate();
			JOptionPane.showMessageDialog(null, "Operaci�n realizada correctamente");
			// Cerramos las conexiones, en orden inverso a su apertura


		}catch(Exception e){
			//e.printStackTrace();

		}finally{
			ConexionBD.close(c);
		}	    




	}
	

		

	
	public void Update(ModProducto producto,int stock) {
		
		 
		Connection c=null;

		String query = "update  producto  set Stock=? where CodProducto=? ";

		try {

			c=ConexionBD.getConnection();
			PreparedStatement rs=c.prepareStatement(query);
			rs.setInt       (1, producto.getStock()+stock);
		
			rs.setInt(2, producto.getCodProducto());

			// Indicamos que comience la actualizaci�n de la tabla en nuestra base de datos
			rs.executeUpdate();
			JOptionPane.showMessageDialog(null, "Operaci�n realizada correctamente");
			// Cerramos las conexiones, en orden inverso a su apertura


		}catch(Exception e){
			//e.printStackTrace();

		}finally{
			ConexionBD.close(c);
		}	    




	}



public  ModProducto Select(String codigo){
	 
	Connection c = null;
		String sql="SELECT  CodProducto,Descripcion,PCompra,PVP,Stock,IdProveedor "
				+" FROM producto"
				+" WHERE codProducto = ?";
	
		try {
			   c=ConexionBD.getConnection();
				PreparedStatement rs=c.prepareStatement(sql);
		    rs.setInt(1, Integer.parseInt(codigo));
		    ResultSet ps=rs.executeQuery();
		  
		    while(ps.next())
		    {
		  ModProducto mp= new ModProducto();
		  mp.setCodProducto(ps.getInt("CodProducto"));
		  mp.setDescripcion(ps.getString("Descripcion"));
	
		
		
		  mp.setIdProveedor(ps.getInt("IdProveedor"));
		    mp.setPCompra(ps.getDouble("PCompra"));
		  mp.setPVP(ps.getDouble("PVP"));
		  mp.setStock(ps.getInt("Stock"));
		  
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






public List<ModProducto> listar(){

	 
		List<ModProducto> listProducto= new ArrayList<ModProducto>();             
		String sql="SELECT  CodProducto,Descripcion,PCompra,PVP,Stock,IdProveedor  FROM producto";
				
				
		System.out.println(sql);
		Connection con = null;
		try {
			con = ConexionBD.getConnection();
		    PreparedStatement ps= con.prepareStatement(sql);
		   
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
		       ModProducto c=new ModProducto();
		       
		       
		       c.setCodProducto(rs.getInt("CodProducto"));
		       c.setDescripcion(rs.getString("Descripcion"));
		       c.setPCompra		(rs.getDouble("PCompra"));
		       c.setPVP			(rs.getDouble("PVP"));
		       c.setStock		(rs.getInt("Stock"));
		       c.setIdProveedor(rs.getInt("IdProveedor"));
		       
		      
		       
		        
		        listProducto.add(c);
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
			ConexionBD.close(con);
		}
		return listProducto;
	}





public List<ModProducto> SelectDescripcion(String des) {

	 
	List<ModProducto> listProducto= new ArrayList<ModProducto>();   
	Connection c = null;
		String sql="SELECT  CodProducto,Descripcion,PCompra,PVP,Stock,IdProveedor "
				+" FROM producto"
				+" WHERE Descripcion  LIKE ?";
	
	
		try {
			   c=ConexionBD.getConnection();
				PreparedStatement rs=c.prepareStatement(sql);
		    rs.setString(1, "%"+des+"%");
		    System.out.println("descri"+des);
		    ResultSet ps=rs.executeQuery();
		  
		    while(ps.next())
		    {
		  ModProducto mp= new ModProducto();
		  
		  
	       
	       mp.setCodProducto	(ps.getInt("CodProducto"));
	       mp.setDescripcion	(ps.getString("Descripcion"));
	       mp.setPCompra		(ps.getDouble("PCompra"));
	       mp.setPVP			(ps.getDouble("PVP"));
	       mp.setStock			(ps.getInt("Stock"));
	       mp.setIdProveedor	(ps.getInt("IdProveedor"));
	       
		  listProducto.add(mp);
		
		  
		 
			  
		    }
		    return listProducto;
		} catch (Exception e) {
			return null;
		   // e.printStackTrace();
		} finally {
			ConexionBD.close(c);
		}
		
	
}
	
	
	
	
	

		


	
	
	
	
	
	


}



