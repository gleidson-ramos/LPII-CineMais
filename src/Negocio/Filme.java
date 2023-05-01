package Negocio;


public class Filme{
    private String titulo, diretor, atorPrincipal, categoria;
    private int classificacaoEtaria, duracaoMinutos;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public void setAtorPrincipal(String atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public Filme(String titulo, String diretor, String atorPrincipal, int duracaoMinutos, int classificacaoEtaria, String categoria){
        this.titulo = titulo;
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.duracaoMinutos = duracaoMinutos;
        this.classificacaoEtaria = classificacaoEtaria;
        this.categoria = categoria;
    }
     
    public Filme(){}
    
}
