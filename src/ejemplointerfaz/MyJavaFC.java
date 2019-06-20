/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaz;
import java.io.FileInputStream;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
/**
 *
 * @author usuario
 */
public class MyJavaFC extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{
    Label l1=new Label("asdasd");
    Label l2=new Label("Search");
    FileInputStream input=new FileInputStream("C:\\Users\\usuario\\Documents\\NetBeansProjects\\ejemploInterfaz\\miscellaneouslibrary_miscelaneos_13057.png");
    FileInputStream input2=new FileInputStream("C:\\Users\\usuario\\Documents\\NetBeansProjects\\ejemploInterfaz\\JW_Library_41065.png");
   
    Image image=new Image (input);
    Image torre=new Image(input2);
   
    Label l3 =new Label("Search", new ImageView(image));
    
    Button b1=new Button("Jugar");
   Button b2=new Button("Torre", new ImageView (torre));
   Button b3=new Button("Castillo");
   HBox hbox=new HBox();
   HBox hbox1=new HBox();
   VBox vbox=new VBox();
   /*ToggleGroup grupo = new ToggleGroup();
   RadioButton rb1 = new RadioButton("Destruir");
   rb1.setToggleGroup(grupo);
   rb1.setSelected(true);
   RadioButton rb2 = new RadioButton("Asaltar");
   rb2.setToggleGroup(grupo);
   RadioButton rb3 = new RadioButton("Escalar");
   rb3.setToggleGroup(grupo);
   
   vbox.getChildren().add(rb1);
   vbox.getChildren().add(rb2);
   vbox.getChildren().add(rb3);
  Label l4= new Label("A");
  Label l5=new Label("B");
  hbox.getChildren().add(l1);
  hbox.getChildren().add(b1);
  hbox1.getChildren().add(l2);
  hbox1.getChildren().add(b3);
   vbox.getChildren().add(hbox);
   vbox.getChildren().add(hbox1);
   vbox.getChildren().add(b2);*/
   
  Pane p1=new Pane();
  Canvas table = new Canvas(90,90);
  p1.getChildren().add(table);
  GraphicsContext lapiz=table.getGraphicsContext2D();
  lapiz.setFill(Color.BLACK);
  lapiz.fillRect(0, 0, 30, 30);
  lapiz.fillRect(0, 60, 30, 30);
  lapiz.fillRect(30, 30, 30, 30);
  lapiz.fillRect(60, 0, 30, 30);
  lapiz.fillRect(60, 60, 30, 30); 
   lapiz.setFill(Color.WHITE);
  lapiz.fillRect(0, 30, 30, 30);
  lapiz.fillRect(30, 0, 30, 30);
  lapiz.fillRect(30, 60, 30, 30);
  lapiz.fillRect(60, 30, 30, 30);
  
  
  TableView tables = new TableView();
  tables.setEditable(true);
  TableColumn firstNameCol= new TableColumn("puntuacion");
  TableColumn lastNameCol= new TableColumn("Nombre");
  TableColumn emailCol= new TableColumn("Email");
  tables.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
  hbox.getChildren().add(p1);
  hbox.getChildren().add(b1);
  vbox.getChildren().add(hbox);
  vbox.getChildren().add(tables);
   Scene scene= new Scene (vbox, 500,500);
    primaryStage.setTitle("HBox");
    primaryStage.setScene(scene);
    primaryStage.show();}
    public static void main(String[]args){
    Application.launch(args);
    }
    
    }
