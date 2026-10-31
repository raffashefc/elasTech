package semana05_revisao.banco1;

public class MongoDb implements BancoDeDados {
    int numero;
    String pessoa;

    public void proibidoBarulhoAposDezHoras() {
        
    }

    @Override
    public String chamarBanco() {
        return pessoa;
    }

    public int getNumero() {
        return numero;
    }

}
