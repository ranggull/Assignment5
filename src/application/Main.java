package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			// Creates standard QR code squares at 3 corners of the stage
			// 1 at top left, 1 at top right, 1 at bottom left
			
			Rectangle topLeftSq = new Rectangle(10, 10, 130, 130);
			topLeftSq.setStroke(Color.BLACK);
			topLeftSq.setStrokeWidth(20);
			topLeftSq.setFill(null);

			Rectangle topLeftCenter = new Rectangle(50, 50, 50, 50);
			topLeftCenter.setStroke(Color.BLACK);
			topLeftCenter.setStrokeWidth(10);
			topLeftCenter.setFill(Color.BLACK);

			Rectangle topRightSq = new Rectangle(372, 10, 130, 130);
			topRightSq.setStroke(Color.BLACK);
			topRightSq.setStrokeWidth(20);
			topRightSq.setFill(null);

			Rectangle topRightCenter = new Rectangle(412, 50, 50, 50);
			topRightCenter.setStroke(Color.BLACK);
			topRightCenter.setStrokeWidth(10);
			topRightCenter.setFill(Color.BLACK);

			Rectangle bottomLeftSq = new Rectangle(10, 372, 130, 130);
			bottomLeftSq.setStroke(Color.BLACK);
			bottomLeftSq.setStrokeWidth(20);
			bottomLeftSq.setFill(null);

			Rectangle bottomLeftCenter = new Rectangle(50, 412, 50, 50);
			bottomLeftCenter.setStroke(Color.BLACK);
			bottomLeftCenter.setStrokeWidth(10);
			bottomLeftCenter.setFill(Color.BLACK);

			Group root = new Group(topLeftSq, topLeftCenter, topRightSq, topRightCenter, bottomLeftSq,
					bottomLeftCenter);

			// Below creates randomly generated squares that exist only between the standard squares
			
			// Creates squares between the top standard squares only
			for (int i = 0; i <= 30; i++) {
				float x = (float) (170 + (Math.random() * 152));
				float y = (float) (Math.random() * 150);

				Rectangle topCenter = new Rectangle(x, y, 20, 20);
				root.getChildren().add(topCenter);
			}
			
			// Creates squares between the left standard squares only
			for (int i = 0; i<= 30; i++) {
				float x = (float) (Math.random() * 150);
				float y = (float) (170 + (Math.random() * 152));
				
				Rectangle leftCenter = new Rectangle(x, y, 20, 20);
				root.getChildren().add(leftCenter);
			}

			// Creates squares in the empty space below the top standard squares and
			// to the right of the left standard squares
			for (int i = 0; i <= 100; i++) {
				float x = (float) (170 + (Math.random() * 320));
				float y = (float) (170 + (Math.random() * 320));
				
				Rectangle bottomRight = new Rectangle(x, y, 20, 20);
				root.getChildren().add(bottomRight);
			}
			
			Scene scene = new Scene(root, 512, 512, Color.WHITE);
			primaryStage.setTitle("Assignment 5: QR Faux-Code");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
