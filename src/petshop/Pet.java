package petshop;

// Crie um método definirPorte dentro da classe Pet que olha o peso do próprio pet e devolve o porte. Como o método está dentro da classe, ele enxerga os atributos direto. Não precisa receber nada.
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
   

    
}
