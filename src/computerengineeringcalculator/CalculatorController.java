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
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle; 
 
/** 
 * FXML Controller class 
 * 
 * @author johnc 
 */ 
public class CalculatorController implements Initializable 
{ 
 
      
 
       String storedOutput = "";
       private double previousNumber = 0.0; 
       private double previousAnswer = 0.0; 
       private boolean equalsPressed; 
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
              answerLabel.setText(Calculator.decToHex(Integer.parseInt(outputLabel.getText())));
       } 
 
       @FXML 
       private void decToBin(ActionEvent event) { 
              answerLabel.setText(""+Calculator.decToBin(Integer.parseInt(outputLabel.getText())));
       } 
 
       @FXML 
       private void binToDec(ActionEvent event) { 
              answerLabel.setText(""+Calculator.binToDec(Integer.parseInt(outputLabel.getText())));
       } 
 
       @FXML 
       private void hexToDec(ActionEvent event) { 
              answerLabel.setText(""+Calculator.hexToDec(outputLabel.getText()));
       } 
 
       @FXML 
       private void hexToBin(ActionEvent event) { 
              answerLabel.setText(""+Calculator.hexToBin(outputLabel.getText()));
       } 
 
       @FXML 
       private void binToHex(ActionEvent event) { 
              answerLabel.setText(""+Calculator.binToHex(Integer.parseInt(outputLabel.getText())));
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
              outputLabel.setText( outputLabel.getText() + ",*,"); 
       } 
 
       @FXML 
       private void divideButton(ActionEvent event) { 
                 outputLabel.setText( outputLabel.getText() + ",/,"); 
       } 
 
       @FXML 
       private void addButton(ActionEvent event) { 
                outputLabel.setText( outputLabel.getText() + ",+,"); 
               
       } 
 
       @FXML 
       private void subtractButton(ActionEvent event) { 
                outputLabel.setText( outputLabel.getText() + "-"); 
         
       } 
        
       @FXML 
       private void acButton(ActionEvent event) { 
              outputLabel.setText(""); 
              answerLabel.setText("");
       } 
 
       @FXML 
       private void deleteButton(ActionEvent event) { 
              String currentOutput = outputLabel.getText(); 
              if(currentOutput.length() > 0)
              outputLabel.setText(currentOutput.substring(0,currentOutput.length()-1)); 
       } 
        
       //not implemented yet
        @FXML 
       private void prevAnsButton(ActionEvent event) { 
              outputLabel.setText(outputLabel.getText()+",Ans,"); 
       } 
 
       @FXML 
       private void equalButton(ActionEvent event) { 
              // implement stack and queue operation on operator functions  
              String [] operate =  outputLabel.getText().split(",");
               double lastNum = 0;
              for(int i = 0; i<operate.length;i++){
                     
                     lastNum = Double.parseDouble(operate[i]);
                     
                     switch(operate[++i]){
                            case "+":
                                   lastNum += Double.parseDouble(operate[++i]);
                                   break;
                            case "-":
                                   lastNum -= Double.parseDouble(operate[++i]);
                                    break;
                            case "*":
                                   lastNum *= Double.parseDouble(operate[++i]);
                                   break;
                            case "/":
                                   lastNum /= Double.parseDouble(operate[++i]);
                     }
              }
              
              answerLabel.setText(lastNum+"");
              
       } 

       
       //storage and letter buttons
       @FXML
       private void buttonA(ActionEvent event) {
              outputLabel.setText(outputLabel.getText()+ "A"); 
       }
       
       @FXML
       private void buttonB(ActionEvent event) {
               outputLabel.setText(outputLabel.getText()+ "B"); 
       }
       @FXML
       private void buttonC(ActionEvent event) {
               outputLabel.setText(outputLabel.getText()+ "C"); 
       }
       
       @FXML
       private void buttonD(ActionEvent event) {
               outputLabel.setText(outputLabel.getText()+ "D"); 
       }
       
       @FXML
       private void buttonE(ActionEvent event) {
               outputLabel.setText(outputLabel.getText()+ "E"); 
       }

       @FXML
       private void buttonF(ActionEvent event) {
               outputLabel.setText(outputLabel.getText()+ "F"); 
       }


     

       
        
} 
