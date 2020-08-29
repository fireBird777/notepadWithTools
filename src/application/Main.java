package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("my first button!");
		button.setLayoutX(350);
		button.setLayoutY(350);
		Pane root = new Pane();
		Scene scene = new Scene(root,800,800);
		root.getChildren().add(button);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String []args)
	{
		launch(args);
	}
	
}
