package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class SampleController {

    @FXML
    private Button btn_four;

    @FXML
    private Button btn_one;

    @FXML
    private Button btn_three;

    @FXML
    private Button btn_two;

    @FXML
    private TextArea feild_one;

    @FXML
    private TextArea feild_three;
    enum Operators{
    	add ,sub, mul,div
    }

    @FXML
    private TextArea feild_two;

    @FXML
    void Add(ActionEvent event) {
    	feild_three.setText(String.valueOf(calculate(Operators .add)));
    }

    @FXML
    void Min(ActionEvent event) {
    	feild_three.setText(String.valueOf(calculate(Operators .sub)));
    }

    @FXML
    void Mul(ActionEvent event) {
    	feild_three.setText(String.valueOf(calculate(Operators .mul)));

    }

    @FXML
    void div(ActionEvent event) {
    	feild_three.setText(String.valueOf(calculate(Operators .div)));

    }
    
    
    private double calculate(Operators operation) {
    	double nmbr1 = Double.parseDouble(feild_one.getText());
    	double nmbr2 = Double.parseDouble(feild_two.getText());
    	
    	switch(operation) {
    	case add:
    		return nmbr1+nmbr2;
    	case sub:
    		return nmbr1-nmbr2;
    	case div:
    		return nmbr1/nmbr2;
    	case mul:
    		return nmbr1*nmbr2;
    	default: return 0.0;
    	
    	}
    	
    }

}

