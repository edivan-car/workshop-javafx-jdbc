package gui.util;

import javafx.scene.control.TextField;

public class Constraints {

	// Controlar o comportamento do Controller
	// Control Controller Behavior

	public static void setTextFieldInteger(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			// Verificar se o valor não é nullo e a expressão regular é um número inteiro
			// Check if value is not null and regular expression is an integer
			if (newValue != null && !newValue.matches("\\d*")) {
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			// Verificar se o valor não é nullo e a expressão regular é maior que o máximo
			// Check if the value is not null and the regular expression is greater than the
			// maximum
			if (newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			// Verificar se o valor não é nullo e a expressão regular é um número double
			// Check if the value is not null and the regular expression is a double number
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValue);
			}
		});
	}
}
