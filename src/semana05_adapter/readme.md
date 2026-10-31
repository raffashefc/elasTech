### Adapter

### Qual problema resolve

O sistema precisa usar uma classe de outra empresa, mas ela não implementa a interface do sistema. Não dá para escrever `implements` nela porque o código não pode (ou não deve) ser alterado.

A solução é criar uma classe nova, o **adapter**, que implementa a interface do sistema e guarda dentro de si um objeto da classe de fora. Quando o sistema chama o método da interface, o adapter repassa a chamada para a classe de fora.

### Ideia central

- O adapter implementa a **interface do seu sistema** (`Pagamento`).
- O adapter recebe a classe de fora (`PayPalAPI`) por atributo.
- A **tradução** (por exemplo, converter dólar para real) fica no método implementado da interface, dentro do adapter.

### Código

```java
public interface Pagamento {
    void pagar();
}

// Classe da outra empresa, não pode ser alterada
public class PayPalAPI {
    public void sendPayment() {
        System.out.println("Pagamento enviado pelo PayPal.");
    }
}

public class PayPalAdapter implements Pagamento {
    private PayPalAPI payPal;

    public PayPalAdapter(PayPalAPI payPal) {
        this.payPal = payPal;
    }

    @Override
    public void pagar() {
        payPal.sendPayment();
    }
}

public class Main {
    public static void main(String[] args) {
        // Não compila: PayPalAPI não implementa Pagamento
        // Pagamento p = new PayPalAPI();

        Pagamento pagamento = new PayPalAdapter(new PayPalAPI());
        pagamento.pagar();
    }
}
```

Saída:

```
Pagamento enviado pelo PayPal.
```

### Como rodar

De dentro de `elasTech`:

```
javac -d bin src/semana05_adapter/*.java
java -cp bin semana05_adapter.Main
```

### Resumo

| Pergunta | Resposta |
|---|---|
| O que o Adapter faz? | Faz uma classe incompatível funcionar como a interface do sistema |
| Quem implementa a interface? | O adapter, não a classe de fora |
| Onde fica a tradução? | No método implementado, dentro do adapter |

### Perguntas e respostas

#### Questão 4
**Seu sistema precisa usar uma classe de pagamento de outra empresa, mas ela não implementa a sua interface. Por que não dá para simplesmente escrever `implements` na classe dela? O que você faz no lugar?**

Não dá para escrever `implements Pagamento` na classe `PayPalAPI` porque ela pertence a outra empresa: você não pode (ou não deve) alterar o código dela. No lugar, você cria uma classe nova, o **adapter**, que implementa a sua interface e guarda dentro de si um objeto da classe de fora. Quando o sistema chama o método da sua interface, o adapter repassa a chamada para o método da classe de fora.

#### Questão 5
**Em um Adapter, onde fica a tradução (por exemplo, a conversão de dólar para real)?**

- a) Na classe de fora
- b) Na interface
- **c) No método implementado da interface, dentro do adapter** ✅
- d) No `main`, antes de chamar o método

Resposta: **letra c**. A tradução fica no método implementado da interface, dentro do adapter.

#### Questão 6 (prática)
**Crie a classe `PayPalAdapter` para que o sistema consiga usar o PayPal como um `Pagamento`. No `main`, escreva como comentário a linha que não compila e crie uma variável do tipo `Pagamento` usando o adapter, chamando `pagar()`.**

Resposta: o código completo está na seção **Código** acima.