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
public class Estados {
    public String ID;
    public ArrayList<Estado> est;
    
    public Estados(String _id, ArrayList<Estado> tab ){
        ID = _id;
        est = tab;    
    }
    
    //Metodos de Graficación
    //--------------------------------------------------------------------------
    
    //Unifica el texto que va en el grafo
    public String getcodigo(){
        String t = "digraph G\n" +"{\n" +  "rankdir=LR  node [ shape=record]\n";  
        t += "a[label = \""   ;
        t += "{Estado | Transición}";        
        
        
        for(int i = 0; i < est.size(); i++){
            Estado ret = est.get(i);
            ArrayList<String> tr = ret.sig;
            String Trans = "";
            ArrayList<Transicion> ba = ret.tr;
            String siguientes = "S" + Integer.toString(i) + " (";
            for(int k = 0; k < tr.size(); k++){
                siguientes += tr.get(k) + " ";
            }
            siguientes += ")";
            for(int k = 0; k < ba.size(); k++){
                Transicion trt =ba.get(k);
                Trans += trt.next.nombre + " - ( ";
                for(int l = 0; l < trt.car.size(); l++){
                    Trans += trt.car.get(l) + " ";
                }        
                Trans += ")";
                t += "| {" + siguientes + "|" + Trans + "}";  
                Trans = "";
            }
        }
        t += "\"]}";
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
            String ruta = "Reportes/TRANSICIONES_201909035/"+this.ID+".txt";
            String gname = "Reportes/TRANSICIONES_201909035/"+this.ID+".png";
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
