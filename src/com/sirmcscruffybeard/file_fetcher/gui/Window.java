package com.sirmcscruffybeard.file_fetcher.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Window extends Application {

	BorderPane mainPane = new BorderPane();
	
	PathField pathField = null;
	
	ButtonPane buttonPane = null;
	
	@Override
	public void start(Stage primaryStage) {
		
		
		mainPane.setBottom(this.pathField = new PathField());
		
		mainPane.setCenter(this.buttonPane = new ButtonPane(this.pathField));

		primaryStage.setScene(new Scene(mainPane));
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
