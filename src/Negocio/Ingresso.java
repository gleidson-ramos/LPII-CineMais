package Negocio;

public class Ingresso{
    private String filme, horario, data, tipoSala, tipoIngresso, status;
    private int sala;
    private Sessao sessao;
    
    public Ingresso(String filme, String horario, String data, int sala, String tipoSala, String tipoIngresso, String status){
        this.filme = filme;
        this.horario = horario;
        this.data = data;
        this.sala = sala;
        this.tipoSala = tipoSala;
        this.status = status;
        this.tipoIngresso = tipoIngresso;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
    
    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }    

}