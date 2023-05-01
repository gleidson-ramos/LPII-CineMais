package Negocio;


public abstract class Salas{
    protected String descricaoEquipamentos, tipoSala;
    protected int numeroSala, capacidadeSala;
    protected Cinema cinema;
    protected double valor;

    public Salas(int numeroSala, int capacidadeSala, String tipoSala){
        this.numeroSala = numeroSala;
        this.capacidadeSala = capacidadeSala;
        this.tipoSala = tipoSala;
        this.valor = valor;
        this.descricaoEquipamentos = descricaoEquipamentos;
    }
    
    public Salas(){}
    
    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }
    
    public int getCapacidadeSala(){
        return this.capacidadeSala;
    }
    
    public int getNumeroSala(){
        return this.numeroSala;
    }
    
    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
    
    public String getDescricaoEquipamentos(){
        return this.descricaoEquipamentos;
    }
    
    public void setDescricaoEquipamentos(String descricaoEquipamentos) {
        this.descricaoEquipamentos = descricaoEquipamentos;
    }
    
    public void setCapacidadeSala(int capacidadeSala) {
        this.capacidadeSala = capacidadeSala;
    }
    
    public double calcularIngresso(Cinema cinema){
        valor = cinema.getValorIngresso();
        return valor;
    }
    
    public double calcularIngressoFDS(){
        valor = cinema.getValorIngressoFDS();
        return valor;
    }
    
    public double calcularMeia(){
        valor = cinema.getValorIngresso() / 2;
        return valor;
    }
    
    public double calcularMeiaFDS(){
        valor = cinema.getValorIngressoFDS() / 2;
        return valor;
    }
    
}