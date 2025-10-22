package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class aplicativoController {

    @FXML
    private AnchorPane conteudoPane;

    private void carregarTela(String fxmlfile) {
        try {
            // Verifica se o nome do arquivo é válido
            if (fxmlfile == null || fxmlfile.isEmpty()) {
                throw new IllegalArgumentException("O nome do arquivo FXML não pode ser nulo ou vazio.");
            }

            // Caminho ajustado: pasta 'view' está na raiz do classpath
            String caminho = "/view/" + fxmlfile;
            URL fxmlLocation = getClass().getResource(caminho);

            if (fxmlLocation == null) {
                System.out.println("Arquivo FXML não encontrado: " + caminho);
                return;
            }

            Parent fxml = FXMLLoader.load(fxmlLocation);
            conteudoPane.getChildren().clear();
            conteudoPane.getChildren().add(fxml);

            AnchorPane.setTopAnchor(fxml, 0.0);
            AnchorPane.setBottomAnchor(fxml, 0.0);
            AnchorPane.setLeftAnchor(fxml, 0.0);
            AnchorPane.setRightAnchor(fxml, 0.0);

            Scene cena = conteudoPane.getScene();
            if (cena != null) {
                Stage stage = (Stage) cena.getWindow();
                // Aqui você pode manipular o stage se necessário
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void voltarTelaInicial(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }

    @FXML
    private void abrirPaginaInicial() {
        carregarTela("Principal.fxml");
    }

    @FXML
    private void abrirCalculadora() {
        carregarTela("calculadora.fxml");
    }
    
    @FXML
    private void abrirIMC() {
        carregarTela("calcularIMC.fxml");
    }

    @FXML
    private void initialize() {
        //abrirPaginaInicial();
    }
    
    @FXML
    private void abrirjogo() {
        carregarTela("jogo.fxml");
    }
    
    @FXML
    private void abrirjogotiro() {
        carregarTela("jogotiro.fxml");
    }
    
    @FXML
    private void abrirmedia() {
        carregarTela("media.fxml");
    }
    
    @FXML
    private void abriridade() {
        carregarTela("idade.fxml");
    }
}