package Negocio;


import java.util.*;

public class Sessao{
    private Filme filme;
    private Salas sala;
    private String horarioSessao, data;
    private int capacidadeSessao;

   
    public Sessao(){}

    public Sessao(String horarioSessao, int capacidadeSessao, String data, Salas sala, Filme filme){
        this.horarioSessao = horarioSessao;
        this.capacidadeSessao = capacidadeSessao;
        this.sala = sala;
        this.filme = filme;
        this.data = data;
    }
           
    public String getHorarioSessao(){
        return this.horarioSessao;
    }
    
    public void setHorarioSessao(String horarioSessao) {
        this.horarioSessao = horarioSessao;
    }
    
    public String getData(){
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public Filme getFilme(){
        return filme;
    }
    
    public void setFilme (Filme filme) {
        this.filme = filme;
    }
    
    public Salas getSalas(){
        return sala;
    }
    
    public void setSalas (Salas sala) {
        this.sala = sala;
    }
    
    public int getCapacidadeSessao(){
        return this.capacidadeSessao;
    }
    
    public void setCapacidadeSessao(int capacidadeSessao) {
        this.capacidadeSessao = capacidadeSessao;
    }
    
}
