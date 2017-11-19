/**
*@author Aidan
*@version 1
*Program which converts Arabic numerals to Roman numerals and vice versa
*/

import java.awt.*;      //gui
import javax.swing.*;   //gui
public class RomanNumeralsClient{
  public static void main(String[] args){
    JFrame frame = new JFrame("Arabic - Roman Converter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new MyPanel());
    frame.pack();
    frame.setVisible(true);
  }
}