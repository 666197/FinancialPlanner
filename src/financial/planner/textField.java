/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package financial.planner;

import java.awt.Color;
import javax.swing.JTextField;
/**
 *
 * @author salih
 */
public class textField extends javax.swing.JTextField{
   /* static void focused(String str){
        if(this.getText().equals("Name")){
            this.setText("");
            this.setForeground(Color.BLACK);
        }
    }*/
    static void textFocus(String str, javax.swing.JTextField jTextField){
        if(jTextField.getText().equals(str)){
            jTextField.setText("");
            jTextField.setForeground(Color.BLACK);
        }
    }
    
    static void textUnfocus(String str, javax.swing.JTextField jTextField){
        if(jTextField.getText().equals("")){
            jTextField.setText(str);
            jTextField.setForeground(new Color(153,153,153));
        }
    }
}
