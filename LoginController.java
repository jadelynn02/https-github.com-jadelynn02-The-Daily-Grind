package Controller;

import java.awt.Button;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

public class LoginController {

	private static final javafx.scene.control.TextField LoginButton = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	
	@FXML
    private ResourceBundle resources;


    @FXML
    private JButton loginButton;

    @FXML
    private JPasswordField loginPassword;

    @FXML
    private JButton loginSignupButton;

    @FXML
    private JTextField loginUsername;

    @FXML
    
    void initialize() { 
    	String loginText = loginUsername.getText().trim();
    	String loginPwd = loginPassword.getText().trim();
  
    loginButton.setAction(event ->{
    	
    });
    
    Button button = new Button("loginSignupButton");
    
    loginSignupButton.setAction(event ->{
    		loginsignupButton.getScene().getWindow().hide();
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(getClass().getResource("/sample/view.signup.fxml"));
    		
    	try {
    		loader.load();
         }
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    	Parent root = loader.getRoot();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root));
    	stage.showAndWait();
    	});
    	
		LoginButton.setOnAction(event -> {
    		if (!loginText.equals("") || loginPwd.equals("")) {
    			loginUser(loginText, loginPwd);
    		}
    		
    		else {
    			System.out.println("Error login in user");
    		} } ); }
     			
	
    		
		
	private void loginUser(String userName, String password) {
		// Check in the database if the user exists, if true take them to AddItem Screen;
		
		if (! userName.equals("") || !password.equals("")){
			
		}
		
		else {
			
			
		}
	};
    		
    	
    }
