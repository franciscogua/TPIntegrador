import java.util.List;

public class Ronda {

    //Atributos
    String nroRonda;
    List<Partido> partidos;  // Que les parece que usemos listas en vez de array aqui?

    //Getters y Setters
    public String getNroRonda() {
        return nroRonda;
    }

    public void setNroRonda(String nroRonda) {
        this.nroRonda = nroRonda;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }
}
