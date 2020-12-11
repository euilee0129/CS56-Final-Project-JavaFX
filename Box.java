package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Box extends Main {

	public static void display() {
		Stage window = new Stage();
		//window.initModality(Modality.APPLICATION_MODAL);
		Label label = new Label("C");

		StackPane root = new StackPane();

		Scene scene = new Scene(root, 300, 250);

		// login
		Button OutputButton = new Button("Log in");
		OutputButton.setOnAction(e -> {
			System.out.println("Log in Success!!");
			window.setScene(scene);
		});

		// add to grid
		// root.getChildren().add(OutputB))
		root.getChildren().add(label);

		window.setScene(scene);
		window.show();
	}
}



// work in process

this is the box that will open up when we press c de g to show c de g on a different scene
instead of console