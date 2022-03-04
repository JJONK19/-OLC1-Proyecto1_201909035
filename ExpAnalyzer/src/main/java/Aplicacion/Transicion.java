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
public class Transicion {

    public Estado next;
    public ArrayList<String> car;
    public ArrayList<String> sig;
    public boolean borrar;
    public boolean rev;
    
    public Transicion(){
        next = null;
        car = new ArrayList<>();
        car = new ArrayList<>();
        borrar = false;
        rev = false;
    }
}
