package com.example.cs112ud2;//package name here depending on your IDE

import javafx.application.Application;  //abstract class used for JavaFX GUI's
import javafx.stage.FileChooser;
import javafx.stage.Stage;              //class for GUI window
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.event.EventHandler;       //interface for handling events
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)
import javafx.stage.FileChooser.ExtensionFilter; // needed for File upload
import java.io.File;
//import libraries for file IO:
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import for date formatting
import java.util.Date;
//import for array manipulation
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main extends Application implements EventHandler<ActionEvent>  { //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    private Button button;
    private FileChooser file;

    //create scanner object for file IO
    BufferedReader inputStream = null;
    String[] parts;
    //create array of date objects to store dates from file
    Date[] dates;
    //create array to hold spending values
    double[] spending;
    //create array to hold data labels
    String temp = null;
    String[] dataLabels;
    /*** DRIVER main ***/
    public static void main(String[] args) {
        launch(args); //method from Application class, must be called to setup javafx application
    }

    /*** OVERRIDDEN Application METHODS ***/
    @Override
    public void start(Stage primaryStage) throws Exception { //Application automatically calls this method to run (our) main javafx code. passes in primary stage (main window)
        primaryStage.setTitle("Budgeting App");

        Button button = new Button("Select File");
        button.setOnAction(e -> {
            file = new FileChooser();
            file.setTitle("Open Budgeting File (.txt format)");
            file.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Text Files", "*.txt")
            );
            File selectedFile = file.showOpenDialog(primaryStage);
        });

        VBox vBox = new VBox(button);
        Scene scene = new Scene(vBox, 960, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /*** OVERRIDDEN EventHandler METHODS ***/
    @Override
    public void handle(ActionEvent actionEvent) { //generic method used to handle when events occur (like handle button click)
        //good practice to identify source, in case you have multiple event types/sources
        if(actionEvent.getSource() == button) {
        //action on click

        }
    }

    public void parseFile(FileChooser file){
        int month, day, year;


        try
        {
            inputStream = new BufferedReader(new FileReader(file.getTitle()));
            temp = inputStream.readLine();
            inputStream.close(); //try/catch difference from Scanner
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("ERROR: File " + file.getTitle() + " not found or could not be opened.");
        }
        catch (IOException ioe)
        {
            System.out.println("ERROR reading from " + file.getTitle());
        }

        //manipulation of data received from file.
        parts = temp.split(" ");
        month = parts[0];
        day = Integer.parseInt(parts[1]);
        year = Integer.parseInt(parts[2]);

        test = new Date(month, day, year);
        System.out.println("Date read in from file = " + test);
    }
}