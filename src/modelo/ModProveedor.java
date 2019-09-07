package modelo;

public class ModProveedor {

	int Id;
	String Empresa;
	String TelefonoUno;
	String TelefonoDos;
	String Email;
	String Direccion;
	String Ruc;
	
	public String getRuc() {
		return Ruc;
	}
	public void setRuc(String ruc) {
		Ruc = ruc;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	
	@Override
	public String toString() {
		return "ModProveedor [Id=" + Id + ", Empresa=" + Empresa + ", TelefonoUno=" + TelefonoUno + ", TelefonoDos="
				+ TelefonoDos + ", Email=" + Email + ", Direccion=" + Direccion + ", Ruc=" + Ruc + "]";
	}
	public String getTelefonoUno() {
		return TelefonoUno;
	}
	public void setTelefonoUno(String telefonoUno) {
		TelefonoUno = telefonoUno;
	}
	public String getTelefonoDos() {
		return TelefonoDos;
	}
	public void setTelefonoDos(String telefonoDos) {
		TelefonoDos = telefonoDos;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
}
