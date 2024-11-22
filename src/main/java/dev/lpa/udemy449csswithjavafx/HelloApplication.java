package dev.lpa.udemy449csswithjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader =
        new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//    setUserAgentStylesheet(STYLESHEET_CASPIAN);
    setUserAgentStylesheet(STYLESHEET_MODENA);
    Scene scene = new Scene(fxmlLoader.load(), 600, 275);
    scene.getStylesheets().add(HelloApplication.class.getResource("modena-dark.css")
        .toExternalForm());
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}