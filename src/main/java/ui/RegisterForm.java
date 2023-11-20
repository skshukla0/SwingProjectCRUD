package ui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import listener.OnRegister;

 

public class RegisterForm extends JFrame{
	public JLabel l1,l2,l3,l4;
	public JButton b1,b2,b3;
 
	public JTextField name, email, mobile, password;
	 
	 
	private static final long serialVersionUID = 1L;
	public RegisterForm(String s){
		super(s);
		setSize(300,300);
		setLocation(200, 300);
		l1= new JLabel("Enter name :");
		l2= new JLabel("Enter Email :");
		l3= new JLabel("Enter Mobile :");
		l4= new JLabel("Enter Password :");
		name = new JTextField(10);
//		name.setBackground(Color.RED);
		email = new JTextField(10);
		mobile = new JTextField(10);
		password = new JTextField(10);
		b1 = new JButton("Submit");
		b2 = new JButton("clear");
		b3 = new JButton("Login");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(l1);
		add(name);
		add(l2);
		add(email);
		add(l3);
		add(mobile);
		add(l4);
		add(password);
		add(b1);
		add(b2);
		add(b3);
		new OnRegister(this);
		setVisible(true);
	}
}
	
