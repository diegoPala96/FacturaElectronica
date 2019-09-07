package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.synth.SynthSeparatorUI;

import control.ProductoBD;
import control.ProveedorBD;
import modelo.ModProducto;
import modelo.ModProveedor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;

public class Inventario extends JFrame {

	private JPanel contentPane;
	private JTextField txtcodigo;
	private JTextField txtdescripcion;
	private JTextField txtventa;
	private JTextField txtstock;
	private JButton btnRegistrarCompra;
	private JLabel lblNewLabel;
	private JTextField txtProvedor;
	private JLabel lblPcompra;
	private JTextField txtcompra;
	private JButton btnModificar;
	private JButton btnListar;
	private  JLabel lblStockR;
	ProductoBD PBD=new ProductoBD();
	ModProducto MPR=new ModProducto();
	private JButton btnCancelar;
	private JPanel panel;
	private JTable table;
	private JTextField txtbuscar;
	
	
	List<ModProducto> listProduc= new ArrayList<ModProducto>();   

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario frame = new Inventario();
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
	public Inventario() {
		
		setBounds(100, 100, 752, 802);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("CODIGO");
		lblCodigo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCodigo.setBounds(33, 30, 102, 34);
		contentPane.add(lblCodigo);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblDescripcion.setBounds(33, 76, 102, 34);
		contentPane.add(lblDescripcion);
		
		JLabel lblPrecio = new JLabel("P.V.P");
		lblPrecio.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPrecio.setBounds(33, 175, 102, 34);
		contentPane.add(lblPrecio);
		
		JLabel lblStock = new JLabel("STOCK");
		lblStock.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblStock.setBounds(33, 230, 102, 34);
		contentPane.add(lblStock);
		
		JLabel lblProveedor = new JLabel("PROVEEDOR");
		lblProveedor.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblProveedor.setBounds(33, 275, 102, 34);
		contentPane.add(lblProveedor);
		
		
		
		txtcodigo = new JTextField();
		txtcodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		String var=	txtcodigo.getText();
		VaciarCajaTexto();
		txtcodigo.setText(var);
		
	
	
		
		ModProducto c = PBD.Select(txtcodigo.getText());
		System.out.println(c.getCodProducto()+"aqui");

		
		
		
			
	
			
			
			
			
			txtdescripcion.setText(c.getDescripcion()+"");
			
			txtProvedor.setText(c.getIdProveedor()+"");	
		
			txtcompra.setText(c.getPCompra()+"");
		
			txtventa.setText(c.getPVP()+"");
			
			lblStockR.setText(c.getStock()+"");
			txtdescripcion.setEditable(false);
			txtProvedor.setEditable(false);
			txtcompra.setEditable(false);
			txtventa.setEditable(false);
			
			btnCancelar.setVisible(true);
		
		
			
			}
			
			}
			
			
		);
		
		txtcodigo.setBounds(153, 30, 186, 34);
		contentPane.add(txtcodigo);
		txtcodigo.setColumns(10);
		
		txtdescripcion = new JTextField();
		txtdescripcion.setBounds(153, 79, 186, 34);
		contentPane.add(txtdescripcion);
		txtdescripcion.setColumns(10);
		
		
		txtcompra = new JTextField();
		txtcompra.setColumns(10);
		txtcompra.setBounds(153, 128, 186, 34);
		contentPane.add(txtcompra);
		
		
		txtventa = new JTextField();
		txtventa.setBounds(152, 177, 186, 34);
		contentPane.add(txtventa);
		txtventa.setColumns(10);
		
		txtstock = new JTextField();
		txtstock.setBounds(153, 226, 186, 34);
		contentPane.add(txtstock);
		txtstock.setColumns(10);
		
		
		btnRegistrarCompra = new JButton("Registrar Compra");
		btnRegistrarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblStockR.getText().length() > 0) {
					
					ModProducto producto= new ModProducto();
					
					
					producto.setCodProducto(Integer.parseInt(txtcodigo.getText()));
					producto.setDescripcion(txtdescripcion.getText());
					producto.setPCompra(Double.parseDouble(txtcompra.getText()));
					producto.setPVP(Double.parseDouble(txtventa.getText()));
					producto.setStock(Integer.parseInt(txtstock.getText()));
					producto.setIdProveedor(Integer.parseInt(txtProvedor.getText()));
					
					PBD.Update(producto,Integer.parseInt(lblStockR.getText()));
					VaciarCajaTexto();
				
					
					
					System.out.println("update");
				}else {
				ModProducto producto= new ModProducto();
				
				
				producto.setCodProducto(Integer.parseInt(txtcodigo.getText()));
				producto.setDescripcion(txtdescripcion.getText());
				producto.setPCompra(Double.parseDouble(txtcompra.getText()));
				producto.setPVP(Double.parseDouble(txtventa.getText()));
				producto.setStock(Integer.parseInt(txtstock.getText()));
				producto.setIdProveedor(Integer.parseInt(txtProvedor.getText()));
				
				PBD.Insertar(producto);
				VaciarCajaTexto();
			
				
				}
				
				
			}
		});
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				VaciarCajaTexto();
				
			}
		});
		btnCancelar.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCancelar.setVisible(false);
		btnCancelar.setBounds(298, 340, 200, 33);
		contentPane.add(btnCancelar);
		
		
		
		btnRegistrarCompra.setIcon(new ImageIcon("Iconos/iconoGuardar.png"));
		btnRegistrarCompra.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnRegistrarCompra.setBounds(51, 338, 200, 34);
		contentPane.add(btnRegistrarCompra);
		  
		  lblNewLabel = new JLabel("");
		  lblNewLabel.setIcon(new ImageIcon("Iconos/logoCajas.png"));
		  lblNewLabel.setBounds(377, 36, 190, 190);
		  contentPane.add(lblNewLabel);
		  
		  txtProvedor = new JTextField();
		  txtProvedor.setBounds(153, 275, 186, 33);
		  contentPane.add(txtProvedor);
		  txtProvedor.setColumns(10);
		  
		  lblPcompra = new JLabel("P.COMPRA");
		  lblPcompra.setFont(new Font("Dialog", Font.PLAIN, 15));
		  lblPcompra.setBounds(33, 121, 102, 34);
		  contentPane.add(lblPcompra);
		  
		 lblStockR = new JLabel("");
		  lblStockR.setBounds(376, 242, 46, 14);
		  contentPane.add(lblStockR);
		  
		  panel = new JPanel();
		  panel.setBounds(6, 476, 740, 298);
		  contentPane.add(panel);
		  panel.setLayout(null);
		  
		 // table = new JTable();
		  //table.setBounds(6, 6, 728, 286);
		 // panel.add(table);
		  
		  Object filas [][] =new Object [100][6];
			String columnas[] = new String[]{"Codigo","Descripcion","PrecioCompra","P.V.P ","Stock","Proveedor"};
			table = new JTable(filas,columnas);
			table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			table.setBounds(6, 6, 709, 238);
			table.setValueAt("Codigo", 0, 0);
			table.setValueAt("Descripcion", 0, 1);
			table.setValueAt("PrecioCompra", 0, 2);
			table.setValueAt("P.V.P", 0, 3);
			table.setValueAt("Stock", 0, 4);
			table.setValueAt("Proveedor", 0, 5);
			panel.add(table);
			
			txtbuscar = new JTextField();
			txtbuscar.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					
					

					
					
					ProductoBD PBD= new ProductoBD();
					int cont=0;
					
					limpiartable();
					List<ModProducto> d= PBD.SelectDescripcion(txtbuscar.getText());
					
					for(ModProducto t:d){
						cont++;
						
						
						
						table.setValueAt(t.getCodProducto(), cont, 0);
						table.setValueAt(t.getDescripcion(), cont, 1);
						table.setValueAt(t.getPCompra(), cont, 2);
						table.setValueAt(t.getPVP() ,cont, 3);
						table.setValueAt(t.getStock() ,cont, 4);
						table.setValueAt(t.getIdProveedor() ,cont, 5);
						
						
						
						
						}
						
		;
					
					
				
					
				}
			});
			
			txtbuscar.setBounds(132, 411, 306, 33);
			contentPane.add(txtbuscar);
			txtbuscar.setColumns(10);
			
			JLabel lblBusqueda = new JLabel("Busqueda");
			lblBusqueda.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			lblBusqueda.setBounds(33, 410, 139, 33);
			contentPane.add(lblBusqueda);
			
		rellenar();
		  
		 
		
		
	}

	protected void VaciarCajaTexto() {
		txtcodigo.setText("");
		txtcompra.setText("");
		txtdescripcion.setText("");
		txtProvedor.setText("");
		txtstock.setText("");
		txtventa.setText("");
		lblStockR.setText("");

		txtdescripcion.setEditable(true);
		txtProvedor.setEditable(true);
		txtcompra.setEditable(true);
		txtventa.setEditable(true);
		btnCancelar.setVisible(false);
		
	}
	private void rellenar() {
		ProductoBD PBD=new ProductoBD();
		listProduc=PBD.listar();
		int cont=0;
		for(ModProducto t:listProduc ){
		cont++;
		
		
		
		table.setValueAt(t.getCodProducto(), cont, 0);
		table.setValueAt(t.getDescripcion(), cont, 1);
		table.setValueAt(t.getPCompra(), cont, 2);
		table.setValueAt(t.getPVP() ,cont, 3);
		table.setValueAt(t.getStock() ,cont, 4);
		table.setValueAt(t.getIdProveedor() ,cont, 5);
		
		
		
		
		}
		
		
	
		
	
	
		
		
	
		
	}
	
protected void limpiartable() {
		
		
		for (int i = 1; i < table.getRowCount(); i++) {
			table.setValueAt("", i, 0);
			table.setValueAt("", i, 1);
			table.setValueAt("", i, 2);
			table.setValueAt("" ,i, 3);
			table.setValueAt("" ,i, 4);
			table.setValueAt("" ,i, 5);
		}
		
	}
}
