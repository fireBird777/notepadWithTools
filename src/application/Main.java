package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class Main extends Application {

	@Override
<<<<<<< HEAD
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
=======
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("my first button!");
		button.setLayoutX(350);
		button.setLayoutY(350);
		Pane root = new Pane();
		Scene scene = new Scene(root,800,800);
		root.getChildren().add(button);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
>>>>>>> db8296913ac7a58d933925bbd4a2cc8eabf70ce0
	}
	
	public static void main(String []args)
	{
		launch(args);
	}
	
}
