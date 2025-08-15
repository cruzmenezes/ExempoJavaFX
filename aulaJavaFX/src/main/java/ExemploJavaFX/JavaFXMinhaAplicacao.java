package ExemploJavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JavaFXMinhaAplicacao extends Application {

    @Override
    public void start(Stage palco) {
        // Criando um texto para exibir
        Label mensagem = new Label("Hello World!");

        // Criando a cena com largura e altura
        Scene cena = new Scene(mensagem, 300, 200);

        // Configurando o palco
        palco.setTitle("Meu Primeiro Palco");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação JavaFX
    }
}

