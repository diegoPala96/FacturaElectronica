package vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Personas extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JLabel lblCedula;
	private JLabel lblTelefono;
	private JLabel lblEmail;
	private JLabel lblDireccion;
	private JTextField txtcedula;
	private JTextField txttelefono;
	private JTextField txtemail;
	private JTextField txtdireccion;
	private JButton btnGuardar;
	private JLabel lblNewLabel;
	private JButton btnModificar;
	private JButton btnListar;
	private JTable table;
	private JRadioButton rdbtnCedula;
	private JRadioButton rdbtnRuc;
	private JRadioButton rdbtnPasaporte;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personas frame = new Personas();
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
	public Personas() {
		setBounds(100, 100, 858, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtid = new JTextField();
		txtid.setBounds(141, 33, 174, 33);
		contentPane.add(txtid);
		txtid.setEnabled(false);
		txtid.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(24, 33, 101, 26);
		contentPane.add(lblId);
		
		
		lblCedula = new JLabel("DOCUMENTO");
		lblCedula.setBounds(19, 66, 106, 26);
		contentPane.add(lblCedula);
		
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(19, 104, 116, 26);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("APELLIDO");
		lblApellido.setBounds(19, 142, 101, 26);
		contentPane.add(lblApellido);
		
		lblDireccion = new JLabel("DIRECCION");
		lblDireccion.setBounds(19, 241, 106, 26);
		contentPane.add(lblDireccion);
	
		lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setBounds(19, 175, 106, 26);
		contentPane.add(lblTelefono);
		
		lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(19, 206, 106, 26);
		contentPane.add(lblEmail);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Iconos/logoPersonas.png"));
		lblNewLabel.setBounds(323, 93, 190, 190);
		contentPane.add(lblNewLabel);
		
		
		txtcedula = new JTextField();
		txtcedula.setBounds(141, 67, 174, 33);
		contentPane.add(txtcedula);
		txtcedula.setColumns(10);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(141, 101, 174, 33);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setBounds(141, 138, 174, 33);
		contentPane.add(txtapellido);
		txtapellido.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(141, 172, 174, 33);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setBounds(141, 203, 174, 33);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(141, 238, 174, 33);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				if(rdbtnCedula.isSelected()==true)
				{
				 System.out.print("Seleccionó cedula");
				}
				
			}		
			
			
		});
		btnGuardar.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnGuardar.setIcon(new ImageIcon("Iconos/iconoGuardar.png"));
		btnGuardar.setBounds(318, 294, 151, 33);
		contentPane.add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModificar.setIcon(new ImageIcon("Iconos/iconoModificar.png"));
		btnModificar.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnModificar.setBounds(547, 61, 151, 33);
		contentPane.add(btnModificar);
		
		
		Object filas [][] =new Object [100][6];
		String columnas[] = new String[]{"Cedula","Nombre","Apellido","Telefono ","E-mail","Direccion"};
		table = new JTable(filas,columnas);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setBounds(24, 387, 803, 238);
		table.setValueAt("Cedula", 0, 0);
		table.setValueAt("Nombre", 0, 1);
		table.setValueAt("Apellido", 0, 2);
		table.setValueAt("Telefono", 0, 3);
		table.setValueAt("E-mail", 0, 4);
		table.setValueAt("Direccion", 0, 5);
		getContentPane().add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(824, 387, 17, 238);
		contentPane.add(scrollBar);
		
		rdbtnCedula = new JRadioButton("cedula");
		rdbtnCedula.setBounds(321, 68, 66, 23);
		contentPane.add(rdbtnCedula);
		
		rdbtnRuc = new JRadioButton("ruc");
		rdbtnRuc.setBounds(389, 68, 56, 23);
		contentPane.add(rdbtnRuc);
		
		rdbtnPasaporte = new JRadioButton("pasaporte");
		rdbtnPasaporte.setBounds(445, 68, 109, 23);
		contentPane.add(rdbtnPasaporte);
		ButtonGroup tipo= new ButtonGroup();
		tipo.add(rdbtnCedula);
		tipo.add(rdbtnRuc);
		tipo.add(rdbtnPasaporte);
		
		
		
		
		
		
		
	}
}
