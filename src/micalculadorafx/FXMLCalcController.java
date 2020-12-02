/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package micalculadorafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Daza-PC
 */
public class FXMLCalcController implements Initializable {
    
    @FXML
    private Label pantalla;
    
    private double num1,num2, result;
    
    private String operador;

   
    
    
    
    /**
     * Configuracion pad numerico
     * @param event 
     */
    
    @FXML
    private void action7(ActionEvent event) {
        
        String textoExistente = this.pantalla.getText();

        this.pantalla.setText(textoExistente + "7");
    }
    
    @FXML
    private void action8(ActionEvent event) {
        
        String textoExistente = this.pantalla.getText();

        this.pantalla.setText(textoExistente + "8");
    }
    
    @FXML
    private void action9(ActionEvent event) {
        
        String textoExistente = this.pantalla.getText();

        this.pantalla.setText(textoExistente + "9");
    }
    
    @FXML
    private void action6(ActionEvent event) {
        
        String textoExistente = this.pantalla.getText();

        this.pantalla.setText(textoExistente + "6");
    }
    
    @FXML
    private void action5(ActionEvent event) {
        
        String textoExistente = this.pantalla.getText();

        this.pantalla.setText(textoExistente + "5");
    }
    
    @FXML
    private void action4(ActionEvent event) {
        
        String textoExistente = this.pantalla.getText();

        this.pantalla.setText(textoExistente + "4");
    }
    
    @FXML
    private void action3(ActionEvent event) {
        
        String textoExistente = this.pantalla.getText();

        this.pantalla.setText(textoExistente + "3");
    }
    
    @FXML
    private void action2(ActionEvent event) {
        
        String textoExistente = this.pantalla.getText();

        this.pantalla.setText(textoExistente + "2");
    }
    
    @FXML
    private void action1(ActionEvent event) {
        
        String textoExistente = this.pantalla.getText();

        this.pantalla.setText(textoExistente + "1");
    }
    
    @FXML
    private void action0(ActionEvent event) {
        
        String textoExistente = this.pantalla.getText();

        this.pantalla.setText(textoExistente + "0");
    }
    
    /**
     * Fin Configuracion pad numerico
     * @param event 
     */
    
    
    /*
    borrar todo
    */
    @FXML
    private void borrarTodo(ActionEvent event) {
        this.pantalla.setText("");
    }
    
    @FXML
    private void dividir(ActionEvent event) {
        this.num1 = Double.parseDouble(this.pantalla.getText());
        this.operador = "/";
        this.pantalla.setText("");
    }
    
    @FXML
    private void sumar(ActionEvent event) {
        this.num1 = Double.parseDouble(this.pantalla.getText());
        this.operador = "+";
        this.pantalla.setText("");
    }
    
    @FXML
    private void multiplicar(ActionEvent event) {
        this.num1 = Double.parseDouble(this.pantalla.getText());
        this.operador = "*";
        this.pantalla.setText("");
    }
    
    @FXML
    private void restar(ActionEvent event) {
        this.num1 = Double.parseDouble(this.pantalla.getText());
        this.operador = "-";
        this.pantalla.setText("");
    }
    
    @FXML
    private void igual(ActionEvent event) {
        this.num2 = Double.parseDouble(this.pantalla.getText());
        
        this.pantalla.setText("");
        
        switch(this.operador){
            case "+": this.pantalla.setText(Double.toString(this.num1+this.num2));break;
            case "-": this.pantalla.setText(Double.toString(this.num1-this.num2));break;
            case "*": this.pantalla.setText(Double.toString(this.num1*this.num2));break;
            case "/": 
                if(num2!=0){
                    this.pantalla.setText(Double.toString(this.num1/this.num2));
                }break;
        }   
    }
  
    @FXML
    private void punto(ActionEvent event) {
        
       if(!(this.pantalla.getText().contains("."))){
            this.pantalla.setText(this.pantalla.getText()+".");
        }
        
    }
    
    @FXML
    private void borrar1(ActionEvent event) {
        
       String texto = this.pantalla.getText();
       
       String nuevo = "";
       
       if(texto.length()>0){
           
           for (int i = 0; i < texto.length()-1; i++) {
               nuevo = nuevo + texto.charAt(i);
           }
           
           this.pantalla.setText(nuevo);
           
       }
       
       
        
    }    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
