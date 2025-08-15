package ExemploJavaFX;

package ExemploJavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Aplicação JavaFX que exibe "Hello, World!" na tela.
 */
public class HelloWorldJavaFX extends Application {

    @Override
    public void start(Stage palco) {
        // Cria um rótulo (texto) com a mensagem
        Label mensagem = new Label("Hello, World!");

        // Cria um layout e adiciona o rótulo
        StackPane raiz = new StackPane();
        raiz.getChildren().add(mensagem);

        // Cria a cena (conteúdo da janela)
        Scene cena = new Scene(raiz, 300, 200);

        // Configura o palco (janela)
        palco.setTitle("Exemplo Hello World JavaFX");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        // Inicia a aplicação JavaFX
        launch(args);
    }
}
