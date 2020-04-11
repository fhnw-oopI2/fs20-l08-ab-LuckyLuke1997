package ab1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		PresentationModel pm = new PresentationModel();
		Parent root = new ApplicationUI(pm, stage);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setHeight(350);
		stage.setWidth(350);
		stage.show();		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
