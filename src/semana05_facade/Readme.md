### Facade

### Qual problema resolve

Para fazer uma tarefa simples, às vezes é preciso conhecer e coordenar várias classes, na ordem certa. Isso deixa o código que usa essas classes longo e acoplado.

Exemplo do condomínio: para resolver um problema, o morador teria que falar com o porteiro, a limpeza, a manutenção e o financeiro. Com o síndico, ele fala com uma só pessoa, e o síndico cuida do resto.

A **fachada** faz o papel do síndico: oferece um método simples que esconde o passo a passo de várias classes.

### Ideia central

- A fachada guarda as classes envolvidas em **atributos**.
- A fachada **não precisa implementar interface**.
- Usar a fachada não proíbe usar as outras classes diretamente. Ela só oferece um caminho mais simples.

### Código

```java
public class Despertador {
    public void desligar() {
        System.out.println("Despertador desligado.");
    }
}

public class Cafeteira {
    public void fazerCafe() {
        System.out.println("Café pronto.");
    }
}

public class Chuveiro {
    public void ligar() {
        System.out.println("Chuveiro ligado.");
    }
}

public class ManhaFacade {
    private Despertador despertador = new Despertador();
    private Cafeteira cafeteira = new Cafeteira();
    private Chuveiro chuveiro = new Chuveiro();

    public void acordar() {
        despertador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }
}

public class Main {
    public static void main(String[] args) {
        ManhaFacade manha = new ManhaFacade();
        manha.acordar();
    }
}
```

Saída:

```
Despertador desligado.
Café pronto.
Chuveiro ligado.
```

### Como rodar

De dentro de `elasTech`:

```
javac -d bin src/semana05_facade/*.java
java -cp bin semana05_facade.Main
```

### Resumo

| Pergunta | Resposta |
|---|---|
| O que o Facade faz? | Esconde a complexidade de várias classes atrás de um método simples |
| Precisa de interface? | Não |
| Guarda as outras classes? | Sim, em atributos |
| É proibido usar as outras classes direto? | Não |

## Perguntas e respostas

### Questão 7
**Explique com suas palavras qual problema o Facade resolve. Se quiser, use o exemplo do síndico do condomínio ou crie outro.**

O Facade resolve o problema de ter que conhecer e coordenar várias classes para fazer uma tarefa simples. No exemplo do condomínio, para resolver um problema o morador teria que falar com o porteiro, a limpeza, a manutenção e o financeiro, na ordem certa. Com o síndico, ele fala só com uma pessoa, e o síndico cuida do resto. A fachada faz o mesmo no código: oferece um método simples que esconde o passo a passo de várias classes.

### Questão 8
**Marque V (verdadeiro) ou F (falso):**

- ( **F** ) A fachada precisa implementar uma interface. *Não precisa, ela é só uma classe que reúne as outras.*
- ( **V** ) A fachada guarda as classes envolvidas no processo em atributos.
- ( **F** ) Depois que a fachada existe, é proibido usar as outras classes diretamente. *Não é proibido, a fachada só oferece um caminho mais simples.*

### Questão 9 (prática)
**Crie a classe `ManhaFacade` com um método `acordar()` que desligue o despertador, faça o café e ligue o chuveiro, nessa ordem. No `main`, use só a fachada.**

Resposta: o código completo está na seção **Código** acima.