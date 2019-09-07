package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.synth.SynthSeparatorUI;

import control.ProveedorBD;
import control.Validar;
import modelo.ModProveedor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.crypto.spec.PBEParameterSpec;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;


public class Proveedor extends JFrame {

	private JPanel contentPane;	private JTextField txtId;
	private JTextField txtEmpresa;
	private JTextField txtTelefonoUno;

	
	private JTextField txtTelefonoDos;
	private JTextField txtEmail;
	private JButton btnGuardar;
	private JLabel lblNewLabel;
	private JLabel lblDireccion;
	private JTextField txtDireccion;
	private JTextField txtruc;
	private JLabel lblRuc;
	private JButton btnModificar;
	private JTable table;
	private JTextField txtbuscar;
	ProveedorBD PBD= new ProveedorBD();
	Validar valida= new Validar();
	int modifica=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proveedor frame = new Proveedor();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Proveedor() {
		
		setBounds(100, 100, 920, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(130, 16, 644, 350);
		contentPane.add(panel);
		panel.setBounds(10, 12, 500, 350);
		panel.setLayout(null);
		panel.setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(171, 11, 264, 33);
		txtId.setColumns(10);
		txtId.setEnabled(false);
		panel.add(txtId);
		
		JLabel label = new JLabel("ID");
		label.setBounds(16, 14, 150, 27);
		panel.add(label);
		
		JLabel lblEmpresa = new JLabel("EMPRESA");
		lblEmpresa.setBounds(16, 103, 150, 27);
		panel.add(lblEmpresa);
		
		JLabel lblTelefono = new JLabel("TELEFONO1");
		lblTelefono.setBounds(16, 142, 150, 27);
		panel.add(lblTelefono);
		
		JLabel lblTelefono2 = new JLabel("TELEFONO2");
		lblTelefono2.setBounds(16, 181, 150, 27);
		panel.add(lblTelefono2);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(16, 220, 150, 27);
		panel.add(lblEmail);
		
		txtEmpresa = new JTextField();
		txtEmpresa.setBounds(171, 100, 264, 33);
		txtEmpresa.setColumns(10);
		panel.add(txtEmpresa);
		
		txtTelefonoUno = new JTextField();
		txtTelefonoUno.setBounds(171, 139, 264, 33);
		txtTelefonoUno.setColumns(10);
		panel.add(txtTelefonoUno);
		
		txtTelefonoDos = new JTextField();
		txtTelefonoDos.setBounds(171, 178, 264, 33);
		txtTelefonoDos.setColumns(10);
		panel.add(txtTelefonoDos);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(171, 217, 264, 33);
		txtEmail.setColumns(10);
		panel.add(txtEmail);
		
		lblDireccion = new JLabel("DIRECCION");
		lblDireccion.setBounds(16, 258, 85, 14);
		panel.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(171, 261, 264, 33);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtruc = new JTextField();
		txtruc.setBounds(171, 56, 264, 33);
	
		txtruc.setColumns(10);
		panel.add(txtruc);
		
		lblRuc = new JLabel("RUC");
		lblRuc.setBounds(16, 59, 150, 27);
		panel.add(lblRuc);
		
		
		btnModificar = new JButton("Modificar");
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
		
				if(valida.validarCedula(txtruc.getText()) == true) {
					
				
			ProveedorBD PBD= new ProveedorBD();
			 ModProveedor datos= PBD.SelectRuc(txtruc.getText());
			 
			 txtId.setText(datos.getId()+"");
			 txtruc.setText(datos.getRuc());
			 txtEmpresa.setText(datos.getEmpresa());
			 txtTelefonoUno.setText(datos.getTelefonoUno());
			txtTelefonoDos.setText(datos.getTelefonoDos());
	
			 txtEmail.setText(datos.getEmail());
			 txtDireccion.setText(datos.getDireccion());
			 modifica=1;

				}else {System.out.println("cedula invalida");}
			
			}
		});
		btnModificar.setIcon(new ImageIcon("Iconos/iconoModificar.png"));
		btnModificar.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnModificar.setBounds(520, 66, 151, 33);
		contentPane.add(btnModificar);
	
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			
				
				if(valida.validarCedula(txtruc.getText()) == true) {
				
				
				ModProveedor proveedor= new ModProveedor();
				
				
				proveedor.setId(Integer.parseInt(txtId.getText()));
				proveedor.setRuc(txtruc.getText());
				proveedor.setEmpresa(txtEmpresa.getText());
				
				proveedor.setTelefonoUno(txtTelefonoUno.getText());
				proveedor.setTelefonoDos(txtTelefonoDos.getText());
				proveedor.setEmail(txtEmail.getText());
				proveedor.setDireccion(txtDireccion.getText());
				
				if(modifica==0) {
				
				
				
				PBD.Insertar(proveedor);
				VaciarcajaTexto();
				CodigoProveedor();
			
				}else
				{
					
					PBD.update(proveedor);
					System.out.println("update");
					modifica=0;
					VaciarcajaTexto();
					CodigoProveedor();
					
				}}else {
					System.out.println("cedula invalida");
				}
	
				
			
			
			}

			
		});
		btnGuardar.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnGuardar.setIcon(new ImageIcon("Iconos/iconoGuardar.png"));
		btnGuardar.setBounds(666, 324, 151, 33);
		contentPane.add(btnGuardar);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Iconos/logoProveedor.png"));
		lblNewLabel.setBounds(672, 76, 145, 145);
		contentPane.add(lblNewLabel);
		
		
		txtbuscar = new JTextField();
		txtbuscar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
				int cont=0;
				
			   limpiarTable();
				List<ModProveedor> d= PBD.ListarSelectRuc(txtbuscar.getText());
				
				for(ModProveedor t:d){
					cont++;
					
					
					
					table.setValueAt(t.getId(), cont, 0);
					table.setValueAt(t.getRuc(), cont, 1);
					table.setValueAt(t.getEmpresa(), cont, 2);
					table.setValueAt(t.getTelefonoUno() ,cont, 3);
					table.setValueAt(t.getTelefonoDos() ,cont, 4);
					table.setValueAt(t.getEmail() ,cont, 5);
					table.setValueAt(t.getDireccion() ,cont, 6);
					
					
					
					
					
					}
				
					
			
				
			}
		});
		
		txtbuscar.setBounds(172, 300, 264, 33);
		panel.add(txtbuscar);
		
		
		
		
		
		
		
		
		
		
		
		
		CodigoProveedor();
		
		Object filas [][] =new Object [50][7];
		String columnas[] = new String[]{"Id","Ruc","Empresa","Telefono1 ","Telefono2","Email","Direccion"};
		table = new JTable(filas,columnas);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setBounds(45, 417, 811, 238);
		table.setValueAt("Id", 0, 0);
		table.setValueAt("Ruc", 0, 1);
		table.setValueAt("Empresa", 0, 2);
		table.setValueAt("Telefono1", 0, 3);
		table.setValueAt("Telefono2", 0, 4);
		table.setValueAt("Email", 0, 5);
		table.setValueAt("Direccion", 0, 6);
		getContentPane().add(table);
		
		
		rellenar();
		
		
	}
	
	private void CodigoProveedor() {
	ProveedorBD PBD= new ProveedorBD();

	txtId.setText(PBD.NextCodProv()+"");
		
	}
	
	
	private void rellenar() {
		
		ProveedorBD PBD=new ProveedorBD();
	
	int cont=0;
	for(ModProveedor t: PBD.listar()){
	cont++;
	
	
	
	table.setValueAt(t.getId(), cont, 0);
	table.setValueAt(t.getRuc(), cont, 1);
	table.setValueAt(t.getEmpresa(), cont, 2);
	table.setValueAt(t.getTelefonoUno(),cont, 3);
	table.setValueAt(t.getTelefonoDos() ,cont, 4);
	table.setValueAt(t.getEmail() ,cont, 5);
	table.setValueAt(t.getDireccion() ,cont, 6);
	
	
	
	
	}
	
	}
	
	
	

	private void VaciarcajaTexto() {
		// TODO Auto-generated method stub
		
		
		txtId.setText("");
		txtruc.setText("");
		txtEmpresa.setText("");
		txtTelefonoUno.setText("");
		txtTelefonoDos.setText("");
		txtEmail.setText("");
		txtDireccion.setText("");
		
		
	}
	
	
	
	
protected void limpiarTable() {
		
		
		for (int i = 1; i < table.getRowCount(); i++) {
			table.setValueAt("", i, 0);
			table.setValueAt("", i, 1);
			table.setValueAt("", i, 2);
			table.setValueAt("" ,i, 3);
			table.setValueAt("" ,i, 4);
			table.setValueAt("" ,i, 5);
			table.setValueAt("" ,i, 6);
			
			
		}
		
	}

	
	
}
