package petshop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;

    String definirPorte() {
        if( peso < 10 ){
            porte = "Pequeno";
        } else if( peso >= 10 && peso <= 25 ){
            porte = "Médio";
        } else {
            porte = "Grande";
        }
        return porte;
    }

    public void emitirSom(){
        System.out.println(nome + " está emitindo som...");
    }
   

    
}
