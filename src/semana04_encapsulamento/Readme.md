####Semana 04: Encapsulamento e Modificadores de Acesso

Exercícios de Java sobre encapsulamento: esconder os atributos (`private`) e liberar o acesso de forma controlada por getters, setters e métodos públicos.

####Estrutura

```
src/
└── semana04_encapsulamento/
    ├── ContaBancaria.java
    ├── Produto.java
    └── Main.java
```

####Como compilar e rodar

Na pasta raiz do projeto:

```bash
javac -d bin src/semana04_encapsulamento/*.java
java -cp bin semana04_encapsulamento.Main
```

> Nas questões 1, 4, 5 e 6 há linhas que dão erro **de propósito**. Escreva a linha, compile, leia a mensagem e depois comente ou apague a linha. Enquanto ela existir, o `javac` não gera nenhuma classe.

####Referência rápida

```java
class Coisa {
    private String atributo;          // fechado pra fora

    public String getAtributo() {     // getter: devolve
        return atributo;
    }

    public void setAtributo(String atributo) {   // setter: recebe
        this.atributo = atributo;     // this: qual é qual
    }
}
```

| Modificador | Mesma classe | Mesmo pacote | Outro pacote |
|---|---|---|---|
| `private` | sim | não | não |
| (default) | sim | sim | não |
| `public` | sim | sim | sim |

---

###Questão 1: sentir o `private`

**Objetivo:** ver o erro do compilador ao acessar atributos privados de fora da classe.

```java
public class ContaBancaria {
    private String titular;
    private double saldo;
}
```

Na `Main`, estas linhas **não compilam**:

```java
System.out.println(c.titular);
c.saldo = -5000;
```

**Erro:**

```
error: titular has private access in ContaBancaria
error: saldo has private access in ContaBancaria
```

**Lição:** a classe está fechada demais. As próximas questões abrem as portas, uma por uma.

---

###Questão 2: a porta de leitura (getters)

**Lição:** o objeto existe, mas está vazio. `null` e `0.0` são os valores padrão que o Java atribui a `String` e `double` quando se faz `new`.

---

###Questão 3: a porta de escrita, com porteiro

**Saída:**

```
Titular inválido! Mantido null
Titular: null
Titular: Ana
```

**Lição:**

- `this.titular` é o atributo; `titular` é o parâmetro.
- O `return` sozinho sai do método na hora.
- Na questão 1, `c.saldo = -5000` passava direto. Aqui o objeto confere antes de aceitar.

---

###Questão 4: métodos que fazem o trabalho sujo

Métodos **públicos** (a interface da classe) e **privados** (o maquinário interno):

**Saída:**

```
[LOG] Ana: deposito de 500.0
Saldo: 500.0
Valor inválido!
Saldo insuficiente!
[LOG] Ana: saque de 200.0
Saldo: 300.0
```

**Erro de propósito:** `c.registrarLog("teste");` na `Main` gera:

```
error: registrarLog(String) has private access in ContaBancaria
```

**Lição:** quem usa a classe vê só `depositar()` e `sacar()`. O resto fica escondido e nem aparece no autocompletar.

---

###Questão 5: os modificadores lado a lado

**Resultado:**

| Atributo | Modificador | Funcionou? |
|---|---|---|
| `nome` | default | sim |
| `preco` | public | sim |
| `codigoInterno` | private | não |

```
Caneta
5.5
error: codigoInterno has private access in Produto
```

**Lição:** no mesmo pacote, `default` e `public` se comportam igual. A diferença só aparece quando a classe que acessa está em **outro pacote**: aí o `nome` também seria bloqueado.

---

###Questão 6: nem todo atributo precisa de setter

Na `ContaBancaria`:

**Saída esperada:**

```
Numero da conta: 001-X
error: cannot find symbol
  symbol:   method setNumeroConta(String)
```

Na prática, como a compilação falha, só o erro aparece. Comente a linha do `setNumeroConta` para ver o `001-X` impresso.

**Lição:** getter e setter não são um par obrigatório. Número de conta, CPF e data de cadastro podem ser lidos, mas não devem mudar. Para garantir isso, basta não escrever o setter.

---

###Resumo

| Conceito | Para que serve |
|---|---|
| `private` | esconde o atributo ou método de quem está fora da classe |
| getter | libera a leitura de forma controlada |
| setter | libera a escrita, com validação ("porteiro") |
| método público | a interface da classe (`depositar`, `sacar`) |
| método privado | maquinário interno (`temSaldo`, `registrarLog`) |
| sem setter | torna o atributo somente leitura |
