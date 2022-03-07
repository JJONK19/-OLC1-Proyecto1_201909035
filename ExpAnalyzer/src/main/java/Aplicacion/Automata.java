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
public class Automata {
    public String ID;
    public ArrayList<Estado> est;
    public Estado cabecera;
    
    public Automata(String _id, ArrayList<Estado> tab, Estado inicio ){
        ID = _id;
        est = tab;    
        cabecera = inicio;
    }
    
    //Validacion de cadenas 
    public boolean validar(String entrada){
        Estado tran = cabecera;             //Se va a encargar de guardar el estado temporal
        int ban = 0;
        entrada = entrada.substring(1, entrada.length()-1 );
        boolean val = false;
        
        for(int i = 0; i < entrada.length(); i++){
            String tempchar = Character.toString(entrada.charAt(i));
            if(tempchar.equals("\\")){
                if(Character.toString(entrada.charAt(i+1)).equals("n")  ||  Character.toString(entrada.charAt(i+1)).equals("'") || Character.toString(entrada.charAt(i+1)).equals("\"")){
                    tempchar = Character.toString(entrada.charAt(i+1));
                    i = i + 1;
                }
            }
            
            for(int j = 0; j < tran.tr.size(); j++){
                Transicion tr  = tran.tr.get(j);
                if(tr.car.contains(tempchar)){
                    tran = tr.next;
                    ban = 1;
                    break;
                }
            }
            
            if(i == (entrada.length() - 1)){
                if(ban == 1){
                    if(tran.aceptar){
                        val = true;
                    }
                }else{
                    break;   
                }
                
            }else{
                if(ban == 1){
                    ban = 0;
                }else{
                    break;   
                }
            }
            
        }
        return val;
    }
    
    
    //Metodos de Graficación
    //--------------------------------------------------------------------------
    
    //Unifica el texto que va en el grafo
    public String getcodigo(){
        String t = "digraph G\n" +"{\n" + "rankdir=LR";
        //Asignación de nombres, ID, y nodo
        for(int i = 0; i < this.est.size(); i++){
            Estado temp = est.get(i);
            temp.ID = "\""+UUID.randomUUID().toString() + "\"";
            
            if(temp.aceptar){
                t += temp.ID + "[ label=\""+ temp.nombre + "\" shape=doublecircle];\n";
            }else{
                t += temp.ID + "[ label=\""+ temp.nombre + "\" shape=circle];\n";
            }
        }
        
        //Conexión de Nodos
        for(int i = 0; i < this.est.size(); i++){
            Estado temp = est.get(i);
            //Conexion a Hijos
            String nombre = temp.ID;
            if(temp.tr.isEmpty()){
                    
            }else{
                for(int j = 0; j < temp.tr.size(); j++){
                    Transicion tran = temp.tr.get(j);
                    String Trans = "( ";
                    for(int l = 0; l < tran.car.size(); l++){
                        Trans += tran.car.get(l) + " ";
                    }        
                    Trans += ")";
                    String tranom = tran.next.ID;
                    t += nombre + "->" + tranom + "[minlen=2 label = \"" + Trans + "\"];\n";
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
            String ruta = "Reportes/AFD_201909035/"+this.ID+".txt";
            String gname = "Reportes/AFD_201909035/"+this.ID+".png";
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
