package dev.lpa.udemy449csswithjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {


  @FXML
  private Label label;

  @FXML
  protected void initialize() {
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
}