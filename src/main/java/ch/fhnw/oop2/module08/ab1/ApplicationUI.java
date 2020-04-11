package ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ApplicationUI extends StackPane{

	private Button button;
	
	public ApplicationUI(PresentationModel pm, Stage stage) {
		initializeControls(pm, stage);
		layoutControls();
	}
	
	private void initializeControls(PresentationModel pm, Stage stage){
		button = new Button();
		
		button.textProperty().bind(pm.getButtonTextProperty());
		stage.titleProperty().bind(pm.getWindowTitleProperty());
	} 
	
	private void layoutControls(){
		getChildren().add(button);		
	}
}
