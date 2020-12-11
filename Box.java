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

public class Box extends Main {

	public static void display(String str) {
		Stage window = new Stage();
		
		Label label = new Label("");
		
		
		//------------
		   switch(str) {
         case "C" :
        	 label = new Label("C");
            break;
         case "C#" :
        	 label = new Label("C#");
            break;
         case "D" :
        	 label = new Label("D");
            break;
         case "D#" :
        	 label = new Label("D#");
            break;
         case "E" :
        	 label = new Label("E");
            break;
         case "F" :
        	 label = new Label("F");
            break;
         case "F#" :
        	 label = new Label("F#");
            break;
         case "G" :
        	 label = new Label("G");
            break;
         case "G#" :
        	 label = new Label("G#");
            break;
         case "A" :
        	 label = new Label("A");
            break;
         case "A#" :
        	 label = new Label("A#");
            break;
         case "B" :
        	 label = new Label("B");
            break;
		   }
            
		 ///------
		
		
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 300, 250);

		
		root.getChildren().add(label);

		window.setScene(scene);
		window.show();
	}
}
