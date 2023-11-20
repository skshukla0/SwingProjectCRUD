package ui;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class WelcomeUi extends JFrame implements ListSelectionListener 
{
private static final long serialVersionUID = 1L;
static JTable jt;
static JTextField jtf;
Object [][]o;
public WelcomeUi(Object[][] o)
{
 this.o=o;
//jtf=new JTextField(10);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 
String column[]={"id","name","email","mobile","password"};

jt=new JTable(o,column);

 

//add(jtf);
add(new JScrollPane(jt));
//setCellSelectionEnabled(true);
setSize(500,300);
setVisible(true);
}

 
private void setCellSelectionEnabled(boolean b) {
	// TODO Auto-generated method stub
	
}

public void valueChanged(ListSelectionEvent ee)
{
int r=jt.getSelectedRow();
int c=jt.getSelectedColumn();
Object o=jt.getValueAt(r,c);
jtf.setText(o.toString());
}

//public static Object[] yes( ) {
//	JFrame f = new JFrame();
//	String column[]={"name","age","id"};
//	
//	String data[][]=
//	{
//	{"ram","20","100"},{"shyam","21","101"},{"mohan","22","102"}
//	};
//
//	jt=new JTable(data,column);
//
//	 
//	f.add(jtf);
//	f.add(new JScrollPane(jt));
//	//setCellSelectionEnabled(true);
//	f.setSize(500,300);
//	f.setVisible(true);
////	System.out.println("Employee ID: " + row[0] + ", Name: " + row[1] + ", Email: " + row[2] +
////            ", Mobile: " + row[3]+ ", Password: " + row[4] );
//	return null;
//	// TODO Auto-generated method stub
//	
//}
//public static void main(String[] args) {
//	WelcomeUi w=new WelcomeUi();
//	WelcomeUi.yes();
//}
}








