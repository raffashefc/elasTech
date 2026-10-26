package observer.voo;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private List<ObservadorVoo> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o) {
        this.observadores.add(o);
    }

    public void mudarStatus(String status) {
        for (ObservadorVoo obs : observadores) {
            obs.atualizar(status);
        }
    }
}