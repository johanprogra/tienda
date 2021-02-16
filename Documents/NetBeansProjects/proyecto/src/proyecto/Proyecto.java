
package proyecto;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Proyecto extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane grippane=new GridPane();
        grippane.setAlignment(Pos.CENTER);
        grippane.setHgap(10);
        grippane.setHgap(10);
        Scene scene=new Scene(grippane,300,275);
        Text scenetitle = new Text("LOGiN");
        scenetitle.setFont(Font.font("Arial",FontWeight.BLACK,25));
        Label username = new Label("USERNAME");
        TextField textField=new TextField();
        Label password= new Label("password");
        PasswordField passwordField = new PasswordField();
        
        grippane.add(scenetitle,0,0,2,1);
        grippane.add(username,0,1);
        grippane.add(textField,1,1);
        grippane.add(password,0,2);
        grippane.add(passwordField,1,2);
        //grippane.setGridLinesVisible(true);
        
        Button button=new Button("LOGIN");
        HBox hbox=new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(button);
        grippane.add(hbox, 1, 4);
        
        final Text action = new Text();
        button.setOnAction((event)->{
           action.setFill(Color.BLUE);
           action.setText("click");
    });
        primaryStage.setTitle("formulario");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
