package com.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDemo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root=FXMLLoader.load(getClass().getResource("/test.fxml"));
		Scene se=new Scene(root,400,400);
		se.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
		primaryStage.setScene(se);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
