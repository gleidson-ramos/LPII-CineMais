package Negocio;


public class Sala3D extends Salas{
    private String descricaoEquipamentos;

    public Sala3D(int numeroSala, int capacidadeSala, String tipoSala, String descricaoEquipamentos){
        super(numeroSala, capacidadeSala, tipoSala);
        this.descricaoEquipamentos = descricaoEquipamentos;
        this.valor = valor;
    }
    
    public Sala3D(){};

    public String getDescricaoEquipamentos() {
        return descricaoEquipamentos;
    }

    public void setDescricaoEquipamentos(String descricaoEquipamentos) {
        this.descricaoEquipamentos = descricaoEquipamentos;
    }
    
    public double calcularIngresso(){
        valor =  cinema.getValorIngresso() * 1.2;
        return valor;
    }
    
    public double calcularIngressoFDS(){
        valor =  cinema.getValorIngressoFDS() * 1.2;
        return valor;
    }
    
    public double calcularMeia(){
        valor =  (cinema.getValorIngresso() * 1.2) / 2;
        return valor / 2;
    }
    
    public double calcularMeiaFDS(){
        valor =  (cinema.getValorIngressoFDS() * 1.2) / 2;
        return valor;
    }
    
}
