module dev.lpa.udemy449csswithjavafx {
  requires javafx.controls;
  requires javafx.fxml;

  opens dev.lpa.udemy449csswithjavafx to javafx.fxml;
  exports dev.lpa.udemy449csswithjavafx;
}