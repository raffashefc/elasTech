### Decorator (Açaiteria)

### Qual problema resolve

Uma açaiteria vende açaí com qualquer combinação de adicionais: granola, leite ninho, morango, paçoca. Criar uma classe para cada combinação (`AcaiComGranola`, `AcaiComGranolaEMorango`, `AcaiComMorangoEPacoca`...) faz o número de classes explodir. Com 4 adicionais já são 15 combinações, e cada adicional novo dobra esse número. O preço e a descrição de cada adicional também ficam repetidos em dezenas de classes, e mudar o preço da granola obrigaria a alterar todas as que a incluem.

O Decorator cria **uma classe para cada adicional** (`Granola`, `Morango`...) que "embrulha" um açaí. O adicional pega a descrição e o preço do açaí que está dentro e acrescenta os seus. As combinações são montadas no `main`, encaixando um adicional dentro do outro, sem criar classe nova.

### Ideia central

- Existe uma interface (`Acai`) e uma classe base (`AcaiSimples`).
- O `AcaiDecorator` **implementa `Acai`** e guarda um `Acai` dentro de si (`acaiEmbrulhado`).
- Cada adicional estende `AcaiDecorator` e, em cada método, chama o açaí embrulhado e acrescenta o seu.
- Como o decorator também é um `Acai`, um adicional pode ser colocado dentro de outro, quantas vezes quiser.

### Código

```java
public interface Acai {
    String getDescricao();
    double getPreco();
}

public class AcaiSimples implements Acai {
    public String getDescricao() {
        return "Açaí Simples";
    }

    public double getPreco() {
        return 12.00;
    }
}

public abstract class AcaiDecorator implements Acai {
    protected Acai acaiEmbrulhado;

    public AcaiDecorator(Acai acai) {
        this.acaiEmbrulhado = acai;
    }
}

public class Granola extends AcaiDecorator {
    public Granola(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Granola";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 3.00;
    }
}

public class Morango extends AcaiDecorator {
    public Morango(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Morango";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 4.00;
    }
}

public class Main {
    public static void main(String[] args) {

        // Açaí só com granola
        Acai acai1 = new Granola(new AcaiSimples());
        System.out.println(acai1.getDescricao());
        System.out.printf("Preço: R$ %.2f%n%n", acai1.getPreco());

        // Açaí com granola e morango (um embrulhando o outro)
        Acai acai2 = new Morango(new Granola(new AcaiSimples()));
        System.out.println(acai2.getDescricao());
        System.out.printf("Preço: R$ %.2f%n", acai2.getPreco());
    }
}
```

Os preços dos adicionais (R$ 3,00 e R$ 4,00) foram escolhidos para o exemplo.

Saída (o separador decimal pode sair como vírgula, dependendo da configuração do sistema):

```
Açaí Simples + Granola
Preço: R$ 15.00

Açaí Simples + Granola + Morango
Preço: R$ 19.00
```

### Como ler o aninhamento

`new Morango(new Granola(new AcaiSimples()))` se lê de dentro para fora: o `AcaiSimples` é embrulhado pela `Granola`, que é embrulhada pelo `Morango`. Ao chamar `getPreco()` no morango, ele pede o preço ao que está dentro (granola), que pede ao açaí simples: 12 + 3 + 4 = 19.

### Como rodar

De dentro de `elasTech`:

```
javac -d bin src/semana05_decorator/*.java
java -cp bin semana05_decorator.Main
```

### Resumo

| Pergunta | Resposta |
|---|---|
| O que o Decorator faz? | Acrescenta comportamento a um objeto embrulhando-o, sem criar uma classe por combinação |
| Por que `AcaiDecorator` implementa `Acai`? | Para que um adicional também conte como açaí e possa ir dentro de outro |
| Onde ficam as combinações? | No `main`, encaixando um decorator dentro do outro |
| O que muda ao criar um adicional novo? | Só uma classe nova (ex.: `Paçoca`) |

### Perguntas e respostas

###
1.**Por que criar uma classe para cada combinação é um problema? O que o Decorator faz no lugar?**

Criar uma classe por combinação faz o número de classes explodir (4 adicionais já geram 15 combinações, e cada novo dobra o total), além de repetir preço e descrição em muitas classes. O Decorator cria uma classe por adicional que embrulha um açaí, e as combinações são montadas no `main`, sem classe nova.

### 
2.**Por que a classe `AcaiDecorator` tem `implements Acai`?**

- a) Para poder ser criada com `new`
- **b) Para que um adicional também conte como açaí e possa ir dentro de outro adicional** ✅
- c) Para herdar o preço do açaí simples
- d) Para não precisar usar o `super`

**letra b**. Pois o decorator implementa `Acai`, um adicional também é um açaí e pode ser embrulhado por outro, o que permite empilhar quantos quiser.

### 
3.**No `main`, crie um açaí só com granola e outro com granola e morango, imprimindo descrição e preço.**

O código completo está na seção **Código** acima.