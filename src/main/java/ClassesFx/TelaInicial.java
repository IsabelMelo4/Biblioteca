package ClassesFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaInicial extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader load = new FXMLLoader(TelaInicial.class.getResource("/com/example/projetobiblioteca/assets/TelaInicial.fxml"));
        Scene scene = new Scene(load.load(), 900, 600);
        primaryStage.setTitle("login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
