package application;
	
import java.util.Base64;
import java.util.Stack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import javafx.application.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25,25,25,25));
			
			Label etiqueta = new Label("Ingrese la palabra: ");
			grid.add(etiqueta, 0, 0);
			
			TextField caja = new TextField();
			grid.add(caja, 1, 0);
			
			TextField caja1 = new TextField();
			grid.add(caja1, 1,1);
					
			Button click = new Button("Click here");
			grid.add(click, 2, 0);
			
			click.setOnAction (new EventHandler<ActionEvent>()
			{
				@Override 
				public void handle(ActionEvent event)
				{
					byte[] palabra = caja.getText().getBytes();
					String palabraEncriptada = Base64.getEncoder().encodeToString(palabra);
					caja.setText(palabraEncriptada);
					
					byte[] decodedBytes = Base64.getDecoder().decode(palabraEncriptada);
					String decodedString = new String(decodedBytes);
					caja1.setText(decodedString);
				}
			});
			
			Scene scene = new Scene(grid,500,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
