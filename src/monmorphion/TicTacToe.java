package monmorphion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    private char[][] board = new char[3][3]; // Grille de jeu
    private char currentPlayer = 'X'; // Joueur actuel
    private Text scoreText = new Text(); // Texte pour afficher les scores
    private Button restartButton = new Button("Restart"); // Bouton pour redémarrer

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        for (int row =  0; row <  3; row++) {
        	int a = row;
            for (int col =  0; col <  3; col++) {
            	int b = col;
                TicTacToeSquare square = new TicTacToeSquare();
                square.setOnMouseClicked(event -> handleClick(square, a, b));
                square.setOnMouseEntered(event -> handleMouseEntered(square));
                square.setOnMouseExited(event -> handleMouseExited(square));
                grid.add(square, col, row);
            }
        }

        restartButton.setOnAction(event -> resetGame());
        grid.add(restartButton,  0,  3);

        Scene scene = new Scene(grid,  300,  350);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleClick(TicTacToeSquare square, int row, int col) {
        if (board[row][col] == '\0') {
            board[row][col] = currentPlayer;
            square.setText(Character.toString(currentPlayer));
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            checkWinner();
        }
    }

    private void handleMouseEntered(TicTacToeSquare square) {
        if (!isGameOver()) {
            square.setStyle("-fx-background-color: green;");
        }
    }

    private void handleMouseExited(TicTacToeSquare square) {
        if (!isGameOver()) {
            square.setStyle("-fx-background-color: white;");
        }
    }

    private void resetGame() {
        // Réinitialiser la grille et le score
    }

    private void checkWinner() {
        // Vérifier si un joueur a gagné
    }

    private boolean isGameOver() {
        // Vérifier si le jeu est terminé
    	return false;
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

class TicTacToeSquare extends Button {
    // Implémentation de la classe TicTacToeSquare
}
