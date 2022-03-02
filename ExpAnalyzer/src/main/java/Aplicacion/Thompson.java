/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacion;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author JJONK19
 */
public class Thompson {
    public String ID;
    public ArrayList<NodoT> Nodos;
    public NodoT Cabecera;
    
    public Thompson(String _ID, ArrayList<NodoT> _nodos, NodoT _cabecera){
        this.ID = _ID;
        this.Nodos = _nodos;
        this.Cabecera = _cabecera;
    }
    
//Metodos de Graficación
    //--------------------------------------------------------------------------
    
    //Unifica el texto que va en el grafo
    public String getcodigo(){
        String t = "digraph structs\n" +"{\n" + "node [shape=record];";
        if (head !=null){
            t += "\t"+ "struct1 [label=\"" + head.declare() + "\"];";
        }
        t += "}";
        return t;
    }
    
    //Crea y escribe el archivo que lleva el codifo del grafo generado
    public void escribir(String ruta, String contenido){
        FileWriter fichero = null;
        PrintWriter p = null;
        
        try{
            fichero  = new FileWriter(ruta);
            p = new PrintWriter(fichero);
            p.write(contenido);
            p.close();
            fichero.close();
        
        }catch(Exception e){
            System.out.print(e.getMessage());
            
        }finally{
            if (p!= null){
                p.close();
            }
        }
        
    }
    
    //Se encarga de dibujar el grafo. Ruta es el nombre del archivo *.txt y gname es el nombre
    //del grafo en formato *.png
    
    public void dibujar(String ruta, String gname){
        try{
            escribir(ruta, getcodigo());
            ProcessBuilder a;
            a = new ProcessBuilder("dot", "-Tpng", "-o", gname, ruta);
            a.redirectErrorStream(true);
            a.start();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
