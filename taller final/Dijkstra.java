package grafos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class Dijkstra {

    public static Grafo calcularRutaMasCortaDesdeFuente(Grafo graph, Nodo source) {
        source.setDistancia(0);

        Set<Nodo> settledNodes = new HashSet<>();
        Set<Nodo> unsettledNodes = new HashSet<>();

        unsettledNodes.add(source);

        while (!unsettledNodes.isEmpty()) {
            Nodo currentNode = getNodoMenorDistancia(unsettledNodes);
            unsettledNodes.remove(currentNode);
            currentNode.getNodosAdyacentes().entrySet().forEach((adjacencyPair) -> {
                Nodo adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calcularDistanciaMinima(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            });
            settledNodes.add(currentNode);
        }
        return graph;
    }

    private static Nodo getNodoMenorDistancia(Set< Nodo> unsettledNodes) {
        Nodo lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Nodo node : unsettledNodes) {
            int nodeDistance = node.getDistancia();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calcularDistanciaMinima(Nodo evaluationNode, Integer edgeWeigh, Nodo sourceNode) {
        Integer sourceDistance = sourceNode.getDistancia();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistancia()) {
            evaluationNode.setDistancia(sourceDistance + edgeWeigh);
            LinkedList<Nodo> shortestPath = new LinkedList<>(sourceNode.getCaminoCorto());
            shortestPath.add(sourceNode);
            evaluationNode.setCaminoCorto(shortestPath);
        }
    }

}
