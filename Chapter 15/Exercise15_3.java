import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javax.swing.border.*;
import javafx.event.*;

public class Exercise15_3 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// pane for circle
		Pane pane = new Pane(); 
		//circle(int centerX, int centerY, double radius)
		Circle circle = new Circle(20);
		// color(double red, double green, double blue, double opacity);
		// color.rgb(int red, int green, int blue);
		circle.setFill(Color.RED);
		circle.setStroke(Color.rgb(70, 0, 130));
		pane.getChildren().add(circle);
		
		// HBox for buttons
		HBox box = new HBox(5);
		Button left  = new Button("Left");
		Button right = new Button("Right");
		Button up    = new Button("up");
		Button down  = new Button("Down");
		box.getChildren().addAll(left, right, up, down);
		
		// GridPane for pane and HBox
		BorderPane border = new BorderPane();
		// setCenter(), setLeft(), setRight(), setTop(), setBottom()
		border.setCenter(pane);
		border.setBottom(box);
		
		// create scene and add to stage
		Scene scene = new Scene(border, 200, 150);
		primaryStage.setTitle("Exercise15_03");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// Add EventListeners in lamba functions
		left.setOnAction(e -> {
			if (circle.getCenterX() -10 >= circle.getRadius()) {
				circle.setCenterX(circle.getCenterX()-10);
			}
			else {
				circle.setCenterX(circle.getRadius());
			}
		});
		
		right.setOnAction(e -> {
			if (circle.getCenterX() + 10 <= (scene.getWidth() - circle.getRadius())){
				circle.setCenterX(circle.getCenterX() + 10);
			}
			else circle.setCenterX(scene.getWidth() - circle.getRadius());
		});
		
		up.setOnAction(e -> {
			if (circle.getCenterY() -10 >= circle.getRadius()) {
				circle.setCenterY(circle.getCenterY()-10);
			}
			else {
				circle.setCenterY(circle.getRadius());
			}
		});
		
		down.setOnAction(e -> {
			if (circle.getCenterY() + 10 <= (scene.getHeight() - circle.getRadius())){
				circle.setCenterY(circle.getCenterY() + 10);
			}
			else circle.setCenterY(scene.getHeight() - circle.getRadius());
		});
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}