package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

/*
 * Project made and worked on by Samuel Eui Ho Lee and Janet Sujung Cho.
 */

public class Main extends Application {

	public static void main(String[] args) {

		// Java FX client something
		try (Socket socket = new Socket("localhost", 8080); Scanner scanner = new Scanner(System.in)) {

			// in & out
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

			/// ----------
			launch(args);
			// ------

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Keyboard JavaFX");

		/* button 1 */

		Button btn = new Button(); /// C
		btn.setText("C");
		btn.setAlignment(Pos.BOTTOM_CENTER);
		btn.setStyle("-fx-font-family: Comic Sans;" + "-fx-font-weight: bold;");
		btn.setMaxSize(70, 200);
		btn.setTranslateX(-300);

		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(btn.getText());

			}
		}); // e ->

		/** black button 1 **/

		Button blk1 = new Button();
		blk1.setText("C#");
		blk1.setMaxSize(50, 120);
		blk1.setTranslateY(-40);
		blk1.setAlignment(Pos.BOTTOM_CENTER);
		blk1.setStyle("-fx-background-color: #070707;" + "-fx-text-fill: #FFFFFF;" + "-fx-font-family: Comic Sans;"
				+ "-fx-font-weight: bold;");

		blk1.setTranslateX(-260);

		blk1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(blk1.getText());

			}
		});

		/** button 2 **/

		Button btn2 = new Button();
		btn2.setText("D"); /// D
		btn2.setAlignment(Pos.BOTTOM_CENTER);
		btn2.setStyle("-fx-font-family: Comic Sans;" + "-fx-font-weight: bold;");
		btn2.setMaxSize(70, 200);

		btn2.setTranslateX(-220);

		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(btn2.getText());

			}
		});

		/** black button 2 **/

		Button blk2 = new Button();
		blk2.setText("D#");
		blk2.setMaxSize(50, 120);
		blk2.setTranslateY(-40);
		blk2.setAlignment(Pos.BOTTOM_CENTER);
		blk2.setStyle("-fx-background-color: #070707;" + "-fx-text-fill: #FFFFFF;" + "-fx-font-family: Comic Sans;"
				+ "-fx-font-weight: bold;");

		blk2.setTranslateX(-180);

		blk2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(blk2.getText());

			}
		});

		/** button 3 **/

		Button btn3 = new Button();
		btn3.setText("E"); /// E
		btn3.setAlignment(Pos.BOTTOM_CENTER);
		btn3.setStyle("-fx-font-family: Comic Sans;" + "-fx-font-weight: bold;");
		btn3.setMaxSize(70, 200);

		btn3.setTranslateX(-140);

		btn3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(btn3.getText());

			}
		});

		/** button 4 **/

		Button btn4 = new Button();
		btn4.setText("F"); /// F
		btn4.setAlignment(Pos.BOTTOM_CENTER);
		btn4.setStyle("-fx-font-family: Comic Sans;" + "-fx-font-weight: bold;");
		btn4.setMaxSize(70, 200);

		btn4.setTranslateX(-60);

		btn4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(btn4.getText());
				;

			}
		});

		/* black button 3 */

		Button blk3 = new Button();
		blk3.setText("F#");
		blk3.setMaxSize(50, 120);
		blk3.setTranslateY(-40);
		blk3.setAlignment(Pos.BOTTOM_CENTER);
		blk3.setStyle("-fx-background-color: #070707;" + "-fx-text-fill: #FFFFFF;" + "-fx-font-family: Comic Sans;"
				+ "-fx-font-weight: bold;");

		blk3.setTranslateX(-20);

		blk3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(blk3.getText());

			}
		});

		/** button 5 **/

		Button btn5 = new Button();
		btn5.setText("G"); /// G
		btn5.setAlignment(Pos.BOTTOM_CENTER);
		btn5.setStyle("-fx-font-family: Comic Sans;" + "-fx-font-weight: bold;");
		btn5.setMaxSize(70, 200);

		btn5.setTranslateX(20);

		btn5.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(btn5.getText());

			}
		});

		/** black button 4 **/

		Button blk4 = new Button();
		blk4.setText("G#");
		blk4.setMaxSize(50, 120);
		blk4.setTranslateY(-40);
		blk4.setAlignment(Pos.BOTTOM_CENTER);
		blk4.setStyle("-fx-background-color: #070707;" + "-fx-text-fill: #FFFFFF;" + "-fx-font-family: Comic Sans;"
				+ "-fx-font-weight: bold;");

		blk4.setTranslateX(60);

		blk4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(blk4.getText());
			}
		});

		/** button 6 **/

		Button btn6 = new Button();
		btn6.setText("A"); /// A
		btn6.setAlignment(Pos.BOTTOM_CENTER);
		btn6.setStyle("-fx-font-family: Comic Sans;" + "-fx-font-weight: bold;");
		btn6.setMaxSize(70, 200);

		btn6.setTranslateX(100);

		btn6.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(btn6.getText());

			}
		});

		/** black button 5 **/

		Button blk5 = new Button();
		blk5.setText("A#");
		blk5.setMaxSize(50, 120);
		blk5.setTranslateY(-40);
		blk5.setAlignment(Pos.BOTTOM_CENTER);
		blk5.setStyle("-fx-background-color: #070707;" + "-fx-text-fill: #FFFFFF;" + "-fx-font-family: Comic Sans;"
				+ "-fx-font-weight: bold;");

		blk5.setTranslateX(140);

		blk5.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(blk5.getText());

			}
		});

		/** button 7 **/

		Button btn7 = new Button();
		btn7.setText("B"); /// B
		btn7.setAlignment(Pos.BOTTOM_CENTER);
		btn7.setStyle("-fx-font-family: Comic Sans;" + "-fx-font-weight: bold;");
		btn7.setMaxSize(70, 200);

		btn7.setTranslateX(180);

		btn7.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Box.display(btn7.getText());

			}
		});

		// for black keys

		StackPane root = new StackPane();
		root.getChildren().add(btn);
		root.getChildren().add(btn2);
		root.getChildren().add(btn3);
		root.getChildren().add(btn4);
		root.getChildren().add(btn5);
		root.getChildren().add(btn6);
		root.getChildren().add(btn7);

		root.getChildren().add(blk1);
		root.getChildren().add(blk2);
		root.getChildren().add(blk3);
		root.getChildren().add(blk4);
		root.getChildren().add(blk5);

		// primaryStage.setScene(new Scene(root, 300, 250));

		primaryStage.setScene(new Scene(root, 1000, 600)); // x

		primaryStage.show();
	}
}
