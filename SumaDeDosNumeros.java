import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class SumaDeDosNumeros extends JFrame implements ActionListener{
	private JLabel mensaje;
	private JButton boton;
	private JTextField caja1;
	private JTextField caja2;
	
	public SumaDeDosNumeros(){
		super();
		configurarVentana();
		agregarComponentes();
	}
	
	private void configurarVentana(){
		this.setTitle("Suma dos numeros");
		this.setSize(300,200);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void agregarComponentes(){
		mensaje= new JLabel();
		mensaje.setText("Ingresa dos numeros para una adición: ");
		mensaje.setBounds(10,45, 500, 30);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		caja1 = new JTextField();
		caja1.setBounds(100,72,100,17);
		this.add(caja1);
		
		caja2 = new JTextField();
		caja2.setBounds(100,92,100,17);
		this.add(caja2);
		
		boton = new JButton();
		boton.setText("Click here");
		boton.setBounds(50,110,200,20);
		boton.addActionListener(this);
		this.add(boton);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		float num1Ent, num2Ent, suma;
		String num1 = caja1.getText();
		String num2 = caja2.getText();
		num1Ent=java.lang.Float.parseFloat(num1);
		num2Ent=java.lang.Float.parseFloat(num2);
		suma=num1Ent+num2Ent;
		JOptionPane.showMessageDialog(this, "El resultado es: "+suma, "Suma de dos numeros", 1);
	}
	
	public static void main(String[] args){
		SumaDeDosNumeros ventana=new SumaDeDosNumeros();
		ventana.setVisible(true);
	}
}