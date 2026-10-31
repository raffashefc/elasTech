### Factory

### Qual problema resolve

Quando a decisão de "qual objeto criar" fica espalhada em vários `if`s pelo `main` e por outras partes do programa, cada tipo novo (por exemplo `Passaro`) obriga a procurar e alterar todos esses `if`s. Se um for esquecido, o programa quebra ou ignora o tipo novo.

O Factory concentra essa decisão em **um único lugar**: o resto do código só pede "me dá um animal do tipo X".

### Ideia central

- A fábrica tem um método que recebe um parâmetro (ex.: `"cachorro"`) e decide qual classe instanciar.
- O método devolve o **tipo da interface** (`Animal`), não o da classe concreta. Assim, quem usa a fábrica não conhece `Cachorro` nem `Gato`.
- O `main` não tem `new Cachorro()` nem `new Gato()`.

### Código

```java
public interface Animal {
    void emitirSom();
}

public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

public class AnimalFactory {
    public static Animal getAnimal(String tipo) {
        if (tipo.equalsIgnoreCase("cachorro")) {
            return new Cachorro();
        } else if (tipo.equalsIgnoreCase("gato")) {
            return new Gato();
        }
        throw new IllegalArgumentException("Tipo de animal desconhecido: " + tipo);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.getAnimal("cachorro");
        Animal a2 = AnimalFactory.getAnimal("gato");

        a1.emitirSom();
        a2.emitirSom();
    }
}
```

Saída:

```
Au au!
Miau!
```

### Como rodar

De dentro de `elasTech`:

```
javac -d bin src/semana05_factory/*.java
java -cp bin semana05_factory.Main
```

### Resumo

| Pergunta | Resposta |
|---|---|
| O que o Factory faz? | Centraliza a criação de objetos |
| O que a fábrica devolve? | O tipo da interface (`Animal`) |
| O que muda ao criar um tipo novo? | Só a fábrica (e a nova classe) |

### Perguntas e respostas

#### Questão 1
**Explique com suas palavras qual problema o Factory resolve. O que aconteceria se os `if`s que decidem qual objeto criar ficassem espalhados pelo `main` e por outras partes do programa, e depois surgisse um tipo novo?**

O Factory resolve o problema de espalhar a decisão de "qual objeto criar" pelo programa. Se os `if`s com `new Cachorro()` e `new Gato()` estivessem no `main` e em outras partes do código, um tipo novo (por exemplo `Passaro`) obrigaria a procurar cada um desses `if`s e alterar todos. Se esquecesse um, o programa quebraria ou ignoraria o tipo novo. Com a fábrica, a decisão fica em um único lugar: o resto do código só pede "me dá um animal do tipo X", e um tipo novo exige mexer só na fábrica.

#### Questão 2
**O método da fábrica normalmente devolve o objeto criado com qual tipo?**

- a) O tipo da classe concreta (ex.: `Cachorro`)
- **b) O tipo da interface (ex.: `Animal`)** ✅
- c) `String`
- d) Não devolve nada (`void`)

Resposta: **letra b**. A fábrica devolve o tipo da interface, então quem usa não precisa conhecer as classes concretas.

#### Questão 3 (prática)
**Implemente a interface, as classes e a `AnimalFactory`. No `main`, use a fábrica para criar um cachorro e um gato e chame `emitirSom()` nos dois, sem `new Cachorro()` nem `new Gato()`.**

Resposta: o código completo está na seção **Código** acima.