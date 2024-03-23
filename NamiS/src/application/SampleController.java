package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {
	
	
	@FXML
    private Button mybutton;

    @FXML
    private Label welcome;

    @FXML
    void Clickmybutton(ActionEvent event) {
    	welcome.setText("Hey Priyancy");
    }
}
