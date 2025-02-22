package org.iamme.silverfish;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class FXMLApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass()
			.getResource("/fxml/Scene.fxml"));
		Scene scene = new Scene(root, Color.LIGHTYELLOW);
/*		scene.getStylesheets().add(getClass()
			.getResource("/styles/Styles.css").toExternalForm());
*/
		stage.setTitle("silverfish");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
	launch(args);
	}
}
