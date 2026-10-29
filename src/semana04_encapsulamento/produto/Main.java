package semana04_encapsulamento.produto;

public class Main {
    public static void main(String[] args) {
       Produto p = new Produto();
System.out.println(p.nome);
System.out.println(p.preco);
System.out.println(p.codigoInterno);   // erro de propósito
}

}