package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.UserDao;
import ui.LoginForm;
import ui.RegisterForm;
import ui.WelcomeUi;

public class OnLogin implements ActionListener {
	LoginForm log;
	String name ,email,password,mobile;
       public OnLogin(LoginForm log)
       	  {
    	   this.log = log;
    	   log.b1.addActionListener(this);
    	   log.b2.addActionListener(this);
   		   log.b3.addActionListener(this);
    	   }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		   if(log.b1==e.getSource()) {
			   email = log.email.getText();
			   password = log.password.getText();
// System.out.println(password);
 int i = UserDao.loginUser(email,password);
// System.out.println(i);
 if(i != 0) {
	 JOptionPane.showMessageDialog(null,"Login Successful");
	 
	 new WelcomeUi(UserDao.getDataDisplay());
 }
 else {
	 JOptionPane.showMessageDialog(null,"Invalid Credentials! plz try again");
 }
			   
//		    log.dispose();
		    
 

	   
	}
		 else if(log.b2==e.getSource()) {
		      log.email.setText("");
		      log.password.setText("");
		 }
		 else{
			  log.dispose();
			 new RegisterForm("Register Form2"); 
		 }
		 
		
	}
	 public void displayLoginUI() {
	         new LoginForm("LOGIN FORM");
 
	    }
       
}
