package basicform;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;

import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class BasicForm extends Application {

	
	private final String TITLE = "Welcome";
	private final int TITLE_SIZE = 20;
	private final String WINDOW_TITLE = "JavaFX Welcome";
	private final String PREF_FONT = "Tahoma";
	private final int WINDOW_HEIGHT = 275;
	private final int WINDOW_WIDTH = 300;
	private final int V_GAP = 10;
	private final int H_GAP = 10;
	private final int T_PAD = 25;
	private final int B_PAD= 25;
	private final int L_PAD = 25;
	private final int R_PAD = 25;
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle(WINDOW_TITLE);

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(V_GAP);
		grid.setHgap(H_GAP);
		grid.setPadding(new Insets(T_PAD,R_PAD,B_PAD,L_PAD));

		Text sceneTitle = new Text(TITLE);
		sceneTitle.setFont(Font.font(PREF_FONT, FontWeight.NORMAL,TITLE_SIZE));
		grid.add(sceneTitle,0,0,2,1);

		Label userName = new Label("User Name:");
		grid.add(userName,0,1);

		TextField userTextField = new TextField();
		grid.add(userTextField,1,1);

		Label pw = new Label("Password:");
		grid.add(pw,0,2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox,1,2);

		Scene scene = new Scene(grid,WINDOW_WIDTH,WINDOW_HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();
	}


}