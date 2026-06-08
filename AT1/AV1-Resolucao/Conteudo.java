package AT1.AV1-Resolucao;

public abstract class Conteudo implements Reproduzivel{
    private String titulo;
    private String genero;
    private int classificacao;
    private String plano;

    public Conteudo(String titulo, String genero, String plano){
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = 0;
        this.plano = plano;
    }

    public String getTitulo(){return titulo;}
    public void setTitulo(String titulo){ this.titulo = titulo;}

    public String getGenero(){return genero;}
    public void setGenero(String genero){this.genero = genero;}

    public int getClassificacao(){return classificacao;}
    public void setClassificacao(int idade){
        // Validação: Garante que o valor esteja no intervalo permitido
        if (idade >= 0 && idade <= 18) {
            this.classificacao = idade;
        } else {
            System.out.println("Erro: Classificação inválida. Use valores entre 0 e 18.");
        }
    }
}
