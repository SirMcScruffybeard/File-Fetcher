package com.sirmcscruffybeard.file_fetcher.gui;

import javafx.scene.control.Button;

public class FileButton extends Button {

	private PathField field = null;
	
	private int height = 50;

	public FileButton(String inPath, PathField inField) {

		this.setButton(inPath, inField);
	}

	public FileButton(PathField inField, String inPath) {

		this.setButton(inPath, inField);
	}


	private void setButton(String inPath, PathField inField) {

		this.setText(inPath);

		this.setField(inField);
		
		this.setPrefHeight(this.height);
	}

	public void setField(PathField inField) { this.field = inField; }

	public PathField getField() { return this.field; }
}
