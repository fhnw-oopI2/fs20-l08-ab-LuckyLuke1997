package ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

	private StringProperty buttonProp = new SimpleStringProperty();
	private StringProperty titleProp = new SimpleStringProperty();

	public PresentationModel() {
		setButtonProperty(Switch.ON);
		setTitleProperty("Toggle Application");
	}

	public StringProperty getButtonProperty() {
		return buttonProp;
	}

	public StringProperty getTitleProperty() {
		return titleProp;
	}

	public void setButtonProperty(Switch buttonProperty) {
		this.buttonProp.setValue(buttonProperty.toString());
	}

	public void setTitleProperty(String titleProperty) {
		this.titleProp.setValue(titleProperty);
	}

	public void Switch() {
		setButtonProperty(Switch.valueOf(getButtonProperty().getValue()).inverse());
	}
	

	public enum Switch {
		ON, OFF;
		
		public Switch inverse() {
			if (this.equals(ON)) {
				return OFF;
			}
			return ON;
		}
	}
	
}
