
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Palabras1 extends JFrame implements ActionListener
{
	private JLabel mensaje;
	private JButton boton;
	private JTextField caja1;
	private JTextField caja;
	private JTextField caja2;
	private JTextField caja3;
	private JTextField caja4;
	
	
	public Palabras1()
	{
		super();
		configurarVentana();
		agregarComponentes();
	}
	
	private void configurarVentana()
	{
		this.setTitle("Palabras");
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void agregarComponentes()
	{
		mensaje= new JLabel();
		mensaje.setText("Ingresa una palabra: ");
		mensaje.setBounds(10,50,300,30);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		mensaje= new JLabel();
		mensaje.setBounds(10,71, 120, 17);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		mensaje= new JLabel();
		mensaje.setText("Longitud: ");
		mensaje.setBounds(10,80, 130, 30);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		caja1 = new JTextField();
		caja1.setBounds(180,90,150,20);
		caja1.setEnabled(false);
		this.add(caja1);
		
		caja2 = new JTextField();
		caja2.setBounds(180,118,150,20);
		caja2.setEnabled(false);
		this.add(caja2);
		
		caja3 = new JTextField();
		caja3.setBounds(180,150,150,20);
		caja3.setEnabled(false);
		this.add(caja3);
		
		caja4 = new JTextField();
		caja4.setBounds(180,180,150,20);
		caja4.setEnabled(false);
		this.add(caja4);
		
		mensaje= new JLabel();
		mensaje.setText("Palindromo: ");
		mensaje.setBounds(10,110, 120, 30);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		mensaje= new JLabel();
		mensaje.setText("Palabra al revez: ");
		mensaje.setBounds(10,140, 120, 30);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		mensaje= new JLabel();
		mensaje.setText("Letra que más se repite: ");
		mensaje.setBounds(10,170, 200, 30);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		caja = new JTextField();
		caja.setBounds(140,59,100,17);
		this.add(caja);
		
		boton = new JButton();
		boton.setText("Click here");
		boton.setBounds(40,250,200,20);
		boton.addActionListener(this);
		this.add(boton);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String palabra = caja.getText();
		caja1.setText(""+palabra.length());
		StringBuilder sb = new StringBuilder(palabra);
		String revez = sb.reverse().toString();
		caja3.setText(""+revez);
		if(revez.equals(palabra))
		{
			caja2.setText("Palabra palíndroma");
		}
		else
		{
			caja2.setText("Palabra NO palídroma");
		}
		//:)
		char[] array = palabra.toCharArray();
				int count = 1;
				int max = 0;
				char maxChar = 0;
				for(int i=1; i<array.length; i++){
				    if(array[i]==array[i-1]){
				        count++;
				    } else {
				        if(count>max){ 
				            max=count;
				            maxChar=array[i-1];
				        }
				        count = 1; 
				    }
				}
				if(count>max){
				    max=count;
				    maxChar=array[array.length-1];
				}
				caja4.setText(""+maxChar);
	}
	
	public static void main(String[] args)
	{
		Palabras1 ventana = new Palabras1();
		ventana.setVisible(true);
	}
}
