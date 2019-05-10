package calculadoraDeIva;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class CalculadoraIvaConLista extends JFrame implements ActionListener{
	private JLabel mensaje;
	private JButton boton;
	private JComboBox iva;
	private JTextField caja1;
	private String selectIva;
	
	public CalculadoraIvaConLista(){
		super();
		configurarVentana();
		agregarComponentes();
	}
	
	private void configurarVentana(){
		this.setTitle("Calculadora de Iva");
		this.setSize(300,250);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void agregarComponentes(){
		mensaje= new JLabel();
		mensaje.setText("Ingresa una cantidad: ");
		mensaje.setBounds(85,45, 130, 30);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		mensaje= new JLabel();
		mensaje.setText("$");
		mensaje.setBounds(85,71, 120, 17);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		mensaje= new JLabel();
		mensaje.setText("Iva");
		mensaje.setBounds(130,90, 130, 30);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		caja1 = new JTextField();
		caja1.setBounds(100,72,100,17);
		this.add(caja1);
		
		boton = new JButton();
		boton.setText("Click here");
		boton.setBounds(50,150,200,20);
		boton.addActionListener(this);
		this.add(boton);
		
		String[] ivaList = new String[] {"N/E","16%","8%"};
		selectIva="N/E";
		JComboBox<String> iva = new JComboBox<>(ivaList);
		iva.setBounds(100,115,100,25);
		iva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				selectIva = iva.getItemAt(iva.getSelectedIndex());
				System.out.println("Seleccion: "+selectIva);
			}
		});
		this.add(iva);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		double resultado = 0;
		double numero = 0;
		if(caja1.getText().length()==0) {
			JOptionPane.showMessageDialog(this, "Ingrese un numero, por favor", "Error 404", 1);
		}else {
			numero=Double.parseDouble(caja1.getText());
			if(selectIva=="16%"){
				resultado=numero*0.16;
			}else if(selectIva=="8%"){
				resultado=numero*0.08;
			}else {
				JOptionPane.showMessageDialog(this, "Seleecione una opcion de Iva", "Error 404", 1);
			}
			
			if(resultado!=0) {
			resultado=resultado+numero;
			JOptionPane.showMessageDialog(this, "El resultado es: "+resultado, "RESULTADO EXITOSO", 1);
			}
		}
	}
	
	public static void main(String[] args){
		CalculadoraIvaConLista ventana=new CalculadoraIvaConLista();
		ventana.setVisible(true);
	}
}
