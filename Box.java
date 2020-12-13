package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.text.Font;

/*
 * Project made and worked on by Samuel Eui Ho Lee and Janet Sujung Cho.
 */

public class Box extends Main {

	public static void display(String str) {
		Stage window = new Stage();

		Label label = new Label("");

		// keyboard output
		switch (str) {
		case "C":
			label = new Label("This is the C key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
			
		case "C#":
			label = new Label("This is the C# key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
			
		case "D":
			label = new Label("This is the D key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
			
		case "D#":
			label = new Label("This is the D# key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
			
		case "E":
			label = new Label("This is the E key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
			
		case "F":
			label = new Label("This is the F key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
			
		case "F#":
			label = new Label("This is the F# key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
			
		case "G":
			label = new Label("This is the G key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
			
		case "G#":
			label = new Label("This is the G# key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
			
		case "A":
			label = new Label("This is the A key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
			
		case "A#":
			label = new Label("This is the A# key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
			
		case "B":
			label = new Label("This is the B key.");
			label.setFont(new Font("Comic Sans", 20));
			break;
		}
		
		
		/* button 1 */

		Button btn = new Button();
		btn.setText("send to console");
		btn.setWrapText(true);
		btn.setTranslateX(90);
		btn.setTranslateY(100);

		btn.setOnAction(e -> {
			System.out.println("Received from Box : "+ str );
			// add close program button
			
		});

		

		StackPane root = new StackPane();
		Scene scene = new Scene(root, 300, 250);

		root.getChildren().add(btn);
		root.getChildren().add(label);

		window.setScene(scene);
		window.show();
	}
}
