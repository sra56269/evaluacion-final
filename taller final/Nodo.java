package grafos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Nodo {

    private String nombre;

    private List<Nodo> caminoCorto = new LinkedList<>();

    private Integer distancia = Integer.MAX_VALUE;

    Map<Nodo, Integer> nodosAdyacentes = new HashMap<>();

    public void agregarDestino(Nodo destination, int distance) {
        nodosAdyacentes.put(destination, distance);
    }

    public Nodo(String name) {
        this.nombre = name;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Nodo> getCaminoCorto() {
        return caminoCorto;
    }

    public void setCaminoCorto(List<Nodo> caminoCorto) {
        this.caminoCorto = caminoCorto;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Map<Nodo, Integer> getNodosAdyacentes() {
        return nodosAdyacentes;
    }

    public void setNodosAdyacentes(Map<Nodo, Integer> nodosAdyacentes) {
        this.nodosAdyacentes = nodosAdyacentes;
    }

   
    public String toString() {
        return "\n Desde NN a la tienda de [" + nombre + ", Distancia minima recorrida: " + distancia + ']';
    }
}
