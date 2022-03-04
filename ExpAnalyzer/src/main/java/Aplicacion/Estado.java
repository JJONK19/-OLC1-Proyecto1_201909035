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
public class Estado {
    public String ID;
    public String nombre;
    public ArrayList<Transicion> tr;
    public ArrayList<String> sig;
    public boolean aceptar;
    
    public Estado(){
        ID = null;
        nombre = null;
        tr = new ArrayList<>();
        sig = new ArrayList<>();
        aceptar = false;
    }
}
