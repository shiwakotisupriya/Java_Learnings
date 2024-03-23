package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {  //event
		// controls
		//1. Adding a button
		
		Button btn=new Button("Click!");
		Button button=new Button("Click Me!");
		
		//2. Define a Scene and add to a layout
		/*  HBox root = new HBox(); */  //HBox is layout there are 6 layouts horizontal box
		VBox root = new VBox();  // vertical box
		//3.Add the controls to the layout
		root.getChildren().add(btn);
		root.getChildren().add(button);
		
		
		//4. we have to add this layout to a Scene
		Scene sc =  new Scene(root);
		//5. we have to add this Scene to Stage
		primaryStage.setScene(sc);
		//Display
		primaryStage.setTitle("JavaFX Application");// to set title
		primaryStage.setFullScreen(false);//for setting full screen
		primaryStage.setHeight(300);
		primaryStage.setWidth(800);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
