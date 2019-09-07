package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JTextField;

public class Caja extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtfecha;
	private JTextField txtHora;
	private JTextField txtcedEmpleado;
	private JTextField txtnomEmpleado;
	private JTextField txtApertura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caja frame = new Caja();
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
	public Caja() {
		
		SimpleDateFormat forma_dato= new SimpleDateFormat("dd-MM-yyyy");	
		Calendar tiempo=new GregorianCalendar();
		
		setBounds(100, 100, 680, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCaja = new JLabel("CAJA");
		lblCaja.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCaja.setBounds(10, 75, 52, 25);
		contentPane.add(lblCaja);
		
		textField = new JTextField();
		textField.setBounds(70, 74, 86, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 111, 544, 214);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFecha.setBounds(10, 53, 80, 26);
		panel.add(lblFecha);
		
		JLabel lblHora = new JLabel("HORA");
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHora.setBounds(291, 53, 46, 26);
		panel.add(lblHora);
		
		JLabel lblEmpleado = new JLabel("EMPLEADO");
		lblEmpleado.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmpleado.setBounds(10, 109, 98, 26);
		panel.add(lblEmpleado);
		
		JLabel lblApertura = new JLabel("APERTURA");
		lblApertura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApertura.setBounds(10, 162, 98, 26);
		panel.add(lblApertura);
		
		txtfecha = new JTextField();
		txtfecha.setText(forma_dato.format(tiempo.getTime()));
		txtfecha.setBounds(121, 56, 150, 25);
		txtfecha.disable();
		panel.add(txtfecha);
		txtfecha.setColumns(10);
		
		txtHora = new JTextField();
		txtHora.setBounds(347, 55, 165, 26);
		txtHora.setText(tiempo.get(Calendar.HOUR_OF_DAY)+":"+tiempo.get(Calendar.MINUTE)+":"+tiempo.get(Calendar.SECOND));
		txtHora.disable();
		panel.add(txtHora);
		txtHora.setColumns(10);
		
		txtcedEmpleado = new JTextField();
		txtcedEmpleado.setBounds(121, 109, 150, 25);
		panel.add(txtcedEmpleado);
		txtcedEmpleado.setColumns(10);
		
		txtnomEmpleado = new JTextField();
		txtnomEmpleado.setBounds(291, 112, 221, 25);
		panel.add(txtnomEmpleado);
		txtnomEmpleado.setColumns(10);
		
		txtApertura = new JTextField();
		txtApertura.setBounds(121, 162, 150, 25);
		panel.add(txtApertura);
		txtApertura.setColumns(10);
		
		JLabel lblAperturaDeCaja = new JLabel("APERTURA DE CAJA");
		lblAperturaDeCaja.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		lblAperturaDeCaja.setBounds(252, 11, 226, 43);
		contentPane.add(lblAperturaDeCaja);
	}
}
