package dad.calculadorafxml;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class App extends Application {

	private CalculadoraController controller;
	
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller= new CalculadoraController();
		
		Scene scene= new Scene(controller.getRoot(),400,320);
		
		primaryStage.setTitle("Iniciar sesion");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
