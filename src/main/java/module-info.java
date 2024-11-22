module dev.lpa.udemy449csswithjavafx {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.desktop;
  requires javafx.web;

  opens dev.lpa.udemy449csswithjavafx to javafx.fxml;
  exports dev.lpa.udemy449csswithjavafx;
}