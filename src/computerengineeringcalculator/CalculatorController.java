/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerengineeringcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author johnc
 */
public class CalculatorController implements Initializable
{

     

       
       private double previousNumber = 0.0;
       private double previousAnswer = 0.0;
       private boolean equalsPressed;
       @FXML
       private Label outputLabel;
       
       /**
        * Initializes the controller class.
        */
       @Override
       public void initialize(URL url, ResourceBundle rb) {
              // TODO
       }       

       @FXML
       private void decToHex(ActionEvent event) {
             
       }

       @FXML
       private void decToBin(ActionEvent event) {
       }

       @FXML
       private void binToDec(ActionEvent event) {
       }

       @FXML
       private void hexToDec(ActionEvent event) {
       }

       @FXML
       private void hexToBin(ActionEvent event) {
       }

       @FXML
       private void binToHex(ActionEvent event) {
       }
       
       
       // Number Input Buttons
       @FXML
       private void numZero(ActionEvent event) {
              String currentOutput = outputLabel.getText()+ "0";
              outputLabel.setText(currentOutput);      
       }

       @FXML
       private void numOne(ActionEvent event) {
              String currentOutput = outputLabel.getText()+ "1";
              outputLabel.setText(currentOutput);
       }

       @FXML
       private void numTwo(ActionEvent event) {
              String currentOutput = outputLabel.getText()+ "2";
              outputLabel.setText(currentOutput);
       }      

       @FXML
       private void numThree(ActionEvent event) {
              String currentOutput = outputLabel.getText()+ "3";
              outputLabel.setText(currentOutput);
       }
       
       @FXML
       private void numFour(ActionEvent event) {
              String currentOutput = outputLabel.getText()+ "4";
              outputLabel.setText(currentOutput);
       }
       
       @FXML
       private void numFive(ActionEvent event) {
              String currentOutput = outputLabel.getText()+ "5";
              outputLabel.setText(currentOutput);
       }
       
       @FXML
       private void numSix(ActionEvent event) {
              String currentOutput = outputLabel.getText()+ "6";
              outputLabel.setText(currentOutput);
       }
       
       @FXML
       private void numSeven(ActionEvent event) {
              String currentOutput = outputLabel.getText()+ "7";
              outputLabel.setText(currentOutput);
       }

       @FXML
       private void numEight(ActionEvent event) {
              String currentOutput = outputLabel.getText()+ "8";
              outputLabel.setText(currentOutput);
       }

       @FXML
       private void numNine(ActionEvent event) {
              String currentOutput = outputLabel.getText()+ "9";
              outputLabel.setText(currentOutput);
       }
       

       //  Buttons for Operators
       
       @FXML
       private void dotButton(ActionEvent event) {
              String currentOutput = outputLabel.getText()+ ".";
              outputLabel.setText(currentOutput);
       }

       @FXML
       private void expButton(ActionEvent event) {
       }
       
       @FXML
       private void multiplyButton(ActionEvent event) {                
              String currentOutput;
              if(equalsPressed == true)
                     currentOutput = "Ans* ";  
              else
                     currentOutput = outputLabel.getText() + "*";
              outputLabel.setText(currentOutput);
       }

       @FXML
       private void divideButton(ActionEvent event) {
               String currentOutput;
              if(equalsPressed == true)
                     currentOutput = "Ans/";  
              else
                     currentOutput = outputLabel.getText() + "/";
   
              outputLabel.setText(currentOutput);
       }

       @FXML
       private void addButton(ActionEvent event) {
              String currentOutput;
              if(equalsPressed == true){
                     currentOutput = "Ans+"; 
                     equalsPressed = false;
              }
              else
                     currentOutput = outputLabel.getText() + "+";
   
              outputLabel.setText(currentOutput);
              
       }

       @FXML
       private void subtractButton(ActionEvent event) {
                String currentOutput;
              if(equalsPressed == true){
                     currentOutput = "Ans-";  
                     equalsPressed = false;
              }
              else
                     currentOutput = outputLabel.getText() + "-";
   
              outputLabel.setText(currentOutput);
        
       }
       
       @FXML
       private void acButton(ActionEvent event) {
              outputLabel.setText("");
              this.previousNumber = 0;
       }

       @FXML
       private void deleteButton(ActionEvent event) {
              String currentOutput = outputLabel.getText();
              outputLabel.setText(currentOutput.substring(0,currentOutput.length()-1));
       }
       
        @FXML
       private void prevAnsButton(ActionEvent event) {
              outputLabel.setText(outputLabel.getText()+"Ans");
       }

       @FXML
       private void equalButton(ActionEvent event) {
              equalsPressed = true;
              // implement stack and queue operation on operator functions 
              
              
              outputLabel.setText("Ans"); // change "Ans" to the actual answer
       }

      
       
}
