package semana05_revisao.banco1;

public class Main1 {

    public static void conectarBanco(BancoDeDados banco) {
        System.out.println(banco.chamarBanco());
        System.out.println("Número da conexão: " + banco.getNumero());
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        BancoDeDados meuMySql = new MySql(101);
        BancoDeDados meuOracle = new Oracle(202);

        conectarBanco(meuMySql);
        conectarBanco(meuOracle);
    }
}