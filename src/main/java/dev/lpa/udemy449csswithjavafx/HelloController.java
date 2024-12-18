package dev.lpa.udemy449csswithjavafx;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.scene.web.WebView;

public class HelloController {

  @FXML
  private Label label;

  @FXML
  private Button button4;

  @FXML
  private GridPane gridPane;

  @FXML
  private WebView webView;

  @FXML
  protected void initialize() {
    button4.setEffect(new DropShadow());
  }

  @FXML
  public void handleMouseEnter(){
    label.setScaleX(2.0);
    label.setScaleY(2.0);
  }

  @FXML
  public void handleMouseExit(){
    label.setScaleX(1.0);
    label.setScaleY(1.0);
  }

  @FXML
  public void handleClick() {
    FileChooser chooser = new FileChooser();  // for files not directories
    chooser.setTitle("Save Application File");
    chooser.getExtensionFilters().addAll(
        new FileChooser.ExtensionFilter("Text", "*.txt"),
        new FileChooser.ExtensionFilter("Zip", "*.zip"),
        new FileChooser.ExtensionFilter("PDF", "*.pdf"),
        new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.gif"),
        new FileChooser.ExtensionFilter("All Files", "*.*")
    );

//    DirectoryChooser chooser = new DirectoryChooser();
//    File file = chooser.showDialog(gridPane.getScene().getWindow());  // set parent
//    File file = chooser.showOpenDialog(gridPane.getScene().getWindow());  // set parent
    List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());  // set parent
    if(file != null) {
      for(int i = 0; i < file.size(); i++) {
        System.out.println(file.get(i));
      }
//      System.out.println(file.getPath());
    } else {
      System.out.println("Chooser was cancelled.");
    }
  }

  @FXML
  public void handleLinkClick() {
//    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
//      try {
//        Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
//      } catch (IOException | URISyntaxException e) {
//        e.printStackTrace();
//      }
//    } else {
//      System.err.println("Desktop or browse action is not supported on this platform.");
//    }
    System.out.println("Trying to load page");
    WebEngine engine = webView.getEngine();
    engine.load("https://www.example.com");
  }
}