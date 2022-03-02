/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacion;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;

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
        String t = "digraph G\n" +"{\n" + "rankdir=LR";
        //Asignación de nombres, ID, y nodo
        for(int i = 0; i < this.Nodos.size(); i++){
            NodoT temp = Nodos.get(i);
            temp.ID = "\""+UUID.randomUUID().toString() + "\"";
            temp.Nombre = "S" + Integer.toString(i);
            
            if(i == (this.Nodos.size()-1)){
                t += temp.ID + "[ label=\""+ temp.Nombre + "\" shape=doublecircle];\n";
            }else{
                t += temp.ID + "[ label=\""+ temp.Nombre + "\" shape=circle];\n";
            }
        }
        
        //Conexión de Nodos
        for(int i = 0; i < this.Nodos.size(); i++){
            NodoT temp = Nodos.get(i);
            //Conexion a Next1
            if(temp.next1 != null){
                t += temp.ID + "->" + temp.next1.ID + "[minlen=2 label =  " + temp.tran1 +"];\n";
            }
            //Conexion a Next 2
            if(temp.next2 != null){
                if(temp.constraint){
                    t +=temp.ID + "->" + temp.next2.ID + "[constraint=false minlen=2 label =  " + temp.tran2 +"];\n";
                }else{
                    t += temp.ID + "->" + temp.next2.ID + "[minlen=2 label =  " + temp.tran2 +"];\n";
                }
            }
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
    
    public void dibujar(){
        try{
            String ruta = "Reportes/AFND_201909035/"+this.ID+".txt";
            String gname = "Reportes/AFND_201909035/"+this.ID+".png";
            escribir(ruta, getcodigo());
            ProcessBuilder a;
            a = new ProcessBuilder("dot", "-Tpng", "-o", gname, ruta);
            a.redirectErrorStream(true);
            a.start();
            
            File f= new File(ruta);    
            if (f.delete()) { 
                
              } else {
                
              } 
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
