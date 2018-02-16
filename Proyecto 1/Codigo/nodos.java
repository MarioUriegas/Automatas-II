package arbolB;

public class nodos {
    private String dato;
    private nodos izq;
    private nodos der;
    
    public nodos(String dato){
        this.dato = dato;
    }
    
    public nodos getNodoIzquierdo(){
        return izq;
    }
    
    public nodos getNodoDerecho(){
        return der;
    }
    
    public void setNodoIzquierdo(nodos nodo){
        izq = nodo;
    }
    
    public void setNodoDerecho(nodos nodo){
        der = nodo;
    }
    
    public String getDato(){
        return dato;
    }
}
