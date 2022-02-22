package Aplicacion;

public class Errores {
    public String clase;    //Sirve para definir si se trata de un error dde sintaxis o léxico
    public String contenido;    //Almacena el objeto que dio error
    public int fila;            //Fila dónde se encontro el error
    public int columna;         //Columna donde se encontro el error

    public Errores(String _clase, String _contenido, int _fila, int _columna){
        this.clase = _clase;
        this.contenido = _contenido;
        this.fila = _fila;
        this.columna = _columna;
    }
}
