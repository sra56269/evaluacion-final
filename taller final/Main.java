package grafos;


public class Main {

    public static void main(String[] args) {

        Nodo Fuente = new Nodo("NN");
        Nodo entregaB = new Nodo("Pedro");
        Nodo entregaC = new Nodo("Sebastian");
        Nodo entregaD = new Nodo("Carolina");
        Nodo entregaE = new Nodo("Yudy");
        Nodo entregaF = new Nodo("Chingal");

        Fuente.agregarDestino(entregaB, 6);
        Fuente.agregarDestino(entregaC, 10);

        entregaB.agregarDestino(entregaE, 1);
        entregaB.agregarDestino(entregaD, 7);

        entregaC.agregarDestino(entregaD, 8);

        entregaD.agregarDestino(entregaF, 4);

        entregaE.agregarDestino(entregaF, 3);
        entregaE.agregarDestino(entregaD, 2);

        Grafo graph = new Grafo();

        graph.agregarNodo(Fuente);
        graph.agregarNodo(entregaB);
        graph.agregarNodo(entregaC);
        graph.agregarNodo(entregaD);
        graph.agregarNodo(entregaE);
        graph.agregarNodo(entregaF);

        System.out.println(graph.toString());

        graph = Dijkstra.calcularRutaMasCortaDesdeFuente(graph, Fuente);

        System.out.println(graph.toString());
    }
}
