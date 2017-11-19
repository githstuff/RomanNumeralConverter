/**
*@author Aidan
*@version 1
* Panel
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyPanel extends JPanel{
  
  private JLabel labelArabic, labelRoman;
  private JButton btnConvertArabic, btnConvertRoman;
  private JTextField fieldArabic, fieldRoman;
  
  public MyPanel(){
    labelArabic = new JLabel("Arabic Numeral");
    add(labelArabic);
    fieldArabic = new JTextField(10);
    add(fieldArabic);
    btnConvertArabic = new JButton("Convert");
    ButtonListener listener = new ButtonListener();
    btnConvertArabic.addActionListener(listener);
    add(btnConvertArabic);
    labelRoman = new JLabel("Roman Numeral");
    add(labelRoman);
    fieldRoman = new JTextField(10);
    add(fieldRoman);
    btnConvertRoman = new JButton("Convert");
    btnConvertRoman.addActionListener(listener);
    add(btnConvertRoman);
  }
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      String strArabic =fieldArabic.getText();
      String strRoman =fieldRoman.getText();
      if(event.getSource()==btnConvertArabic){
        fieldRoman.setText(Converter.toRoman(Integer.parseInt(strArabic)));
      } else if(event.getSource()==btnConvertRoman){
        fieldArabic.setText(String.valueOf(Converter.toArabic(strRoman)));
      }
    }
  }
}