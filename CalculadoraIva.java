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

public class CalculadoraIva extends JFrame implements ActionListener{
	private JLabel mensaje;
	private JButton boton;
	private JTextField caja1;
	private JTextField caja2;
	
	public CalculadoraIva(){
		super();
		configurarVentana();
		agregarComponentes();
	}
	
	private void configurarVentana(){
		this.setTitle("Calculadora de Iva");
		this.setSize(300,480);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void agregarComponentes(){
		mensaje= new JLabel();
		mensaje.setText("Ingresa una cantidad:");
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
		
		mensaje= new JLabel();
		mensaje.setText("%");
		mensaje.setBounds(85,120, 120, 17);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		caja1 = new JTextField();
		caja1.setBounds(100,72,100,17);
		this.add(caja1);
		
		caja2 = new JTextField();
		caja2.setBounds(100,120,100,17);
		this.add(caja2);
		
		
		boton = new JButton();
		boton.setText("Click here");
		boton.setBounds(50,140,200,20);
		boton.addActionListener(this);
		this.add(boton);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		float porcentaje, resultado, numero;
		numero=java.lang.Float.parseFloat(caja1.getText());
		porcentaje=java.lang.Float.parseFloat(caja2.getText());
		resultado=(numero*porcentaje)/100;
		resultado=resultado+numero;
		JOptionPane.showMessageDialog(this, "El resultado es: "+resultado, "CALCULADORA DE IVA", 1);
	}
	
	public static void main(String[] args){
		CalculadoraIva ventana=new CalculadoraIva();
		ventana.setVisible(true);
	}
}
