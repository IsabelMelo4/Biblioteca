package ClassesFx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class Dashboard {
    @FXML

    private Button BotaoEntrar;

    public Button getBotaoEntrar() {
        return BotaoEntrar;
    }
    public void usuarioEntrou() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/projetobiblioteca/assets/dashboard.fxml"));
        Scene scene = new Scene(loader.load(), 900, 600);
        Stage stage = (Stage) BotaoEntrar.getScene().getWindow();
        stage.setTitle("Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}
