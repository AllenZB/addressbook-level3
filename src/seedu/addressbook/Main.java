package seedu.addressbook;

import javafx.application.Application;
import javafx.application.Platform;

import javafx.stage.Stage;
import seedu.addressbook.logic.Logic;
import seedu.addressbook.ui.Gui;
import seedu.addressbook.ui.Stoppable;

/**
 * Main entry point to the application.
 * commit
 */
public class Main extends Application implements Stoppable{

    /** Version info of the program. */
    public static final String VERSION = "AddressBook Level 3 - Version 1.0";

    private Gui gui;

    @Override
<<<<<<< HEAD
    public void start(Stage PrimaryStage) throws Exception{
        gui = new Gui(new Logic(), VERSION);
        gui.start(PrimaryStage, this);
=======
    public void start(Stage PrimaryStage) throws Exception{
        gui = new Gui(new Logic(), VERSION);
        gui.start(PrimaryStage, this);
>>>>>>> feature1
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        Platform.exit();
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}


