package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.rst;
//import java.sql.rst;
import java.sql.SQLException;

//import dbPackage.Connections;
import dbPackage.dbConnection;
import dto.UserDto;

public class UserDao {
//	   private static final String Integer = null;

	public static boolean registerUser(UserDto dto) {
	        try {
				Connection connection = dbConnection.getConnection();
	            PreparedStatement prepareStatement = connection.prepareStatement("insert into users(name,email,pass,mobile) values(?,?,?,?)");
	            prepareStatement.setString(1, dto.getName());
	            prepareStatement.setString(2, dto.getEmail());
	            prepareStatement.setString(3, dto.getPassword());
	            prepareStatement.setString(4, dto.getMobile());
				int execute = prepareStatement.executeUpdate();
				  
	            return execute > 0;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return false;
}
public static int loginUser(String email, String password) {
	Connection con = dbConnection.getConnection();
	PreparedStatement myStmt = null;
	ResultSet rst = null; 
 try {
	String sql= "select * from users where email = ? and pass = ?";
	myStmt = con.prepareStatement(sql);
	myStmt.setString(1,email);     
	myStmt.setString(2,password);		
	  rst =myStmt.executeQuery();
//	String i = Integer(rst.getObject(1)).toString();
//	System.out.println(i);
//	int i = rst.getInt("id");
//	System.out.println(rst.getString(1);
//	myStmt
	int i=0;
	while(rst.next()) {
		i++;
	}
//	System.out.println(i);
	
//	myStmt.getInt("name"));
    return i;
	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
	return 0;
}
 
//	   private static Object Integer(Object object) {
//	// TODO Auto-generated method stub
//	return null;
//}
	public static Object[][] getDataDisplay() {
//		 new WelcomeUi();
		    try {
		        Connection connection = dbConnection.getConnection();
		        String queryString = "select * from users";
		        try (PreparedStatement prepareStatement = connection.prepareStatement(queryString, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		             ResultSet resultSet = prepareStatement.executeQuery()) {

		            // Count the number of rows in the result set
		            int rowCount = 0;
		            while (resultSet.next()) {
		                rowCount++;
		            }

		            // Initialize the two-dimensional array with the row count and column count
		            Object[][] result = new Object[rowCount][5]; // Assuming 5 columns, adjust as needed
		            // Reset the result set cursor
		            resultSet.beforeFirst();

		            // Populate the array with data from the result set
		            int rowIndex = 0;
		            while (resultSet.next()) {
		                result[rowIndex][0] = resultSet.getInt("id");
		                result[rowIndex][1] = resultSet.getString("name");
		                result[rowIndex][2] = resultSet.getString("email");
		                result[rowIndex][3] = resultSet.getString("mobile");
		                result[rowIndex][4] = resultSet.getString("pass");
		                // ... Repeat similar lines for other columns as needed
		                rowIndex++;
		            }

		            // Print the data to the console
//		           for (int i = 0; i < result.length; i++) {
//					for (int j = 0; j < 5; j++) {
//						System.out.print(result[i][j]);
////						new WelcomeUi(result[i][j]);
//					}
					
//					System.out.println();
//				}
		              // new WelcomeUi(row);
//		            	System.out.println(row);
		                
		            
		            

		            // Return the populated array
		            return result;
		        }
		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }
		    return null;
		}
	 
	
}
//			rst =myStmt.executeQuery();
//				System.out.println(rst);
//				System.out.println(p);
	 
//		        while(rst.next()) {
//		        	    System.out.print(rst.getString(1));
//			            System.out.print("\t\t"+rst.getString(2));
//			            System.out.print("\t\t"+rst.getString(3));
//			            System.out.print("\t\t"+rst.getString(4));
//			            System.out.print("\t\t"+rst.getString(5));
//			            JOptionPane.showMessageDialog(null,"Login Successfull");
//		        }
//			}
//}
//}




 
	      
