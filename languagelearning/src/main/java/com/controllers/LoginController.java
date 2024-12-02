package com.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import com.language.App;
import com.narration.*;
import com.model.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    private CourseManagerFacade cmf;

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    private void switchToSignUp() throws IOException {
        App.setRoot("signup");
    }

    @FXML
    private void login() throws IOException {
        cmf = cmf.getInstance();
        String username = usernameField.getText();
        String password = passwordField.getText();

        if(cmf.login(username, password) != null){
            cmf.login(username, password);
            System.out.println("Successful Login!");
            App.setRoot("dashboard");

            // Word word1 = new Word("test", "test");
            // Word word2 = new Word("test2", "test2");
            // Word word3 = new Word("test3", "test3");
            // Word word4 = new Word("test4", "test4");
            // Word[] words = {word1, word2, word3, word4};
            // cmf.setLesson(0);
            // cmf.setExercise(words);
            // App.setRoot("audio");
        } else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Incorrect Username or Password");
            alert.showAndWait();
        }

        

    }
}
