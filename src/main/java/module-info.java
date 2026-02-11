module ugurbil.com.demo50 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ugurbil.com.demo50 to javafx.fxml;
    exports ugurbil.com.demo50;
}