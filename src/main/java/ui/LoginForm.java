package ui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import listener.OnLogin;

public class LoginForm extends JFrame{
	public JLabel l1,l2,l3;
	public JButton b1,b2,b3;
 
	public JTextField email,  password;
	 
	 
	private static final long serialVersionUID = 1L;
	public LoginForm(String s){
		super(s);
		setSize(300,300);
		setLocation(200, 300);
		  
		l1= new JLabel("Enter Email :");
		l2= new JLabel("Enter Password :");
		l3 = new JLabel("New User ! plz Register first");
//		name.setBackground(Color.RED);
		email = new JTextField(10);
		password = new JTextField(10);
		b1 = new JButton("Login");
		b2 = new JButton("clear");
		b3 = new JButton("Register");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
	 
		add(l1);
		add(email);
	 
		add(l2);
		add(password);
		add(b1);
		add(b2);
		add(l3);
		add(b3);
		
		new OnLogin(this);
		setVisible(true);
 
}
}
 
 