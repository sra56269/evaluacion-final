package grafos;

import java.util.HashSet;
import java.util.Set;


public class Grafo {

    private Set<Nodo> nodos = new HashSet<>();

    public void agregarNodo(Nodo nodeA) {
        this.nodos.add(nodeA);
    }

    public Set<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(Set<Nodo> nodos) {
        this.nodos = nodos;
    }

    
    public String toString() {
        return "Mapa de las tiendas [" + "NN: " + nodos + ']';
    }
}
