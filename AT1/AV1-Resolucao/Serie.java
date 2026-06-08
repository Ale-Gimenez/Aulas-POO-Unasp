package AT1.AV1-Resolucao;

public class Serie extends Conteudo{
    private int numeroTemporadas;

    public Serie(String titulo, String genero, int classificacao, String plano, int numeroTemporadas){
        super(titulo, genero, classificacao, plano);
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroTemporadas(){return numeroTemporadas;}
    public void setNumeroTemporadas(int numeroTemporadas){this.numeroTemporadas = numeroTemporadas;}

    @Override
    public void reproduzir(int idadeUsuario, String planoUsuario){
        if (planoUsuario == "Plus") {
            System.out.println("Reproduzindo "+ getTitulo() +"...");
        }else{
            System.out.println("Acesso negado: Conteúdo não permitido para seu plano.");
        }
    }
}
