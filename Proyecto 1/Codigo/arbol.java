package arbolB;

public class arbol {

    
    public static void main(String[] args) {
       nodos raiz = new nodos("1");
       nodos nodo2 = new nodos("2");
       nodos nodo3 = new nodos("3");
       nodos nodo5 = new nodos("5");
       
       raiz.setNodoIzquierdo(nodo2);
       raiz.setNodoDerecho(nodo3);
       nodo2.setNodoIzquierdo(new nodos("4"));
       nodo2.setNodoDerecho(new nodos("5"));
       nodo3.setNodoIzquierdo(new nodos("6"));
       nodo3.setNodoDerecho(new nodos("7"));
       nodo5.setNodoIzquierdo(new nodos("8"));
       nodo5.setNodoDerecho(new nodos ("9"));
       
        System.out.println("Preorden");
        preOrden(raiz);
        System.out.println("PostOrden");
        postOrden(raiz);
        System.out.println("InOrden");
        inOrden(raiz);
    }
    
    private static void preOrden(nodos raiz){
        if(raiz != null){
            System.out.print(raiz.getDato()+" - ");
            preOrden(raiz.getNodoIzquierdo());
            preOrden(raiz.getNodoDerecho());
        }
    }
    
    private static void postOrden(nodos raiz){
        if(raiz != null){
            postOrden(raiz.getNodoIzquierdo());
            postOrden(raiz.getNodoDerecho());
            System.out.print(raiz.getDato()+" - ");
        }
    }
    private static void inOrden(nodos raiz){
        if(raiz != null){
            inOrden(raiz.getNodoIzquierdo());
            System.out.print(raiz.getDato()+" - ");
            inOrden(raiz.getNodoDerecho());
        }
    }
}
