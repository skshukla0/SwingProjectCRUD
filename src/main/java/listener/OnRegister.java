package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.JOptionPane;

 
import ui.RegisterForm;
 
import ui.LoginForm;
import dto.UserDto;
import dao.UserDao;

public class OnRegister implements ActionListener {
	RegisterForm reg;
	String name ,email,password,mobile;
       public OnRegister(RegisterForm reg)
       	  {
    	   this.reg = reg;
    	   reg.b1.addActionListener(this);
    	   reg.b2.addActionListener(this);
   		   reg.b3.addActionListener(this);
    	   }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		   if(reg.b1==e.getSource()) {
			 
			   name = reg.name.getText();
			   email = reg.email.getText();
			   mobile = reg.mobile.getText();
			   password = reg.password.getText();
//			   System.out.println(name + email + mobile + password);
			   UserDto userDto = new UserDto(name, email,mobile,password);
//			   UserDto.getEmail();
			   boolean registerUser = UserDao.registerUser(userDto);
			   
			   if (registerUser) {
	                displayLoginUI();
	                reg.dispose();
	                JOptionPane.showMessageDialog(null, "Register Sucess");
	            } else {
	                displayLoginUI();
	                reg.dispose();
	                JOptionPane.showMessageDialog(null, "Register Fail");
	            }
		    
 

	   
	}
		 else if(reg.b2==e.getSource()) {
			 reg.name.setText("");
		      reg.email.setText("");
		      reg.mobile.setText("");
		      reg.password.setText("");
		 }
		 else{
			  reg.dispose();
			 new LoginForm("Login Form2"); 
		 }
		 
		
	}
	 public void displayLoginUI() {
	        LoginForm loginUserUI = new LoginForm("LOGIN FORM");
//	        loginUserUI.setLayout(null);
//	        loginUserUI.setVisible(true);
	    }
       
}
