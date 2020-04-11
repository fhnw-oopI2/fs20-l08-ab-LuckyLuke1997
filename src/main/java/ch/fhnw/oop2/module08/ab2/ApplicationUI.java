package ab2;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
	
	private Button button;
	private PresentationModel PresModel;

	public ApplicationUI(PresentationModel pm) {
		this.PresModel = pm;
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		button = new Button();
		button.textProperty().bind(PresModel.getButtonProperty());
	}
	
	private void layoutControls() {
		button.setOnAction(event -> PresModel.Switch());
		this.getChildren().addAll(button);
	}
}
