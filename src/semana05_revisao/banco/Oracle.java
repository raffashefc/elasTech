package semana05_revisao.banco;

import semana05_revisao.banco1.BancoDeDados;

public class Oracle implements BancoDeDados {
    int numero;

    public Oracle(int numero) {
        this.numero = numero;
    }

    @Override
    public String chamarBanco() {
        return "O Banco conectado é o Oracle.";
    }

    @Override
    public int getNumero() {
        return this.numero;
    }
}