package Negocio;

public class Cinema{
    private String nomeShopping, enderecoShopping;
    private double valorIngresso, valorIngressoFDS;
    
    public String getNomeShopping() {
        return nomeShopping;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
    
    public double getValorIngressoFDS() {
        return valorIngressoFDS;
    }

    public void setValorIngressoFDS(double valorIngressoFDS) {
        this.valorIngressoFDS = valorIngressoFDS;
    }

    public void setNomeShopping(String nomeShopping) {
        this.nomeShopping = nomeShopping;
    }
    
    public String getEnderecoShopping() {
        return enderecoShopping;
    }

    public void setEnderecoShopping(String enderecoShopping) {
        this.enderecoShopping = enderecoShopping;
    }
    
    public Cinema(){
        // inicializa variáveis de instância
    }
    
    public Cinema(String nomeShopping, String enderecoShopping, double valorIngresso, double valorIngressoFDS){
        this.nomeShopping = nomeShopping;
        this.enderecoShopping = enderecoShopping;
        this.valorIngresso = valorIngresso;
        this.valorIngressoFDS = valorIngressoFDS;
    }
    
   
}
