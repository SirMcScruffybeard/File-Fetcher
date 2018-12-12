package com.sirmcscruffybeard.file_fetcher.gui;

import com.sirmcscruffybeard.file_fetcher.logic.PathWorks;

import javafx.geometry.Orientation;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;

public class ButtonPane extends ScrollPane{

	private FileButton[] buttons = null;
	
	private PathWorks pathWorks = new PathWorks();
	
	private FlowPane pane = new FlowPane(Orientation.VERTICAL);
	
	public ButtonPane(PathField inField) {
		
		this.prepButtons(inField);
		
		this.addButtons();
		
	}
	
	private void prepButtons(PathField inField) {
		
		String names[] = pathWorks.getFileNames();
		
		buttons = new FileButton[names.length];
		
		for (int i = 0; i < buttons.length; i++) buttons[i] = new FileButton(names[i], inField);
	}
	
	private void addButtons() {
		
		for(int i = 0; i < buttons.length; i++) pane.getChildren().add(buttons[i]); 
		
		this.setContent(pane);
	}
	
}
