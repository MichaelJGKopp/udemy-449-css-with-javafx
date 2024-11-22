package dev.lpa.udemy449csswithjavafx;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

public class HelloController {

  @FXML
  private Label label;

  @FXML
  private Button button4;

  @FXML
  private GridPane gridPane;

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
//    FileChooser chooser = new FileChooser();  // for files not directories
    DirectoryChooser chooser = new DirectoryChooser();
    File file = chooser.showDialog(gridPane.getScene().getWindow());  // set parent
    if(file != null) {
      System.out.println(file.getPath());
    } else {
      System.out.println("Chooser was cancelled.");
    }
  }
}