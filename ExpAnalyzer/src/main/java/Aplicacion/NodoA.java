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
public class NodoA {
    public String ID;                   //Identificador usado en el grafo
    public String simbolo;             //Simbolo que contiene el nodo
    public String valor;                //Simbolo usado en el automata
    public Boolean anulable;           //Determina si el nodo es o no anulable
    public ArrayList<String> first;    //Lista de First del nodo
    public ArrayList<String> last;     //Lista de Last del nodo
    public String nombre;              //Nombre que va a llevar el nodo en el contro 
    public NodoA hijo1;                //Hijo primero del arbol
    public NodoA hijo2;                //Hijo segundo del arbol
    public String tipo;                //Determina si el arbol es hoja o padre
    
    public NodoA(){
        simbolo = " ";
        anulable = false;
        first = new ArrayList<>();
        last = new ArrayList<>();
        nombre = null;
        hijo1 = null;
        hijo2 = null;
        tipo = "";
    }
    
}
