package semana03_forEach;
import java.util.ArrayList;

public class Ex02 {
    public static void main(String[] args){
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(5);
        notas.add(7);
        notas.add(9);
        notas.add(11);
        notas.add(13);

        for (int nota : notas) {
            System.out.println(nota);
        }
    }
}
