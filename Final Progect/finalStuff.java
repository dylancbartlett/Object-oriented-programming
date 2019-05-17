/*
Author: Dylan Bartlett
Date: 5/8/17
*/

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.*;

public class finalStuff extends Application { 
				int score = 0;

	@Override 
	public void start(Stage primaryStage) {
		
			VBox word = new VBox();
			BorderPane border = new BorderPane();
			GridPane grid = new GridPane();
			
			border.setCenter(word);

			Rectangle rect = new Rectangle(10,10,380,90);
			
			rect.setFill(Color.TRANSPARENT);

			rect.setStroke(Color.BLACK);
			border.getChildren().add(rect);
			
			
 
			Text wordBank = new Text(" \n \n             Who              What                When                Where \n \n                   why             how               is             does \n\n\n    1. _________ old are you? \n\n    2. _________ this your pencil? \n\n    3. _________ sits at your table? \n\n    4. _________ do you live? \n\n    5. _________ is your birthday? \n\n    6. _________ your friend want to play? \n\n    7. _________ do you want to eat for lunch? \n\n    8. _________ are you crying?");
		  
			
			word.getChildren().add(wordBank);
			border.setTop(wordBank);
			
			
			TextField textField = new TextField();
			HBox hb = new HBox();
			Label label1 = new Label("Question 1");
			hb.getChildren().addAll(label1, textField);
			hb.setSpacing(10);
			word.getChildren().add(hb);
			Button button = new Button("Check");
			String q1 = "";
			textField.setOnAction(new EventHandler<ActionEvent>() { 
				public void handle(ActionEvent args) {
				//q1 = textField.getText();
				} 
				
			});
			textField.setOnAction(e ->  { 

			if (textField.getText().equalsIgnoreCase("How")) {

			increaseScore();

			}			

			else {

			System.out.println("wrong");

			}
			});
			
			
			
			TextField textField2 = new TextField();
			HBox hb2 = new HBox();
			Label label2 = new Label("Question 2");
			hb2.getChildren().addAll(label2, textField2);
			hb2.setSpacing(10);
			word.getChildren().add(hb2);
			String q2 = "";
			textField2.setOnAction(new EventHandler<ActionEvent>() { 
				public void handle(ActionEvent args) {
				//q2 = textField2.getText();
				} 
				
			});
			textField2.setOnAction(e ->  { 

			if (textField2.getText().equalsIgnoreCase("Is")) {

			increaseScore();

			}			

			else {

			System.out.println("wrong");

			}
			});
			
			
			TextField textField3 = new TextField();
			HBox hb3 = new HBox();
			Label label3 = new Label("Question 3");
			hb3.getChildren().addAll(label3, textField3);
			hb3.setSpacing(10);
			word.getChildren().add(hb3);
			String q3 = "";
			textField3.setOnAction(new EventHandler<ActionEvent>() { 
				public void handle(ActionEvent args) {
				//q3 = textField3.getText();
				} 
				
			});
			textField3.setOnAction(e ->  { 

			if (textField3.getText().equalsIgnoreCase("who")) {

			increaseScore();

			}			

			else {

			System.out.println("wrong");

			}
			});
			
			TextField textField4 = new TextField();
			HBox hb4 = new HBox();
			Label label4 = new Label("Question 4");
			hb4.getChildren().addAll(label4, textField4);
			hb4.setSpacing(10);
			word.getChildren().add(hb4);
			String q4 = "";
			textField4.setOnAction(new EventHandler<ActionEvent>() { 
				public void handle(ActionEvent args) {
				//q4 = textField4.getText();
				} 
				
			});
			textField4.setOnAction(e ->  { 

			if (textField4.getText().equalsIgnoreCase("Where")) {

			increaseScore();

			}			

			else {

			System.out.println("wrong");

			}
			});
			
			
			TextField textField5 = new TextField();
			HBox hb5 = new HBox();
			Label label5 = new Label("Question 5");
			hb5.getChildren().addAll(label5, textField5);
			hb5.setSpacing(10);
			word.getChildren().add(hb5);
			String q5 = "";
			textField5.setOnAction(new EventHandler<ActionEvent>() { 
				public void handle(ActionEvent args) {
				//q5 = textField5.getText();
				} 
				
			});
			textField5.setOnAction(e ->  { 

			if (textField5.getText().equalsIgnoreCase("When")) {

			increaseScore();

			}			

			else {

			System.out.println("wrong");

			}
			});
			
			
			TextField textField6 = new TextField();
			HBox hb6 = new HBox();
			Label label6 = new Label("Question 6");
			hb6.getChildren().addAll(label6, textField6);
			hb6.setSpacing(10);
			word.getChildren().add(hb6);
			String q6 = "";
			textField6.setOnAction(new EventHandler<ActionEvent>() { 
				public void handle(ActionEvent args) {
				//q6 = textField6.getText();
				} 
				
			});
			textField6.setOnAction(e ->  { 

			if (textField6.getText().equalsIgnoreCase("Does")) {

			increaseScore();

			}			

			else {

			System.out.println("wrong");

			}
			});
			
			TextField textField7 = new TextField();
			HBox hb7 = new HBox();
			Label label7 = new Label("Question 7");
			hb7.getChildren().addAll(label7, textField7);
			hb7.setSpacing(10);
			word.getChildren().add(hb7);
			String q7 = "";
			textField7.setOnAction(new EventHandler<ActionEvent>() { 
				public void handle(ActionEvent args) {
				//q7 = textField7.getText();
				} 
				
			});
			textField7.setOnAction(e ->  { 

			if (textField7.getText().equalsIgnoreCase("What")) {

			increaseScore();

			}			

			else {

			System.out.println("wrong");

			}
			});
			
			TextField textField8 = new TextField();
			HBox hb8 = new HBox();
			Label label8 = new Label("Question 8");
			hb8.getChildren().addAll(label8, textField8);
			hb8.setSpacing(10);
			word.getChildren().add(hb8);
			String q8 = "";
			textField8.setOnAction(new EventHandler<ActionEvent>() { 
				public void handle(ActionEvent args) {
				//q8 = textField8.getText();
				} 
				
			});
			textField8.setOnAction(e ->  { 

			if (textField8.getText().equalsIgnoreCase("Why")) {

			increaseScore();

			}			

			else {

			System.out.println("wrong");

			}
			});
			
			
					
			Scene scene = new Scene(border, 400, 700);
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
		    
	public static void main(String args[]){ 
		launch(args); 
	}
	public void increaseScore() {

	score++;

	System.out.println("Score is " + score);

	}
}
	