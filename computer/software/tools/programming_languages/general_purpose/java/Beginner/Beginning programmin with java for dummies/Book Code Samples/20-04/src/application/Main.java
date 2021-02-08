package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
  @Override
  public void start(Stage primaryStage) {
    try {
      // BorderPane root = new BorderPane();
      Parent root = FXMLLoader.load(getClass().
                            getResource("Root.fxml"));
      Scene scene = new Scene(root, 400, 400);
      scene.getStylesheets().
         add(getClass().getResource("application.css").
                                      toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
  
  @FXML
  private TextField textField;

  @FXML
  protected void onClick(ActionEvent event) {
    textField.setText(textField.getText().toUpperCase());
  }

}
