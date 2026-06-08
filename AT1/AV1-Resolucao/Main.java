package AT1.AV1-Resolucao;

public class Main {
    public static void main(String[] args){
        Filme filme1 = new Filme("O Poderoso Chefão", "Animação", 18, "Básico", 180);

        Serie serie1 = new Serie("Bluey", "Infantil", 0, "Plus", 2);

        filme1.reproduzir(15, "Básico");

        serie1.reproduzir(10, "Básico");
        serie1.reproduzir(10, "Plus");
    }
}
