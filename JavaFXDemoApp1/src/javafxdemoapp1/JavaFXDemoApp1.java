/*
 * @author Dale Skrien
 * @since Sept. 6, 2016
 * @version 1
 */
package javafxdemoapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXDemoApp1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button();
        button.setText("Click Me");
        button.addEventHandler(ActionEvent.ACTION,
            // Anonymous inner class
            new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    ((Button) event.getSource()).setText("Thank you");
                }
            });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}