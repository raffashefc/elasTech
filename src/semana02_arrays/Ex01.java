//1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

package semana02_arrays;

public class Ex01 {
    public static void main(String[] args) {
        String[] nomeAlunas = { "Brianna", "Bradock", "Shakira", "Lua", "Zoe" };
        System.out.println(nomeAlunas[0]);
        System.out.println(nomeAlunas[2]);
        System.out.println(nomeAlunas[nomeAlunas.length - 1]);
    }

}
