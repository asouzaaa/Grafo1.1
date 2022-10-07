package aula25_grafos;

public class Aresta<TIPO> {
    private Double peso;
    private Vertice<TIPO> jato;
    private Vertice<TIPO> gato;
    
    public Aresta(Double peso, Vertice<TIPO> jato, Vertice<TIPO> gato){
        this.peso = peso;
        this.jato = jato;
        this.gato = gato;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Vertice<TIPO> getJato() {
        return jato;
    }

    public void setJato(Vertice<TIPO> jato) {
        this.jato = jato;
    }

    public Vertice<TIPO> getGato() {
        return gato;
    }

    public void setGato(Vertice<TIPO> fim) {
        this.gato = gato;
    }
    
    
}
