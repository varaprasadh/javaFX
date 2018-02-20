import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SwitchingScenes extends Application{
	Stage window;
	Scene scene1,scene2;
  public static void main(String args[]){
  	launch(args);
  }
  public void start(Stage preStage) throws Exception{
  	window =preStage;
  	Label  l1=new Label("welcome to the first scene");
  	Button b1=new Button("to the scene 2");
  	b1.setOnAction(e->window.setScene(scene2));
  	VBox layout1=new VBox(20);
  	layout1.getChildren().addAll(l1,b1);
  	scene1=new Scene(layout1,200,200);

  	Button b2=new Button("go to scene 1");
  	b2.setOnAction(e->window.setScene(scene1));
  	//
  	StackPane sp=new StackPane();
  	sp.getChildren().add(b2);
  	scene2=new Scene(sp,400,400);
  	window.setScene(scene1);
  	window.setTitle("First app");
  	window.show();



  }



}