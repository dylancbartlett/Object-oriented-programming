/*
Author: Dylan Bartlett
Date: 4/9/19
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.collections.ObservableList;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.scene.input.MouseButton;
import javafx.scene.media.*;

public class Exercise15Annimation extends Application {
	@Override 
	public void start(Stage primaryStage) {   
		Pane pane = new Pane();
		
		Rectangle r = new Rectangle(14, 9);
		r.setFill(Color.rgb(128, 255, 0));
	
		Polygon polygon = new Polygon();
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> list = polygon.getPoints();
		polygon.setRotate(22.5);
				
		double centerX = 250, centerY = 250;
		double radius = Math.min(500, 500) * 0.4;

		int s = 5;
				
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}     
		
		pane.getChildren().addAll(polygon, r);
		
		//PathTransition
		PathTransition pt = new PathTransition();
		pt.setPath(polygon);
		pt.setNode(r);
		pt.setAutoReverse(true);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setDuration(Duration.millis(4000));
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.play();
		
		// new FadeTransition
		FadeTransition ft1 = new FadeTransition(Duration.millis(200), r);
		ft1.setFromValue(0.0);
		ft1.setToValue(1.0);
		ft1.setCycleCount(Timeline.INDEFINITE);
		ft1.setAutoReverse(true);
		ft1.play();
		
		FadeTransition ft2 = new FadeTransition(Duration.millis(1500), polygon);
		ft2.setFromValue(1.0);
		ft2.setToValue(0.1);
		ft2.setCycleCount(Timeline.INDEFINITE);
		ft2.setAutoReverse(true);
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("exercise 15, The animation");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		r.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pt.pause();
				ft1.pause();
				ft2.play();
				System.out.println("Animation Paused");
			}
			else if (e.getButton() == MouseButton.SECONDARY) {
				pt.play();
				ft1.play();
				ft2.pause();
				System.out.println("Animaiton resumed");
			}
		});
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}