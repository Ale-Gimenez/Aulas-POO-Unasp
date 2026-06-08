package AT1.AV1-Resolucao;

public class Filme extends Conteudo{
    private int duracaoMinutos;

    public Filme(String titulo, String genero, int classificacao, String plano, int duracaoMinutos){
        super(titulo, genero, classificacao, plano);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos(){return duracaoMinutos;}
    public void setDuracaoMinutos(int duracaoMinutos){this.duracaoMinutos = duracaoMinutos;}

    @Override
    public void reproduzir(int idadeUsuario, String planoUsuario){
        if (idadeUsuario >= this.getClassificacao()) {
            System.out.println("Reproduzindo "+ getTitulo() + "...");
        } else {
            System.out.println("Acesso negado: Conteúdo não permitido para sua idade.");
        }
    }
}
