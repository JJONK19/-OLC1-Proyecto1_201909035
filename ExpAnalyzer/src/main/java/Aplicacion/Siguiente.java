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
public class Siguiente {
    public ArrayList<String> terminal; //Simbolo que maneja la hoja
    public String hoja;  //Hoja que este manejando el nodo
    public ArrayList<String> LS; //Lista de Siguientes
    public String simbolo; //Simbolo que maneja la hoja
    public Siguiente(){
        terminal = new ArrayList<>();
        hoja = "";
        LS = new ArrayList<>();  
    }
}
