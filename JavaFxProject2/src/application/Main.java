package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;


public class Main extends Application {
	private TextField txtField = new TextField();
	private long n1=0;
	private String operator="";
	private boolean start =true;
	@Override
	public void start(Stage primaryStage)throws Exception {
		txtField.setFont(Font.font(20));
		txtField.setPrefHeight(50);
		txtField.setAlignment(Pos.CENTER_RIGHT);
		txtField.setEditable(false);
		StackPane stackpane = new StackPane();
		stackpane.setPadding(new Insets(10));
		stackpane.getChildren().add(txtField);
		
		TilePane tile = new TilePane();
		tile.setHgap(10);
		tile.setVgap(10);
		tile.setAlignment(Pos.TOP_CENTER);
		tile.getChildren().addAll(
				createButtonForNumber("7"),
				createButtonForNumber("8"),
				createButtonForNumber("9"),
				createButtonForOperators("/"),
				
				createButtonForNumber("4"),
				createButtonForNumber("5"),
				createButtonForNumber("6"),
				createButtonForOperators("X"),
				
				createButtonForNumber("1"),
				createButtonForNumber("2"),
				createButtonForNumber("3"),
				createButtonForOperators("+"),
				
				createButtonForNumber("0"),
				createButtonForOperators("C"),
				createButtonForOperators("="),
				createButtonForOperators("-")
				
				
				);

		BorderPane root = new BorderPane();
		root.setTop(stackpane);
		root.setCenter(tile);
		Scene scene = new Scene(root,250,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculator");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	private Button createButtonForNumber(String ch) {
		Button button = new Button(ch);
		button.setFont(Font.font(18));
		button.setPrefSize(50, 50);
		button.setOnAction(this::ClickNumber);
		return button;
	}
	
	private Button createButtonForOperators(String ch) {
		Button button = new Button(ch);
		button.setFont(Font.font(18));
		button.setPrefSize(50, 50);
		button.setOnAction(this::ClickOperator);
		return button;
	}
	
	private Button createButtonForClear(String ch) {
		Button button = new Button(ch);
		button.setFont(Font.font(18));
		button.setPrefSize(50, 50);
		button.setOnAction(e ->{
			txtField.setText("");
			operator="";
			start=true;
		});
		return button;
	}
	private void ClickNumber(ActionEvent e) {
		if(start) {
			txtField.setText("");
			start=false;
		}
		String value=((Button)e.getTarget()).getText();
		txtField.setText(txtField.getText()+value);
	}
	
	private void ClickOperator(ActionEvent e) {
		String value=((Button)e.getTarget()).getText();
		if(!value.equals("=")) {
			if(!operator.isEmpty())
				return;
			n1=Long.parseLong(txtField.getText());
			operator=value;
			txtField.setText("");
			
		}else {
			if(operator.isEmpty())
				return;
			long n2=Long.parseLong(txtField.getText());
			float res=cal(n1,n2,operator);
			txtField.setText(String.valueOf(res));
			start=true;
			operator="";
		}
	}
	private float cal(long number1, long number2, String oper) {
		switch(oper) {
		case "+": return number1+number2;
		case "-": return number1-number2;
		case "X":return number1*number2;
		case "/":
			if(number2==0)
				return 0;
			return number1/number2;
		default: return 0;
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
