package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import view.calculadoraController; 

public class calcularIMCController {

    @FXML private Button btnCalcularIMC;
    @FXML private Label lblResultado;
    @FXML private TextField txtAltura;
    @FXML private TextField txtNome;
    @FXML private TextField txtPeso;

    public void calcularIMC() {
    	String nome=txtNome.getText();
    	double peso=Double.valueOf(txtPeso.getText());
    	double altura=calculadoraController.strtodouble(txtAltura.getText());
    	double imc=peso / (altura*altura);
    	lblResultado.setText("O seu IMC é "+String.format("%.2f",imc));
    }
}

