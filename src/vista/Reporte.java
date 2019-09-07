package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Reporte extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reporte frame = new Reporte();
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
	public Reporte() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btninventario = new JButton("Reporte Inventario");
		btninventario.setBounds(17, 32, 180, 40);
		contentPane.add(btninventario);
		
		JButton btnReporteFacturacion = new JButton("Reporte Facturacion");
		btnReporteFacturacion.setBounds(17, 93, 180, 40);
		contentPane.add(btnReporteFacturacion);
		
		JButton btnReporteCajas = new JButton("Reporte Cajas");
		btnReporteCajas.setBounds(17, 151, 180, 40);
		contentPane.add(btnReporteCajas);
	}
}
