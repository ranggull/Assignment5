package application;

import java.util.Random;

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
import javafx.scene.layout.GridPane;
import java.util.Random;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			// Creates standard QR code squares at 3 corners of the stage
			// 1 at top left, 1 at top right, 1 at bottom left
			
			Rectangle topLeftBorder = new Rectangle(10, 10, 150, 150);
			topLeftBorder.setStroke(Color.WHITE);
			topLeftBorder.setStrokeWidth(20);
			topLeftBorder.setFill(Color.WHITE);
			
			Rectangle topLeftSq = new Rectangle(10, 10, 130, 130);
			topLeftSq.setStroke(Color.BLACK);
			topLeftSq.setStrokeWidth(20);
			topLeftSq.setFill(null);

			Rectangle topLeftCenter = new Rectangle(50, 50, 50, 50);
			topLeftCenter.setStroke(Color.BLACK);
			topLeftCenter.setStrokeWidth(10);
			topLeftCenter.setFill(Color.BLACK);

			Rectangle topRightBorder = new Rectangle(350, 10, 150, 150);
			topRightBorder.setStroke(Color.WHITE);
			topRightBorder.setStrokeWidth(20);
			topRightBorder.setFill(Color.WHITE);
			
			Rectangle topRightSq = new Rectangle(372, 10, 130, 130);
			topRightSq.setStroke(Color.BLACK);
			topRightSq.setStrokeWidth(20);
			topRightSq.setFill(null);

			Rectangle topRightCenter = new Rectangle(412, 50, 50, 50);
			topRightCenter.setStroke(Color.BLACK);
			topRightCenter.setStrokeWidth(10);
			topRightCenter.setFill(Color.BLACK);

			Rectangle bottomLeftBorder = new Rectangle(10, 350, 150, 150);
			bottomLeftBorder.setStroke(Color.WHITE);
			bottomLeftBorder.setStrokeWidth(20);
			bottomLeftBorder.setFill(Color.WHITE);
			
			Rectangle bottomLeftSq = new Rectangle(10, 372, 130, 130);
			bottomLeftSq.setStroke(Color.BLACK);
			bottomLeftSq.setStrokeWidth(20);
			bottomLeftSq.setFill(null);

			Rectangle bottomLeftCenter = new Rectangle(50, 412, 50, 50);
			bottomLeftCenter.setStroke(Color.BLACK);
			bottomLeftCenter.setStrokeWidth(10);
			bottomLeftCenter.setFill(Color.BLACK);

			// Below creates randomly generated squares along GridPanes
			// that exist only between the standard squares and to the
			// right and below the standard squares
			
			GridPane grid = new GridPane();
			
			int rowNum = 26;
			int colNum = 26;

			Random randomno = new Random();
			Color[] colors = {Color.BLACK, Color.WHITE};
			
			for (int row=0; row<rowNum; row++) {
				for(int col=0; col<colNum; col++) {
					int n = randomno.nextInt(2);
					Rectangle rec = new Rectangle();
					rec.setWidth(20);
					rec.setHeight(20);
					rec.setFill(colors[n]);
					GridPane.setRowIndex(rec, row);
					GridPane.setColumnIndex(rec, col);
					grid.getChildren().addAll(rec);
				}
			}
			
			Group root = new Group(grid, topLeftBorder, topRightBorder, bottomLeftBorder, 
					topLeftSq, topLeftCenter, topRightSq, topRightCenter, bottomLeftSq,
					bottomLeftCenter);

			Scene scene = new Scene(root, 512, 512);
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
