### Exercício: Builder (refatoração da atividade de Construtor)

### Objetivo

Refatorar a classe `Agendamento` (pet shop), que usava um construtor com 8 parâmetros, para usar o padrão de projeto **Builder**.

### O problema do construtor

```java
new Agendamento("Luna", "tosa", "10h", false, false, false, "", 0.0);
```

- Não dá para saber o que cada `false` significa.
- Três booleanos seguidos: é fácil trocar a ordem sem o compilador avisar.
- É obrigatório passar valores vazios (`""` e `0.0`) mesmo quando não são usados.

### A solução com Builder

```java
Agendamento ag = Agendamento.builder()
        .nomePet("Thor")
        .servico("banho")
        .horario("14h")
        .perfume(true)
        .laco(true)
        .observacao("alérgico a shampoo")
        .desconto(0.10)
        .build();
```

- Cada valor tem um nome, então o código se explica sozinho.
- Só se informa o que importa; o resto usa valores padrão.
- A ordem dos campos deixa de importar.

### Como foi feito (Builder manual)

1. Os campos da classe viraram `private final` (objeto imutável).
2. O construtor da classe passou a ser `private` e recebe o `Builder`.
3. Foi criado o método estático `builder()`, que devolve um `new Builder()`.
4. Foi criada a classe interna estática `Builder`, com:
   - os mesmos campos da classe, com valores padrão (`false`, `""`, `0.0`);
   - um método para cada campo, que guarda o valor e devolve `this` (isso permite encadear as chamadas);
   - o método `build()`, que valida os campos obrigatórios e cria o objeto.

### Estrutura básica

```java
public class Pizza {
    private final String sabor;

    private Pizza(Builder b) {
        this.sabor = b.sabor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String sabor;

        public Builder sabor(String sabor) {
            this.sabor = sabor;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
```

### Como rodar

De dentro da pasta `elasTech`:

```
javac -d bin src/semana05_builder/*.java
java -cp bin semana05_builder.Main
```

### Erros que apareceram no caminho

| Erro | Causa | Solução |
|---|---|---|
| `cannot find symbol: method builder()` | A classe não tinha o método estático `builder()` | Criar `builder()` dentro da classe |
| `class, interface, enum, or record expected` | O método `builder()` estava fora da classe | Mover o método para dentro da classe |

### Alternativa com Lombok

Com Lombok, a classe interna `Builder` inteira é substituída pela anotação `@Builder`. Os valores padrão usam `@Builder.Default`. Exige o `lombok.jar` no projeto e compilar com o processador de anotações.

### O que foi aprendido

- Builder deixa a criação de objetos com muitos parâmetros mais legível e segura.
- Retornar `this` em cada método permite encadear chamadas.
- O construtor privado garante que o objeto só seja criado pelo Builder.
- A validação pode ficar centralizada no `build()`.