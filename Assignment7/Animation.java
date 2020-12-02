package Assignment7;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application{ 
	private Sphere sphere;
	private Cylinder cylinder;
	private Box box;
	private Polygon polygon;
	private Menu menu1;
	private Menu menu2;
	private Menu menu3;
	private Menu menu4;
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) {
			
		sphere = new Sphere();
		sphere.setRadius(100.0f);
		PhongMaterial sphereMaterial = new PhongMaterial();
		sphereMaterial.setDiffuseColor(Color.LAVENDER);
		sphere.setMaterial(sphereMaterial);
		
		cylinder = new Cylinder();
		cylinder.setRadius(100.0f);
		cylinder.setHeight(200.0f);
		
		box = new Box(200, 200, 500);
		box.setTranslateX(40);
		PhongMaterial boxMaterial = new PhongMaterial();
		boxMaterial.setDiffuseColor(Color.BISQUE);
		box.setMaterial(boxMaterial);
		
		polygon = new Polygon();
		polygon.getPoints().addAll(new Double[] {
				200.0, 50.0, 
				400.0, 50.0, 
				450.0, 150.0,          
				400.0, 250.0, 
				200.0, 250.0,                   
				150.0, 150.0, 
		});
		polygon.setFill(Color.PALEGOLDENROD);
		
		menu1 = new Menu("Animate Sphere");
		menu2 = new Menu("Animate Cylinder");
		menu3 = new Menu("Animate Box");
		menu4 = new Menu("Animate Polygon");
				
		MenuItem sRotate = new MenuItem("Rotate");
		MenuItem cRotate = new MenuItem("Rotate");
		MenuItem bRotate = new MenuItem("Rotate");
		MenuItem pRotate = new MenuItem("Rotate");
		
		MenuItem sScale = new MenuItem("Scale");
		MenuItem cScale = new MenuItem("Scale");
		MenuItem bScale = new MenuItem("Scale");
		MenuItem pScale = new MenuItem("Scale");
		
		MenuItem pFade = new MenuItem("Fade");
		
		MenuItem sSequential = new MenuItem("Sequential");
		MenuItem cSequential = new MenuItem("Sequential");
		MenuItem bSequential = new MenuItem("Sequential");
		MenuItem pSequential = new MenuItem("Sequential");
		
		RotateButtonHandler rotBtnHandler = new RotateButtonHandler();
		ScaleButtonHandler sclBtnHandler = new ScaleButtonHandler();
		FadeButtonHandler fadBtnHandler = new FadeButtonHandler();
		SequentialButtonHandler seqBtnhandler = new SequentialButtonHandler();
		sRotate.setOnAction(rotBtnHandler);
		cRotate.setOnAction(rotBtnHandler);
		bRotate.setOnAction(rotBtnHandler);
		pRotate.setOnAction(rotBtnHandler);
		
		sScale.setOnAction(sclBtnHandler);
		cScale.setOnAction(sclBtnHandler);
		bScale.setOnAction(sclBtnHandler);
		pScale.setOnAction(sclBtnHandler);
		
		pFade.setOnAction(fadBtnHandler);
		
		sSequential.setOnAction(seqBtnhandler);
		cSequential.setOnAction(seqBtnhandler);
		bSequential.setOnAction(seqBtnhandler);
		pSequential.setOnAction(seqBtnhandler);
		
		
		menu1.getItems().addAll(sRotate, sScale, sSequential);
		menu2.getItems().addAll(cRotate, cScale, cSequential);
		menu3.getItems().addAll(bRotate, bScale, bSequential);
		menu4.getItems().addAll(pRotate, pScale, pFade, pSequential);
		
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(menu1, menu2, menu3, menu4);
		
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setVgap(90);
		gridPane.setHgap(90);
		
		gridPane.add(sphere, 0, 0);
		gridPane.add(cylinder, 0, 1);
		gridPane.add(box, 1, 0);
		gridPane.add(polygon, 1, 1);
		
		VBox root = new VBox();
		
		root.getChildren().addAll(menuBar, gridPane);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setX(300);
		stage.setY(200);
		stage.setTitle("Animation.java");
		stage.show();
	}
	
	public void rotate(RotateTransition rotateTransition) {
		rotateTransition.setDuration(Duration.millis(2000));
		rotateTransition.setByAngle(360);
		rotateTransition.setCycleCount(1);
		rotateTransition.setAutoReverse(false);
		rotateTransition.play();
	}
	
	public void scale(ScaleTransition scaleTransition) {
		scaleTransition.setDuration(Duration.millis(2000));
		scaleTransition.setByX(1.1);
		scaleTransition.setByY(1.1);
		scaleTransition.setCycleCount(2);
		scaleTransition.setAutoReverse(true);
		scaleTransition.play();
	}
	
	private class RotateButtonHandler implements EventHandler<ActionEvent> {
		@Override 
		public void handle(ActionEvent e) {
			RotateTransition rotateTransition = new RotateTransition();
			if(((MenuItem)e.getSource()).getParentMenu() == menu1)
				rotateTransition.setNode(sphere);	
			else if(((MenuItem)e.getSource()).getParentMenu() == menu2)
				rotateTransition.setNode(cylinder);	
			else if(((MenuItem)e.getSource()).getParentMenu() == menu3)
				rotateTransition.setNode(box);	
			else if(((MenuItem)e.getSource()).getParentMenu() == menu4)
				rotateTransition.setNode(polygon);	
			rotate(rotateTransition);
		}
	}
	
	private class ScaleButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			ScaleTransition scaleTransition = new ScaleTransition();
			if(((MenuItem)e.getSource()).getParentMenu() == menu1)
				scaleTransition.setNode(sphere);	
			else if(((MenuItem)e.getSource()).getParentMenu() == menu2)
				scaleTransition.setNode(cylinder);	
			else if(((MenuItem)e.getSource()).getParentMenu() == menu3)
				scaleTransition.setNode(box);	
			else if(((MenuItem)e.getSource()).getParentMenu() == menu4)
				scaleTransition.setNode(polygon);	
			scale(scaleTransition);
		}
	}
	
	private class FadeButtonHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e) {
			FadeTransition fadeTransition = new FadeTransition();
			fadeTransition.setDuration(Duration.millis(2000));
			fadeTransition.setNode(polygon);
			fadeTransition.setToValue(0.3);
			fadeTransition.setCycleCount(2);
			fadeTransition.setAutoReverse(true);
			fadeTransition.play();
		}
	}
	
	private class SequentialButtonHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e) {
			if(((MenuItem)e.getSource()).getParentMenu() == menu1) {
				RotateTransition rotateTransition = new RotateTransition();
				rotateTransition.setNode(sphere);
				rotate(rotateTransition);
				ScaleTransition scaleTransition = new ScaleTransition();
				scaleTransition.setNode(sphere);
				scale(scaleTransition);
			}
			
			else if(((MenuItem)e.getSource()).getParentMenu() == menu2) {
				RotateTransition rotateTransition = new RotateTransition();
				rotateTransition.setNode(cylinder);
				rotate(rotateTransition);
				ScaleTransition scaleTransition = new ScaleTransition();
				scaleTransition.setNode(cylinder);
				scale(scaleTransition);
			}
			
			else if(((MenuItem)e.getSource()).getParentMenu() == menu3) {
				RotateTransition rotateTransition = new RotateTransition();
				rotateTransition.setNode(box);
				rotate(rotateTransition);
				ScaleTransition scaleTransition = new ScaleTransition();
				scaleTransition.setNode(box);
				scale(scaleTransition);
			}
			
			else if(((MenuItem)e.getSource()).getParentMenu() == menu4) {
				RotateTransition rotateTransition = new RotateTransition();
				rotateTransition.setNode(polygon);
				rotate(rotateTransition);
				ScaleTransition scaleTransition = new ScaleTransition();
				scaleTransition.setNode(polygon);
				scale(scaleTransition);
				FadeTransition fadeTransition = new FadeTransition();
				fadeTransition.setDuration(Duration.millis(2000));
				fadeTransition.setToValue(0.3);
				fadeTransition.setCycleCount(2);
				fadeTransition.setAutoReverse(true);
				fadeTransition.setNode(polygon);
				fadeTransition.play();
			}
			
		}
	}
}
