package observer.estoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<ObservadorEstoque> observadores = new ArrayList<>();
    private int quantidade;

    public void adicionarObservador(ObservadorEstoque o) {
        this.observadores.add(o);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ObservadorEstoque obs : observadores) {
            obs.atualizar(quantidade);
        }
    }
}