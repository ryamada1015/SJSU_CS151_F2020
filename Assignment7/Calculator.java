package Assignment7;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Calculator extends Application {
	private TextField inputPanel;
	private ArrayList<Button> digits;
	private Button divBtn;
	private Button multBtn;
	private Button minBtn;
	private Button plusBtn;
	private Button eqBtn;
	private Double firstOperand;
	private String currentOperation;

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override 
	public void start(Stage stage) {
		
		inputPanel = new TextField("");
		inputPanel.setMaxWidth(260);
		
		digits = new ArrayList<>();
		
		DigitButtonHandler digBtnHandler = new DigitButtonHandler();
		for(int i = 0; i < 12; i++) {
			
			if(i == 10)
				digits.add(new Button("."));
			else if(i == 11)
				digits.add(new Button("AC"));
			else 
				digits.add(new Button(Integer.toString(i)));
			
			digits.get(i).setOnAction(digBtnHandler);
		}
		

		GridPane digitPanel = new GridPane();
		digitPanel.setPadding(new Insets(10, 10, 10, 10));
		digitPanel.setVgap(10);
		digitPanel.setHgap(10);
		int c = 0;
		int r = 0;
		for(int i = 0; i < 12; i++) {
			digitPanel.add(digits.get(i), c++, r);
			
			if(c == 3) {
				c = 0;
				r++;
			}
			digits.get(i).setMinWidth(35);
			digits.get(i).setMinHeight(33);
		}
		
		ImageView divSign = new ImageView(new Image(getClass().getResourceAsStream("./div-sign.png")));
		ImageView multSign = new ImageView(new Image(getClass().getResourceAsStream("./mult-sign.png")));
		ImageView minSign = new ImageView(new Image(getClass().getResourceAsStream("./min-sign.png")));
		ImageView plusSign = new ImageView(new Image(getClass().getResourceAsStream("./plus-sign.png")));
		ImageView eqSign = new ImageView(new Image(getClass().getResourceAsStream("./eq-sign.png")));
		
		divSign.setFitHeight(13);
		divSign.setPreserveRatio(true);
		multSign.setFitHeight(13);
		multSign.setPreserveRatio(true);
		minSign.setFitHeight(13);
		minSign.setPreserveRatio(true);
		plusSign.setFitHeight(13);
		plusSign.setPreserveRatio(true);
		eqSign.setFitHeight(13);
		eqSign.setPreserveRatio(true);

		divBtn = new Button();
		multBtn = new Button();
		minBtn = new Button();
		plusBtn = new Button();
		eqBtn = new Button();
		divBtn.setGraphic(divSign);
		multBtn.setGraphic(multSign);
		minBtn.setGraphic(minSign);
		plusBtn.setGraphic(plusSign);
		eqBtn.setGraphic(eqSign);
		divBtn.setMinSize(140, 10);
		multBtn.setMinSize(140, 10);
		minBtn.setMinSize(140, 10);
		plusBtn.setMinSize(140, 10);
		eqBtn.setMinSize(140, 10);
		
		OperatorButtonHandler opBtnHandler = new OperatorButtonHandler();
		EqualButtonHandler eqBtnHandler = new EqualButtonHandler();
		divBtn.setOnAction(opBtnHandler);
		multBtn.setOnAction(opBtnHandler);
		minBtn.setOnAction(opBtnHandler);
		plusBtn.setOnAction(opBtnHandler);
		eqBtn.setOnAction(eqBtnHandler);

		
		VBox operatorPanel = new VBox();
		operatorPanel.setSpacing(10);
		operatorPanel.setPadding(new Insets(10, 10, 10, 10));
		operatorPanel.getChildren().addAll(divBtn, multBtn, minBtn, plusBtn, eqBtn);
		
		FlowPane buttonPanel = new FlowPane();
		buttonPanel.setAlignment(Pos.CENTER);
		buttonPanel.getChildren().addAll(digitPanel, operatorPanel);
		
		VBox displayPanel = new VBox();
		displayPanel.setAlignment(Pos.CENTER);
		displayPanel.getChildren().addAll(inputPanel, buttonPanel);
		
		Scene scene = new Scene(displayPanel);
		stage.setScene(scene);
		
		stage.setX(200);
		stage.setY(400);
		stage.setTitle("JavaFX Calculator");
		stage.show();
		
		
	}
	
	public void initialize() {
		currentOperation = "";
		firstOperand = 0.0;
		inputPanel.clear();
	}
	
	 class DigitButtonHandler implements EventHandler<ActionEvent> 
	    { 
	       @Override 
	       public void handle(ActionEvent e) 
	       {
	    	   String newDigit = "";
	    	   if(e.getSource() == digits.get(11))
	    		   initialize();
	    	   
	    	   else if (e.getSource() == digits.get(0)) {
	               newDigit = "0";
	           }
	           else if (e.getSource() == digits.get(1)) {
	               newDigit = "1";
	           }
	           else if (e.getSource() == digits.get(2)) {
	               newDigit = "2";
	           }
	           else if (e.getSource() == digits.get(3)) {
	               newDigit = "3";
	           }
	           else if (e.getSource() == digits.get(4)) {
	               newDigit = "4";
	           }
	           else if (e.getSource() == digits.get(5)) {
	               newDigit = "5";
	           }
	           else if (e.getSource() == digits.get(6)) {
	               newDigit = "6";
	           }
	           else if (e.getSource() == digits.get(7)) {
	               newDigit = "7";
	           }
	           else if (e.getSource() == digits.get(8)) {
	               newDigit = "8";
	           }
	           else if (e.getSource() == digits.get(9)) {
	               newDigit = "9";
	           }
	           else if(e.getSource() == digits.get(10))
	        	   newDigit = ".";
	    	
	           inputPanel.setText(inputPanel.getText() + newDigit);
	       } 
	    }  
	 
	 class OperatorButtonHandler implements EventHandler<ActionEvent> {
		 @Override
		 public void handle(ActionEvent e) {
			 if(e.getSource() == divBtn) 
				 currentOperation = "/";
			 else if(e.getSource() == multBtn)
				 currentOperation = "*";
			 else if(e.getSource() == minBtn)
				 currentOperation = "-";
			 else if(e.getSource() == plusBtn)
				 currentOperation = "+";
			 
	         firstOperand = new Double(inputPanel.getText());
	         inputPanel.clear();
		 }
	 }
	 
	 class EqualButtonHandler implements EventHandler<ActionEvent> {
		 @Override
		 public void handle(ActionEvent e) {
			 Double result = 0.0;
			 Double secondOperand = new Double(inputPanel.getText());
			 switch(currentOperation) {
			 case "/":
				 result = firstOperand / secondOperand;
				 break;
			 case "*":
				 result = firstOperand * secondOperand;
				 break;
			 case "-":
				 result = firstOperand - secondOperand;
				 break;
			 case "+":
				 result = firstOperand + secondOperand;
				 break;
			 }
			 
			 inputPanel.setText(Double.toString(result));
			 firstOperand = result;
		 }
	 }

}
