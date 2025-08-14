package ExemploJavaFX;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Exemplo simples de aplicação JavaFX.
 * Exibe uma janela (Stage) com um título.
 */
public class JavaFXMinhaAplicacao extends Application {

    @Override
    public void start(Stage palco) {
        // Define o título da janela
        palco.setTitle("Meu Primeiro Palco");

        // Exibe a janela
        palco.show();
    }

    public static void main(String[] args) {
        // Inicia a aplicação JavaFX
        launch(args);
    }
}
