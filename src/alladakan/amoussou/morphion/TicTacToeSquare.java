package alladakan.amoussou.morphion;
import com.sun.javafx.application.LauncherImpl;
import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;

import javafx.scene.control.TextField;

public class TicTacToeSquare  extends TextField {


    private static TicTacToeModel model = TicTacToeModel.getInstance();

    private final ObjectProperty<Owner> ownerProperty = new SimpleObjectProperty<>(Owner.NONE);

    private final BooleanProperty winnerProperty = new SimpleBooleanProperty(false);

    public ObjectProperty<Owner> ownerProperty() {
        return ownerProperty;
    }

    public BooleanProperty winnerProperty() {
        return winnerProperty;
    }

    public TicTacToeSquare(final int row, final int column) {
        // TODO: Initialisation de la case
    }
   
}
