/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 
package computerengineeringcalculator; 
 
import java.net.URL; 
import java.util.ArrayList;
import java.util.ResourceBundle; 
import javafx.event.ActionEvent; 
import javafx.fxml.FXML; 
import javafx.fxml.Initializable; 
import javafx.scene.control.Label; 
 
/** 
 * FXML Controller class 
 * 
 * @author johnc 
 */ 
public class CalculatorController implements Initializable 
{ 
 
      
 
       // string with delimiters
       private String currentOutput = "";
       
       //implementation of previous answer memory 
       private double previousAnswer = 0.0; 
       
       @FXML 
       private Label outputLabel; 
       @FXML
       private Label answerLabel;
        
       /** 
        * Initializes the controller class. 
        */ 
       @Override 
       public void initialize(URL url, ResourceBundle rb) { 
              // TODO 
       }        
 
       @FXML 
       private void decToHex(ActionEvent event) { 
              answerLabel.setText(Calculator.decToHex(Integer.parseInt(currentOutput)));
       } 
 
       @FXML 
       private void decToBin(ActionEvent event) { 
              answerLabel.setText(Calculator.decToBin(Integer.parseInt(outputLabel.getText())));
       } 
 
       @FXML 
       private void binToDec(ActionEvent event) { 
              answerLabel.setText(""+Calculator.binToDec(Integer.parseInt(outputLabel.getText())));
       } 
 
       @FXML 
       private void hexToDec(ActionEvent event) { 
              answerLabel.setText( Calculator.hexToDec(outputLabel.getText()) + "");
       } 
 
       @FXML 
       private void hexToBin(ActionEvent event) { 
              answerLabel.setText( ""+ Calculator.hexToBin(outputLabel.getText()));
       } 
 
       @FXML 
       private void binToHex(ActionEvent event) {
              answerLabel.setText(Calculator.binToHex(Integer.parseInt(outputLabel.getText())));
       } 
        
        
/********************************************Number Input Buttons******************************************************************/
       @FXML 
       private void numZero(ActionEvent event) { 
              currentOutput += "0";
              outputLabel.setText(outputLabel.getText() + "0");
       } 
 
       @FXML 
       private void numOne(ActionEvent event) { 
              currentOutput += "0";
              outputLabel.setText(outputLabel.getText() + "1");
       } 
 
       @FXML 
       private void numTwo(ActionEvent event) {
              currentOutput += "2";
              outputLabel.setText(outputLabel.getText() + "2");
       }       
 
       @FXML 
       private void numThree(ActionEvent event) { 
              currentOutput += "3";
              outputLabel.setText(outputLabel.getText() + "3");
       } 
        
       @FXML 
       private void numFour(ActionEvent event) { 
              currentOutput += "4";
              outputLabel.setText(outputLabel.getText() + "4");
       } 
        
       @FXML 
       private void numFive(ActionEvent event) { 
              currentOutput += "5";
              outputLabel.setText(outputLabel.getText() + "5");
       } 
        
       @FXML 
       private void numSix(ActionEvent event) { 
              currentOutput += "6";
              outputLabel.setText(outputLabel.getText() + "6");
       } 
        
       @FXML 
       private void numSeven(ActionEvent event) {
              currentOutput += "7";
              outputLabel.setText(outputLabel.getText() + "7");
       } 
 
       @FXML 
       private void numEight(ActionEvent event) {
              currentOutput += "8";
              outputLabel.setText(outputLabel.getText() + "8");
       } 
 
       @FXML 
       private void numNine(ActionEvent event) {
              currentOutput += "9";
              outputLabel.setText(outputLabel.getText() + "9");
       } 
        
 
/*****************************************Math Operator Buttons.******************************************************************/
        
       @FXML 
       private void dotButton(ActionEvent event) { 
              currentOutput = outputLabel.getText()+ "."; 
              outputLabel.setText(outputLabel.getText() + "."); 
       } 
 
       @FXML 
       private void expButton(ActionEvent event) { 
       } 
       
       @FXML 
       private void multiplyButton(ActionEvent event) {    
              currentOutput += ",*,";
              outputLabel.setText( outputLabel.getText() + "*"); 
       } 
 
       @FXML 
       private void divideButton(ActionEvent event) { 
              currentOutput += ",/,";
              outputLabel.setText( outputLabel.getText() + "/"); 
       } 
 
       @FXML 
       private void addButton(ActionEvent event) { 
                currentOutput += ",+,";
                outputLabel.setText( outputLabel.getText() + "+"); 
       } 
 
       @FXML 
       private void subtractButton(ActionEvent event) { 
                currentOutput += ",-,";
                outputLabel.setText( outputLabel.getText() + "-"); 
       } 
        
       
       @FXML 
       private void acButton(ActionEvent event) { 
              outputLabel.setText(""); 
              answerLabel.setText("");
              currentOutput  = "";          
       } 
 
       @FXML 
       private void deleteButton(ActionEvent event) { 
         
              //deletes one character from output label
              if(!outputLabel.getText().isEmpty())       
                     outputLabel.setText(outputLabel.getText().substring(0,outputLabel.getText().length()-1));  
              
              //coincides with output label
              if(!currentOutput.isEmpty()){
                     // if operator , deletes operator substring 
                     if(currentOutput.charAt(currentOutput.length() -1) == ',' )
                            currentOutput = currentOutput.substring(0,currentOutput.length()-3);
                     // else deletes one character 
                     else
                            currentOutput = currentOutput.substring(0,currentOutput.length() -1);    
              }
       } 
       
        
       //NOT IMPLEMENTED YET
        @FXML 
       private void prevAnsButton(ActionEvent event) { 
              outputLabel.setText(outputLabel.getText()+",Ans,"); 
       } 
 
       @FXML 
       private void equalButton(ActionEvent event) { 
              
              ArrayList<String> chList = new ArrayList<String>();
              String [] chArr =  currentOutput.split(",");   
              //convert to char String ArrayList 
              for(int i = 0; i < chArr.length;i++){
                     chList.add(chArr[i]);
              }
              boolean isOperator = false;
              // gets next operator
              //calculates output of substring of left num + operator + right num 
              //simplifies original string with calculated output
              for(int  i = 0; i < chList.size(); i++){
                     switch(chList.get(i)){
                            case "+":
                                   previousAnswer = Double.parseDouble(chList.get(i-1)) + Double.parseDouble(chList.get(i+1));
                                   isOperator = true;
                                   break;
                            case "*":
                                   previousAnswer = Double.parseDouble(chList.get(i-1)) * Double.parseDouble(chList.get(i+1));
                                   isOperator = true;
                                   break;
                            case "/":
                                   previousAnswer = Double.parseDouble(chList.get(i-1)) / Double.parseDouble(chList.get(i+1));
                                   isOperator = true;
                                   break;
                     }
                     if(isOperator){ 
                            chList.set(i+1, previousAnswer+"");
                            chList.remove(i);
                            chList.remove(i-1);              
                            i --;
                            isOperator = false;
                     }  
             }       
              answerLabel.setText(previousAnswer+"");       
       } 

       
       //storage and letter buttons
       @FXML
       private void buttonA(ActionEvent event) {
              outputLabel.setText(outputLabel.getText()+ "A"); 
              currentOutput += "A";
       }
       
       @FXML
       private void buttonB(ActionEvent event) {
               outputLabel.setText(outputLabel.getText()+ "B"); 
               currentOutput += "B";
       }
       @FXML
       private void buttonC(ActionEvent event) {
               outputLabel.setText(outputLabel.getText()+ "C"); 
               currentOutput += "C";
       }
       
       @FXML
       private void buttonD(ActionEvent event) {
               outputLabel.setText(outputLabel.getText()+ "D"); 
               currentOutput += "D";
       }
       
       @FXML
       private void buttonE(ActionEvent event) {
               outputLabel.setText(outputLabel.getText()+ "E"); 
               currentOutput += "E";
       }

       @FXML
       private void buttonF(ActionEvent event) {
               outputLabel.setText(outputLabel.getText()+ "F"); 
               currentOutput += "F";
       }


     

       
        
} 
