package aula25_grafos;

public class Aula25_grafos {
    
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Jato");
        grafo.adicionarVertice("Gato");
        grafo.adicionarVertice("Gado");
        grafo.adicionarVertice("Fim");
        grafo.adicionarVertice("I");
        
        grafo.adicionarAresta(2.0, "Jato", "Gato");
        grafo.adicionarAresta(3.0, "Gato", "Fim");
        grafo.adicionarAresta(1.0, "Fim", "Gado");
        grafo.adicionarAresta(1.0, "Jato", "Gado");
        grafo.adicionarAresta(3.0, "I", "Jato");
        grafo.adicionarAresta(2.0, "I", "Gato");
        
        
        grafo.buscaEmLargura();
    }
    
}
