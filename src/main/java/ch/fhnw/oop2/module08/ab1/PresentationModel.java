package ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class PresentationModel {
	
	private StringProperty buttonTextProperty;
	private StringProperty windowTitleProperty;
	
	public PresentationModel() {
		buttonTextProperty = new SimpleStringProperty("Hello World!");
		windowTitleProperty = new SimpleStringProperty("JavaFX Application");			
	}	

	public StringProperty getButtonTextProperty() {
		return buttonTextProperty;		
	}
	
	public StringProperty getWindowTitleProperty() {
		return windowTitleProperty;		
	}

}
