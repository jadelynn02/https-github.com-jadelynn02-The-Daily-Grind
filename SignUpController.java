package Controller;

import java.awt.Button;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import Database.DatabaseHandler;
import Model.User;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ButtonBase;


public class SignUpController {

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private Button signUpButton;

	    @FXML
	    private CheckBox signUpCheckBoxFemale;

	    @FXML
	    private CheckBox signUpCheckBoxMale;

	    @FXML
	    private CheckBox signUpCheckBoxThey;
	 
	    @FXML
	    private PasswordField signUpPassword; 
	    
	    @FXML
	    private TextField signUpUserName;

	    @FXML
	    private TextField signUpFirstName;
	    
	    
	    void initialize() {
	    	DatabaseHandler databaseHandler = new DatabaseHandler();
	    	
	        signUpButton.setOnAction( event -> {
	        	
	        	databaseHandler.signUpUser(signUpFirstName.getText(), signUpUserName.getText(),signUpPassword.getText());
	        });
	    }

	    

private void createUser() { 
	
	String name = signUpFirstName.getText();	
	String username = signUpUserName.getText();	
	String password = signUpPassword.getText();	
	
	String gender;
	if   (signUpCheckBoxFemale.isSelected()) {
		gender = "Female";
	}
	
	else if (signUpCheckBoxMale.isSelected()) { 
		gender = "Male";
	}
	
	else   { 
		gender = "Tey/Them";
}
	
	User user = new User(name,username, password,gender, gender);
	DatabaseHandler databaseHandler = new DatabaseHandler();

	databaseHandler. signUpUser(user);
}
}

	
