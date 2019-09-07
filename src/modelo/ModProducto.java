package modelo;

import javax.swing.SingleSelectionModel;

public class ModProducto {

int CodProducto;
String Descripcion;
Double PCompra ;
Double PVP;
int Stock;
int IdProveedor;
public int getCodProducto() {
	return CodProducto;
}
public void setCodProducto(int codProducto) {
	CodProducto = codProducto;
}
public String getDescripcion() {
	return Descripcion;
}
public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
}
public Double getPCompra() {
	return PCompra;
}
public void setPCompra(Double pCompra) {
	PCompra = pCompra;
}
public Double getPVP() {
	return PVP;
}
public void setPVP(Double pVP) {
	PVP = pVP;
}
public int getStock() {
	return Stock;
}
public void setStock(int stock) {
	Stock = stock;
}
public int getIdProveedor() {
	System.out.println(toString());
	return IdProveedor;
}
public void setIdProveedor(int idProveedor) {
	IdProveedor = idProveedor;
}
@Override
public String toString() {
	return "ModProducto [CodProducto=" + CodProducto + ", Descripcion=" + Descripcion + ", PCompra=" + PCompra
			+ ", PVP=" + PVP + ", Stock=" + Stock + ", IdProveedor=" + IdProveedor + "]";
}





}
