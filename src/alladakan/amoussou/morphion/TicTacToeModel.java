package alladakan.amoussou.morphion;

import javafx.beans.property.*;
import javafx.beans.property.SimpleObjectProperty;
//import javafx.beans.property.BooleanProperty;


public class TicTacToeModel {
	

	/**
     * Taille du plateau de jeu (pour �tre extensible).
     */
    private final static int BOARD_WIDTH = 3;
    private final static int BOARD_HEIGHT = 3;
    /**
     * Nombre de pi�ces align�es pour gagner (idem).
     */
    private final static int WINNING_COUNT = 3;
    /**
     * Joueur courant.
     */
    private final ObjectProperty<Owner> turn =
            new SimpleObjectProperty<>(Owner.FIRST);
    /**
     * Vainqueur du jeu, NONE si pas de vainqueur.
     */
    private final ObjectProperty<Owner> winner =
            new SimpleObjectProperty<>(Owner.NONE);
    /**
     * Plateau de jeu.
     */
    private final ObjectProperty<Owner>[][] board = new ObjectProperty[BOARD_WIDTH][BOARD_HEIGHT];
    /**
     * Positions gagnantes.
     */
    private final BooleanProperty[][] winningBoard = new BooleanProperty[BOARD_WIDTH][BOARD_HEIGHT];


    /**
     * Constructeur priv�.
     */
    private TicTacToeModel() {
        // Initialisation du plateau de jeu
        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_HEIGHT; j++) {
                //board[i][j] = new SimpleObjectProperty<>(Owner.NONE);
               // winningBoard[i][j] = new SimpleObjectProperty<TicTacToeSquare>(BOARD_WIDTH, BOARD_WIDTH);
            }
        }
    }

    /**
     * @return la seule instance possible du jeu.
     */
    public static TicTacToeModel getInstance() {
        return TicTacToeModelHolder.INSTANCE;
    }

    private static class TicTacToeModelHolder {
        private static final TicTacToeModel INSTANCE = new TicTacToeModel();
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ObjectProperty<String> nom = new SimpleObjectProperty<>("John");

	        // Ajout d'un �couteur pour d�tecter les changements de valeur
	        nom.addListener((observable, oldValue, newValue) -> {
	            System.out.println("Nouveau nom : " + newValue);
	        });
	        
	        // Modification de la valeur de la propri�t�
	        nom.set("Alice");

	}

}
