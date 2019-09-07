package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Facturacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtFactura;
	private JTextField txtNumFactura;
	private JTextField txtcedulaRuc;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtFormaPago;
	private JTextField txtFecha;
	private JTextField txtNomEmpleado;
	private JTextField txtDescuento;
	private JTextField txtTotal;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Facturacion frame = new Facturacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Facturacion() {
		setBounds(100, 100, 1203, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SimpleDateFormat forma_dato= new SimpleDateFormat("dd-MM-yyyy");	
		Calendar tiempo=new GregorianCalendar();
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 1191, 315);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCedula = new JLabel("Cedula/RUC");
		lblCedula.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblCedula.setBounds(16, 134, 103, 33);
		panel.add(lblCedula);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNombre.setBounds(16, 179, 109, 33);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblApellido.setBounds(16, 224, 103, 33);
		panel.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblDireccion.setBounds(16, 276, 103, 33);
		panel.add(lblDireccion);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblFecha.setBounds(493, 44, 103, 33);
		panel.add(lblFecha);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblTotal.setBounds(1037, 44, 109, 33);
		panel.add(lblTotal);
		
		JLabel lblNumcedula = new JLabel("Num Factura");
		lblNumcedula.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNumcedula.setBounds(16, 89, 103, 33);
		panel.add(lblNumcedula);
		
		JLabel lblNumFactuta = new JLabel("Id Factura");
		lblNumFactuta.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNumFactuta.setBounds(16, 44, 103, 33);
		panel.add(lblNumFactuta);
		
		JLabel lblFormaDeCobro = new JLabel("Forma de Cobro");
		lblFormaDeCobro.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblFormaDeCobro.setBounds(493, 89, 139, 33);
		panel.add(lblFormaDeCobro);
		
		JLabel lblEmpleado = new JLabel("Nombre Empleado");
		lblEmpleado.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblEmpleado.setBounds(493, 143, 150, 24);
		panel.add(lblEmpleado);
		
		JLabel lblDescuento = new JLabel("Descuento");
		lblDescuento.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblDescuento.setBounds(493, 188, 103, 33);
		panel.add(lblDescuento);
		
		txtFactura = new JTextField();
		txtFactura.setBounds(131, 45, 272, 33);
		panel.add(txtFactura);
		txtFactura.setColumns(10);
		
		txtNumFactura = new JTextField();
		txtNumFactura.setBounds(131, 90, 272, 33);
		panel.add(txtNumFactura);
		txtNumFactura.setColumns(10);
		
		txtcedulaRuc = new JTextField();
		txtcedulaRuc.setColumns(10);
		txtcedulaRuc.setBounds(131, 134, 272, 33);
		panel.add(txtcedulaRuc);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(131, 180, 272, 33);
		panel.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(131, 224, 272, 33);
		panel.add(txtApellido);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(131, 269, 272, 33);
		panel.add(txtDireccion);
		
		txtFormaPago = new JTextField();
		txtFormaPago.setColumns(10);
		txtFormaPago.setBounds(644, 89, 272, 33);
		panel.add(txtFormaPago);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setText(forma_dato.format(tiempo.getTime()));
		txtFecha.setBounds(644, 45, 272, 33);
		panel.add(txtFecha);
		
		txtNomEmpleado = new JTextField();
		txtNomEmpleado.setColumns(10);
		txtNomEmpleado.setBounds(644, 138, 272, 33);
		panel.add(txtNomEmpleado);
		
		txtDescuento = new JTextField();
		txtDescuento.setColumns(10);
		txtDescuento.setBounds(644, 183, 272, 33);
		panel.add(txtDescuento);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		txtTotal.setBounds(990, 89, 174, 123);
		panel.add(txtTotal);
		txtTotal.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 395, 1191, 296);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		//table = new JTable();
	//	table.setBounds(6, 6, 1179, 231);
		
		
		
		Object filas [][] =new Object [100][6];
		String columnas[] = new String[]{"Art","Cantidad","Descripcion","Precio Unitario ","Iva","Descuento"};
		table = new JTable(filas,columnas);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setBounds(6, 6, 1161, 231);
		table.setValueAt("Art", 0, 0);
		table.setValueAt("Cantidad", 0, 1);
		table.setValueAt("Descripcion", 0, 2);
		table.setValueAt("Precio Unitario", 0, 3);
		table.setValueAt("IVA", 0, 4);
		table.setValueAt("Descuento", 0, 5);
		panel_1.add(table);
		//getContentPane().add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1168, 6, 17, 231);
		panel_1.add(scrollBar);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setBounds(986, 249, 78, 33);
		panel_1.add(lblSubtotal);
		lblSubtotal.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		textField = new JTextField();
		textField.setBounds(1067, 250, 100, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 333, 1191, 55);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon("/Users/oscartenesaca/Documents/workspace/FacturaElectronica/Iconos/IconoEliminar.png"));
		btnEliminar.setBounds(301, 6, 153, 43);
		panel_2.add(btnEliminar);
		
		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.setIcon(new ImageIcon("/Users/oscartenesaca/Documents/workspace/FacturaElectronica/Iconos/IconoAgregar.png"));
		btnAnadir.setBounds(614, 6, 153, 43);
		panel_2.add(btnAnadir);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setIcon(new ImageIcon("/Users/oscartenesaca/Documents/workspace/FacturaElectronica/Iconos/IconoAyuda.png"));
		btnAyuda.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnAyuda.setBounds(1080, 707, 117, 43);
		contentPane.add(btnAyuda);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnCerrar.setIcon(new ImageIcon("/Users/oscartenesaca/Documents/workspace/FacturaElectronica/Iconos/IconoEliminar.png"));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCerrar.setBounds(953, 707, 117, 43);
		contentPane.add(btnCerrar);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnGrabar.setIcon(new ImageIcon("/Users/oscartenesaca/Documents/workspace/FacturaElectronica/Iconos/IconOk.png"));
		btnGrabar.setBounds(815, 707, 126, 43);
		contentPane.add(btnGrabar);
		
		
	}
}
