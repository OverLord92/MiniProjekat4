package tic_tac_toe;

import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	static List<Button> buttons;
	static char[][] signs = new char[3][3];
	static TextField tfResult;
	boolean player = true;

	public void start(Stage primaryStage) {

		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10, 10, 10, 10));

		Button bt00 = new Button();
		bt00.setGraphic(new ImageView("blank.jpg"));
		pane.add(bt00, 0, 0);

		bt00.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if (BackEnd.isFree(signs[0][0])) {
					if (player) {
						bt00.setGraphic(new ImageView("iks.jpg"));
						signs[0][0] = 'X';
					} else {
						bt00.setGraphic(new ImageView("oks.jpg"));
						signs[0][0] = 'O';
					}
					player = !player;
				}

				if (BackEnd.isWinner()) {
					tfResult.setText(player ? "O WON" : "X WON");
				} else if (BackEnd.isFinished()) {
					tfResult.setText("DRAW");
				}
			}
		});

		Button bt01 = new Button();
		bt01.setGraphic(new ImageView("blank.jpg"));
		pane.add(bt01, 1, 0);

		bt01.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if (BackEnd.isFree(signs[0][1])) {
					if (player) {
						bt01.setGraphic(new ImageView("iks.jpg"));
						signs[0][1] = 'X';
					} else {
						bt01.setGraphic(new ImageView("oks.jpg"));
						signs[0][1] = 'O';
					}
					player = !player;
				}

				if (BackEnd.isWinner()) {
					tfResult.setText(player ? "O WON" : "X WON");
				} else if (BackEnd.isFinished()) {
					tfResult.setText("DRAW");
				}

			}
		});

		Button bt02 = new Button();
		bt02.setGraphic(new ImageView("blank.jpg"));
		pane.add(bt02, 2, 0);

		bt02.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if (BackEnd.isFree(signs[0][2])) {
					if (player) {
						bt02.setGraphic(new ImageView("iks.jpg"));
						signs[0][2] = 'X';
					} else {
						bt02.setGraphic(new ImageView("oks.jpg"));
						signs[0][2] = 'O';
					}
					player = !player;
				}

				if (BackEnd.isWinner()) {
					tfResult.setText(player ? "O WON" : "X WON");
				} else if (BackEnd.isFinished()) {
					tfResult.setText("DRAW");
				}

			}
		});

		Button bt10 = new Button();
		bt10.setGraphic(new ImageView("blank.jpg"));
		pane.add(bt10, 0, 1);

		bt10.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if (BackEnd.isFree(signs[1][0])) {
					if (player) {
						bt10.setGraphic(new ImageView("iks.jpg"));
						signs[1][0] = 'X';
					} else {
						bt10.setGraphic(new ImageView("oks.jpg"));
						signs[1][0] = 'O';
					}
					player = !player;
				}

				if (BackEnd.isWinner()) {
					tfResult.setText(player ? "O WON" : "X WON");
				} else if (BackEnd.isFinished()) {
					tfResult.setText("DRAW");
				}

			}
		});

		Button bt11 = new Button();
		bt11.setGraphic(new ImageView("blank.jpg"));
		pane.add(bt11, 1, 1);

		bt11.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if (BackEnd.isFree(signs[1][1])) {
					if (player) {
						bt11.setGraphic(new ImageView("iks.jpg"));
						signs[1][1] = 'X';
					} else {
						bt11.setGraphic(new ImageView("oks.jpg"));
						signs[1][1] = 'O';
					}
					player = !player;
				}

				if (BackEnd.isWinner()) {
					tfResult.setText(player ? "O WON" : "X WON");
				} else if (BackEnd.isFinished()) {
					tfResult.setText("DRAW");
				}

			}
		});

		Button bt12 = new Button();
		bt12.setGraphic(new ImageView("blank.jpg"));
		pane.add(bt12, 2, 1);

		bt12.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if (BackEnd.isFree(signs[1][2])) {
					if (player) {
						bt12.setGraphic(new ImageView("iks.jpg"));
						signs[1][2] = 'X';
					} else {
						bt12.setGraphic(new ImageView("oks.jpg"));
						signs[1][2] = 'O';
					}
					player = !player;
				}

				if (BackEnd.isWinner()) {
					tfResult.setText(player ? "O WON" : "X WON");
				} else if (BackEnd.isFinished()) {
					tfResult.setText("DRAW");
				}

			}
		});

		Button bt20 = new Button();
		bt20.setGraphic(new ImageView("blank.jpg"));
		pane.add(bt20, 0, 2);

		bt20.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if (BackEnd.isFree(signs[2][0])) {
					if (player) {
						bt20.setGraphic(new ImageView("iks.jpg"));
						signs[2][0] = 'X';
					} else {
						bt20.setGraphic(new ImageView("oks.jpg"));
						signs[2][0] = 'O';
					}
					player = !player;
				}

				if (BackEnd.isWinner()) {
					tfResult.setText(player ? "O WON" : "X WON");
				} else if (BackEnd.isFinished()) {
					tfResult.setText("DRAW");
				}

			}
		});

		Button bt21 = new Button();
		bt21.setGraphic(new ImageView("blank.jpg"));
		pane.add(bt21, 1, 2);

		bt21.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if (BackEnd.isFree(signs[2][1])) {
					if (player) {
						bt21.setGraphic(new ImageView("iks.jpg"));
						signs[2][1] = 'X';
					} else {
						bt21.setGraphic(new ImageView("oks.jpg"));
						signs[2][1] = 'O';
					}
					player = !player;
				}

				if (BackEnd.isWinner()) {
					tfResult.setText(player ? "O WON" : "X WON");
				} else if (BackEnd.isFinished()) {
					tfResult.setText("DRAW");
				}

			}
		});

		Button bt22 = new Button();
		bt22.setGraphic(new ImageView("blank.jpg"));
		pane.add(bt22, 2, 2);

		bt22.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if (BackEnd.isFree(signs[2][2])) {
					if (player) {
						bt22.setGraphic(new ImageView("iks.jpg"));
						signs[2][2] = 'X';
					} else {
						bt22.setGraphic(new ImageView("oks.jpg"));
						signs[2][2] = 'O';
					}
					player = !player;
				}

				if (BackEnd.isWinner()) {
					tfResult.setText(player ? "O WON" : "X WON");
				} else if (BackEnd.isFinished()) {
					tfResult.setText("DRAW");
				}

			}
		});

		Button btReset = new Button("Reset Game");
		pane.add(btReset, 0, 3);
		
		btReset.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				resetGame();
			}
		});

		buttons = Arrays.asList(bt00, bt01, bt02, bt10, bt11, bt12, bt20, bt21,
				bt22);

		tfResult = new TextField();
		tfResult.setPrefSize(50, 50);
		tfResult.setEditable(false);
		pane.add(tfResult, 1, 3);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Senjin Tic Tac Toe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void resetGame(){
		BackEnd.resetSigns();
		for(int i = 0; i < buttons.size(); i++)
			buttons.get(i).setGraphic(new ImageView("blank.jpg"));
		tfResult.setText("");
	}

	public static void main(String[] args) {

		Application.launch(args);

	}

}
