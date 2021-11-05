package dad.calculadorafxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class CalculadoraController implements Initializable{

	private Calculadora calculadora= new Calculadora();
	
	
		@FXML
		private GridPane root;
		
		@FXML
	    private Button CButton;

	    @FXML
	    private Button CEButton;

	    @FXML
	    private Button ceroButton;

	    @FXML
	    private Button cincoButton;

	    @FXML
	    private Button comaButton;

	    @FXML
	    private Button cuatroButton;

	    @FXML
	    private Button divisionButton;

	    @FXML
	    private Button dosButton;

	    @FXML
	    private Button multiplicacionButton;

	    @FXML
	    private Button nueveButton;

	    @FXML
	    private TextField numeradorTextField;

	    @FXML
	    private Button ochoButton;

	    @FXML
	    private Button restaButton;

	    @FXML
	    private Button resultadoButton;

	    @FXML
	    private Button seisButton;

	    @FXML
	    private Button sieteButton;

	    @FXML
	    private Button sumaButton;

	    @FXML
	    private Button tresButton;

	    @FXML
	    private Button unoButton;

	    @FXML
	    void OnCAction(ActionEvent event) {
	    	calculadora.borrar();
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnCEAction(ActionEvent event) {
	    	calculadora.borrarTodo();
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnCuatroAction(ActionEvent event) {
	    	calculadora.insertar('4');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnDosAction(ActionEvent event) {
	    	calculadora.insertar('2');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnSumaAction(ActionEvent event) {
	    	calculadora.operar('+');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnceroAction(ActionEvent event) {
	    	calculadora.insertar('0');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OncincoActon(ActionEvent event) {
	    	calculadora.insertar('5');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OncomaAction(ActionEvent event) {
	    	calculadora.insertarComa();
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OndivisionAction(ActionEvent event) {
	    	calculadora.operar('/');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnmultiplicacionAction(ActionEvent event) {
	    	calculadora.operar('*');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnnueveAction(ActionEvent event) {
	    	calculadora.insertar('9');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnochoAction(ActionEvent event) {
	    	calculadora.insertar('8');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnrestaAction(ActionEvent event) {
	    	calculadora.operar('-');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnresultadoAction(ActionEvent event) {
	    	calculadora.operar('=');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnseisAction(ActionEvent event) {
	    	calculadora.insertar('6');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnsieteAction(ActionEvent event) {
	    	calculadora.insertar('7');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OntresAction(ActionEvent event) {
	    	calculadora.insertar('3');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void OnunoAction(ActionEvent event) {
	    	calculadora.insertar('1');
	    	numeradorTextField.setText(calculadora.getPantalla());
	    }
		
	


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	public GridPane getRoot() {
		return root;
	}
	
	public CalculadoraController()throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
}
