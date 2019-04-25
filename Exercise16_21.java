/*
Author: Dylan Bartlett
Date: April 17, 2019
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.scene.media.*;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.scene.control.TextField;

public class Exercise16_21 extends Application {
	Media media = new Media ("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	MediaPlayer mp = new MediaPlayer(media);
	
	@Override 
	public void start(Stage primaryStage) {   
		Pane pane = new Pane();
		
		TextField text = new TextField();
		
			//new Timeline(KeyFrame duration, event)
		Timeline time = new Timeline( new KeyFrame(Duration.millis(1000), e -> {
			int count = Integer.parseInt(text.getText());
			if (count > 0) {
				count--;
				text.setText(Integer.toString(count));
			}
			else {
				mp.play();
			}
		}));
			
		mp.setCycleCount(Timeline.INDEFINITE);
		time.setCycleCount(Timeline.INDEFINITE);
			
		text.setOnAction(e -> {
			time.play();
		});
			
		Scene scene = new Scene(text, 200, 100);
		primaryStage.setTitle("Exercise 16-20");		
		primaryStage.setScene(scene);
		primaryStage.show();
			
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}