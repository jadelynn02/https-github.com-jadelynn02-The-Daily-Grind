package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.User;


public class DatabaseHandler extends Configs {
	Connection dbConnection;
	
public Connection getDbConnection() throws ClassNotFoundException, SQLException {
	String connectionString = "jbdc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
	
	Class.forName("com.mysql.jdbc.Driver");
	
	
	return dbConnection;
	
}

	//Write
public void signUpUser(User user) { 
	String insert = "INSERT INTO "+Const.USERS_TABLE+"("+Const.USERS_FIRSTNAME + ","+Const.USERS_USERNAME+","+Const.USERS_PASSWORD+","+Const.USERS_GENDER+")" + "VALUES(?,?,?,?,?,?)";

try {
	PreparedStatement preparedStatement = getDbConnection().prepareStatement(insert);
	
	preparedStatement.setString( 1, user.getFirstName());
	preparedStatement.setString( 2, user.getUserName());
	preparedStatement.setString( 3,user.getPassword());
	preparedStatement.setString( 4,user.getGender());
	
	preparedStatement.executeUpdate("Finally");
     } catch (SQLException e) {
    	 e.printStackTrace();
     }	catch (ClassNotFoundException e) {
    	 e.printStackTrace();
     } }


	
}

     
//Read
//Update
//Delete



	
