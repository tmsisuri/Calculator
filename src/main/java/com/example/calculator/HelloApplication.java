package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //stage config
        stage.getIcons().add(new Image(HelloApplication.class.getResource("images/icon.png").toString()));
        stage.setTitle("Calculator");
        //creating a scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load() );
        //setting scene style sheet
        scene.getStylesheets().add(HelloApplication.class.getResource("css/calculator.css").toString());
        //setting the scene in the stage
        stage.setScene(scene);
        //display the scene
        stage.show();

          //this will create a new scene
//        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("my-view.fxml")); //create a fxml file my-view
//        Scene scene1 = new Scene(fxmlLoader1.load(), 320, 240);
//        stage.setScene(scene1);
//        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}