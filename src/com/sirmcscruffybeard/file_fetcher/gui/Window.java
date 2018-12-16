package com.sirmcscruffybeard.file_fetcher.gui;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Window extends Application {

	BorderPane mainPane = new BorderPane();
	
	PathField bottomField = new PathField();
	
	PathField topField = new PathField();
	
	ButtonPane buttonPane = null;
	
	@Override
	public void start(Stage primaryStage) {
		
		
		mainPane.setBottom(this.bottomField);
		
		mainPane.setCenter(this.buttonPane = new ButtonPane(this.bottomField));
		
		mainPane.setTop(this.topField);

		primaryStage.setScene(new Scene(mainPane));
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
