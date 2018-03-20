


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
  
    @Override
    public void start(Stage primaryStage) {
       
    	primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
               
            }
        });
        
      
       Label label = new Label("Score Counter");
       label.setText("Score:");
       label.setTranslateX(10);
       label.setTranslateY(20);
                
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(label);
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
    }
}