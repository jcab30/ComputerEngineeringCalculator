/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerengineeringcalculator;
import java.math.*;
/**
 *
 * @author johnc
 */
public class Calculator
{
       
       /**
        * Overview.
        * 
        *  The list of functions available to be used on the calculator.
        */
     
       private String owner;
       
       public Calculator(String owner){
              this.owner = owner;
       }
       
       
       /**
        * <ul>
        * <li>Requires:
        * <li>Modifies:
        * <li>Effects;
        * </ul>
        */
       public static double sum(double prev,double ... num){
              double total = prev;
              for(int i = 0; i < num.length; i++)
                     total+= num[i];
              
              return total;
       }
       
       /**
        * <ul>
        * <li>Requires:
        * <li>Modifies:
        * <li>Effects;
        * </ul>
        */
       public static double product(double prev, double ... num){
              double total = prev;
              for(int i = 0; i < num.length; i++)
                     total*= num[i];
              
              return total;
       }
       
       /**
        * <ul>
        * <li>Requires:
        * <li>Modifies:
        * <li>Effects;
        * </ul>
        */
       public static double difference(double prev, double... num){
              double total = prev;
              for(int i = 0; i < num.length; i++)
                     total-= num[i];
              
              return total;
       }
       
        /**
        * <ul>
        * <li>Requires:  A binary number (representation of 1s and 0s) 
        * <li>Effects: returns value in decimal representation 
        * </ul>
        */
       public static int binToDec(int num){
              
              String stringRep= num+"";
              double decValue = 0;
              
              while(stringRep.length() < 8)
                     stringRep = '0' + stringRep;
              
              for(int i = 0; i < stringRep.length(); i++){
                     if(stringRep.charAt(i) == '1' ){
                            decValue += Math.pow(2, 7-i);
                     }
              }
              
              return (int) decValue;
       }
       
       /**
        * <ul>
        * <li>Requires: 
        * <li>Effects: returns hexadecimal representation of the passed integer
        * </ul>
        */
       public static String binToHex(int num){
              
              int left,right;
              String stringRep= num+"";
                     
              while(stringRep.length() < 8)
                     stringRep = '0' + stringRep;
                     
              left = Integer.parseInt(stringRep.substring(0, 4)); 
              
              right = Integer.parseInt(stringRep.substring(4));
                     
              String hexRep = nibbleToHex(left) + ""+nibbleToHex(right);
                     
              return hexRep;
       }
       
       /**
        * <ul>
        * <li>Requires: non-negative integer
        * <li>Effects: returns binary representation of passed integer
        * </ul>
        */
       public static int decToBin(int num){
              
              String binRep = "";
              
              while(num!= 0){
                     if(num%2 == 1)
                            binRep = "1"+ binRep; 
                     else 
                            binRep = "0"+binRep;       
                     num /= 2;
              }
             
              return  Integer.parseInt(binRep);
       }
       
       /**
        * <ul>
        * <li>Modifies: 
        * <li>Effects:
        * </ul>
        */
       public static String decToHex( int num ){
              String temp =  ""+decToBin(num);           
              
              return binToHex(Integer.parseInt(temp));
       } 
       
       
      /**
        * <ul>
        * <li>Requires: hexadecimal number
        * <li>Effects: returns the binary representation of hex
        * </ul>
        */
       public static int hexToBin(String hexRep){
              
              String binRep = "";
              
              for(int i = 0; i < hexRep.length(); i++)
                     binRep += hexToNibble(hexRep.charAt(i)+"");
              return Integer.parseInt(binRep);     
       } 
       
       
       /**
        * <ul>
        * <li>Requires:
        * <li>Modifies:
        * <li>Effects;
        * </ul>
        */
       public static int hexToDec(String hexRep){
              return binToDec(hexToBin(hexRep));
       }
       
       
       
       
         /**
        * <ul>
        * <li>Requires: 
        * <li>Modifies:
        * <li>Effects:
        * </ul>
        */
       private static String nibbleToHex(int nibble){
              
              int num = binToDec(nibble);
              
              if(num < 10)
                     return num+"";
              
              switch(num){
                     case 10:
                            return "A";
                     case 11: 
                            return "B";
                     case 12:
                            return "C";
                     case 13: 
                            return "D";
                     case 14: 
                            return "E";
                     case 15: 
                            return "F";
              }
              
              return null;
       }
    
       
       private static int hexToNibble(String hex){
              
              hex = hex.toUpperCase();
              // change to decimal represenation
              try{
                     int binRep = Integer.parseInt(hex + "");
                     return decToBin(binRep);
              }
              catch(NumberFormatException e){
                     
                     switch(hex){
                            case "A":
                                   return 1010;
                            case "B":
                                   return 1011;
                            case "C":
                                   return 1100;
                            case "D":
                                   return 1101;
                            case "E":
                                   return 1110;
                            case "F":
                                   return 1111;     
                            default:
                                   return 0;
                     }   
              }
       }
       
}