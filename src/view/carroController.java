package view;

import java.net.URL;	
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class carroController {
	  @FXML private Button btnCarro1;
	  @FXML private Button btnCarro2;
	  @FXML private Button btnCarro3;
	  @FXML private Button btnCarro4;
	  @FXML private Button btnCarro5;
	  @FXML private AnchorPane conteudoPane;
	  
	public String Marca,Nome,Motor,Cor,Ano,Modelo;

	public void exibirinformações(int id_carro){
		
		switch(id_carro){
		case 1:{
			 Marca = "Marca: Chevrolet";
			 Nome = "Nome: Camaro";
			 Motor = "Motor: V8";
			 Cor = "Cor: Amarelo";
			 Ano = "Ano: 2010";
			 Modelo = "Modelo: Camaro SS";
			 break;
		}
		case 2:{
			 Marca = "Marca: Buggati";
			 Nome = "Nome: Chiron";
			 Motor = "Motor: V12";
			 Cor = "Cor: Azul";
			 Ano = "Ano: 2020";
			 Modelo = "Modelo: Chiron";
			 break;
		}
		case 3:{
			 Marca = "Marca: Ferrari";
			 Nome = "Nome: Ferrari SF90";
			 Motor = "Motor: V8";
			 Cor = "Cor: Vermelho";
			 Ano = "Ano: 2021";
			 Modelo = "Marca: SF90";
			 break;
		}
		case 4:{
			 Marca = "Marca: Honda";
			 Nome = "Nome: Honda Civic";
			 Motor = "Motor: 2.0";
			 Cor = "Cor: Cinza";
			 Ano = "Ano: 2022";
			 Modelo = "Modelo: Civic";
			 break;
		}
		case 5:{
			 Marca = "Marca: Volkswagen";
			 Nome = "Nome: Fusca";
			 Motor = "Motor: F";
			 Cor = "Cor: Azul";
			 Ano = "Ano: 1969";
			 Modelo = "Modelo: Fusca";
			 break;
		}
		}
	}
	
	@FXML
    private void selecionarCarro1() {
		exibirinformações(1);
		try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Carro1.fxml"));
	        Parent fxml = loader.load();

	        carro1Controller controller = loader.getController();

	        controller.setDados(Marca, Nome, Motor, Cor, Ano, Modelo);

	        conteudoPane.getChildren().clear();
	        conteudoPane.getChildren().add(fxml);

	        AnchorPane.setTopAnchor(fxml, 0.0);
	        AnchorPane.setBottomAnchor(fxml, 0.0);
	        AnchorPane.setLeftAnchor(fxml, 0.0);
	        AnchorPane.setRightAnchor(fxml, 0.0);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
    }

    @FXML
    private void selecionarCarro2() {
    	exibirinformações(2);
    	try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Carro2.fxml"));
	        Parent fxml = loader.load();

	        carro1Controller controller = loader.getController();

	        controller.setDados(Marca, Nome, Motor, Cor, Ano, Modelo);

	        conteudoPane.getChildren().clear();
	        conteudoPane.getChildren().add(fxml);

	        AnchorPane.setTopAnchor(fxml, 0.0);
	        AnchorPane.setBottomAnchor(fxml, 0.0);
	        AnchorPane.setLeftAnchor(fxml, 0.0);
	        AnchorPane.setRightAnchor(fxml, 0.0);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
    }

    @FXML
    private void selecionarCarro3() {
    	exibirinformações(3);
    	try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Carro3.fxml"));
	        Parent fxml = loader.load();

	        carro1Controller controller = loader.getController();

	        controller.setDados(Marca, Nome, Motor, Cor, Ano, Modelo);

	        conteudoPane.getChildren().clear();
	        conteudoPane.getChildren().add(fxml);

	        AnchorPane.setTopAnchor(fxml, 0.0);
	        AnchorPane.setBottomAnchor(fxml, 0.0);
	        AnchorPane.setLeftAnchor(fxml, 0.0);
	        AnchorPane.setRightAnchor(fxml, 0.0);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
    }

    @FXML
    private void selecionarCarro4() {
    	exibirinformações(4);
    	try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Carro4.fxml"));
	        Parent fxml = loader.load();

	        carro1Controller controller = loader.getController();

	        controller.setDados(Marca, Nome, Motor, Cor, Ano, Modelo);

	        conteudoPane.getChildren().clear();
	        conteudoPane.getChildren().add(fxml);

	        AnchorPane.setTopAnchor(fxml, 0.0);
	        AnchorPane.setBottomAnchor(fxml, 0.0);
	        AnchorPane.setLeftAnchor(fxml, 0.0);
	        AnchorPane.setRightAnchor(fxml, 0.0);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
    }

    @FXML
    private void selecionarCarro5() {
    	exibirinformações(5);
    	try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Carro5.fxml"));
	        Parent fxml = loader.load();

	        carro1Controller controller = loader.getController();

	        controller.setDados(Marca, Nome, Motor, Cor, Ano, Modelo);

	        conteudoPane.getChildren().clear();
	        conteudoPane.getChildren().add(fxml);

	        AnchorPane.setTopAnchor(fxml, 0.0);
	        AnchorPane.setBottomAnchor(fxml, 0.0);
	        AnchorPane.setLeftAnchor(fxml, 0.0);
	        AnchorPane.setRightAnchor(fxml, 0.0);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
    }
}