package view;

import javafx.fxml.FXML;	
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
}
