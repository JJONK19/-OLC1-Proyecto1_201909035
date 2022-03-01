/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacion;

import java.util.ArrayList;

/**
 *
 * @author JJONK19
 */
public class Conjunto {
    String ID; //Identificador del Conjunto
    ArrayList<String> conjunto; //Arreglo de caracteres que conforman el conjunto
    String notacion; //Notación en formato regex del conjunto
    
    public Conjunto(String _ID, ArrayList<String> _conjunto, String _notacion){
        this.ID = _ID; 
        this.conjunto = _conjunto; 
        this.notacion = _notacion;
    }
}
