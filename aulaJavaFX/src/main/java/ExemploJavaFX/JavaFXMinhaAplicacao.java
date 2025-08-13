package ExemploJavaFX;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXMinhaAplicacao extends Application{

    @Override
    public void start(Stage palco){
        palco.setTitle("meu primeiro palco");
        palco.show();

    }
    public static void main(String[] args){
        launch(args);
    }

}
