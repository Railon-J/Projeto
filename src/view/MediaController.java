package view;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MediaController {
	
	    @FXML  private Button btnMedia;
        @FXML private Label lblResultado;
        @FXML private TextField txtNota1;
        @FXML private TextField txtNota2;
        @FXML private TextField txtNota3;
	    @FXML private TextField txtNota4;
	    @FXML private Label lblSituacao;
	    
	    @FXML
		private void initialize() {
			// Ao pressionar enter no campo usuário foca a edição no campo senha
			txtNota1.setOnAction(e->{txtNota2.requestFocus();});
			txtNota2.setOnAction(e->{txtNota3.requestFocus();});
			txtNota3.setOnAction(e->{txtNota4.requestFocus();});
			// Ao pressionar enter no campo senha aciona o metodo entrar
			txtNota4.setOnAction(e->{calcularMedia();});
		}

	    public void calcularMedia() {
	    	double nt1=Double.valueOf(txtNota1.getText());
	    	double nt2=Double.valueOf(txtNota2.getText());
	    	double nt3=Double.valueOf(txtNota3.getText());
	    	double nt4=Double.valueOf(txtNota4.getText());
	    	double media=(nt1+nt2+nt3+nt4)/4;
	    	lblResultado.setText("Resultado: "+media);
	    	String clasf;
	    	if(media<4) {
	    		clasf = "Reprovado";
	    	} else if(media<7){
	    		clasf = "De recuperação";
	    	} else {
	    		clasf = "Aprovado";
	    	}
	    	lblSituacao.setText("Situação do Aluno: "+clasf);
	    }
	    
	    @FXML
	    private void voltarTelaInicial(ActionEvent event) {
	        try {
	            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/aplicativo.fxml"));
	            Parent root = loader.load();

	            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	            stage.setScene(new Scene(root));
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	            
	        }
	    }
}
