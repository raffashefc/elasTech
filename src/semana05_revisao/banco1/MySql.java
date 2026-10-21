package semana05_revisao.banco1;

public class MySql implements BancoDeDados {
    int numero;

    public MySql(int numero) {
        this.numero = numero;
    }

    @Override
    public String chamarBanco() {
        return "O Banco conectado é o MySql.";
    }

    @Override
    public int getNumero() {
        return this.numero;
    }
}