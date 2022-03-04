/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacion;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author JJONK19
 */
public class Follows {
    public String ID;
    public ArrayList<Siguiente> Siguientes;
    
    public Follows(String _ID, ArrayList<Siguiente> _sis){
        this.ID = _ID;
        this.Siguientes = _sis;
        
    }
    
    //Metodos de Graficación
    //--------------------------------------------------------------------------
    
    //Unifica el texto que va en el grafo
    public String getcodigo(){
        String t = "digraph G\n" +"{\n" +  "node [ shape=record]\n";  
        t += "a[label = \""   ;
        t += "{Hoja|Terminal|Siguiente}";        
        
        
        for(int i = 0; i < Siguientes.size(); i++){
            Siguiente temp = Siguientes.get(i);
            String sig = "";
            if(temp.LS.isEmpty()){
                sig = "-";
            }else{
                for(int j = 0; j < temp.LS.size(); j++){
                sig += temp.LS.get(j) + " ";
                }
            }
            
                
            t += "|{"+ temp.hoja + "|" + temp.simbolo +  "|" + sig +"}";
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
            String ruta = "Reportes/SIGUIENTES_201909035/"+this.ID+".txt";
            String gname = "Reportes/SIGUIENTES_201909035/"+this.ID+".png";
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
