package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class carro4Controller {

    @FXML private Label lblAno;
    @FXML private Label lblCor;
    @FXML private Label lblMarca;
    @FXML private Label lblModelo;
    @FXML private Label lblMotor;
    @FXML private Label lblNome;
    @FXML private Label lblEstadodoCarro;
    
    boolean Estadodocarro = false;
   
    public void setDados(String marca, String nome, String motor, String cor, String ano, String modelo) {
        lblMarca.setText(marca);
        lblNome.setText(nome);
        lblMotor.setText(motor);
        lblCor.setText(cor);
        lblAno.setText(ano);
        lblModelo.setText(modelo);
    }
    
    @FXML private void initialize() {
        if(Estadodocarro) {
        	String nome = "Camaro";
        	lblEstadodoCarro.setText("O carro "+nome+" está ligado!");
        	} else {
        		String nome = "Camaro";
            	lblEstadodoCarro.setText("O carro "+nome+" está desligado!");
        	}
        }
    
    @FXML
    public void ligarCarro() {
    	Estadodocarro = true;
    	if(Estadodocarro) {
        	String nome = "Civic";
        	lblEstadodoCarro.setText("O carro "+nome+" está ligado!");
        	} else {
        		String nome = "Civic";
            	lblEstadodoCarro.setText("O carro "+nome+" está desligado!");
        	}
    }
    @FXML
    public void desligarCarro() {
    	Estadodocarro = false;
    	if(Estadodocarro) {
        	String nome = "Civic";
        	lblEstadodoCarro.setText("O carro "+nome+" está ligado!");
        	} else {
        		String nome = "Civic";
            	lblEstadodoCarro.setText("O carro "+nome+" está desligado!");
        	}
    }
    
}
