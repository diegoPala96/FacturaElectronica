package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarPersona extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					ListarPersona frame = new ListarPersona();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the frame.
	 */
	public ListarPersona() {
		
		setBounds(100, 100, 608, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(123, 26, 229, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon("Iconos\\IconoBuscar.png"));
		btnBuscar.setBounds(362, 28, 124, 33);
		contentPane.add(btnBuscar);
		
		//table = new JTable();
	//	table.setBounds(10, 108, 742, 256);
		//contentPane.add(table);
		
		Object filas [][] =new Object [100][6];
		String columnas[] = new String[]{"Cedula","Nombre","Apellido","Telefono ","E-mail","Direccion"};
		table = new JTable(filas,columnas);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setBounds(16, 83, 529, 238);
		table.setValueAt("Cedula", 0, 0);
		table.setValueAt("Nombre", 0, 1);
		table.setValueAt("Apellido", 0, 2);
		table.setValueAt("Telefono", 0, 3);
		table.setValueAt("E-mail", 0, 4);
		table.setValueAt("Direccion", 0, 5);
		getContentPane().add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(544, 83, 17, 238);
		contentPane.add(scrollBar);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCedula.setBounds(10, 26, 103, 33);
		contentPane.add(lblCedula);
		
		JButton btnRegresar = new JButton("");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Personas persona = new Personas();
				
				persona.setVisible(true);
			//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
				
			}
		});
		btnRegresar.setIcon(new ImageIcon("Iconos\\Iconoregresar.png"));
		btnRegresar.setBounds(10, 332, 81, 61);
		btnRegresar.setContentAreaFilled(false);
		btnRegresar.setBorder(null);
		contentPane.add(btnRegresar);
		
	}
}
