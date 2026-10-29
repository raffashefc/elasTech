### Padrão Singleton

Exercícios de Java sobre o padrão de projeto **Singleton**: uma classe que garante que exista **apenas um objeto** dela em todo o programa.

### Estrutura sugerida

```
src/
└── semana05_singleton/
    ├── ContadorVisitas.java
    ├── Carrinho.java
    ├── Main6.java
    └── Main7.java
```

### Como compilar e rodar

Na pasta raiz do projeto:

```bash
javac -d bin src/semana05_singleton/*.java
java -cp bin semana05_singleton.Main6
java -cp bin semana05_singleton.Main7
```

> Use uma `Main` por exercício e a linha `package` no topo de cada arquivo.

### O molde do Singleton

Três elementos, sempre os mesmos:

1. atributo `private static` do próprio tipo da classe;
2. construtor `private`;
3. método `public static getInstancia()` que cria o objeto só se ele ainda não existir e sempre devolve o mesmo.

```

---

### Parte 1: teoria

#### 1. O que o padrão Singleton garante?

**Resposta: b)** Que exista apenas um objeto da classe no programa.

#### 2. Por que o construtor de um Singleton é `private`?

Se o construtor fosse público, qualquer classe poderia dar `new` e criar quantos objetos quisesse. Sendo `private`, só a própria classe consegue criar o objeto, e ela controla isso dentro do `getInstancia()`, criando uma única vez.

#### 3. Complete a lacuna

```java
private ______ Configuracao instancia;
```

**Resposta: c) `static`.** O atributo pertence à classe, e não a um objeto, então existe uma única cópia compartilhada por todo o programa. Também precisa ser `static` porque o `getInstancia()` (que é `static`) o utiliza.

#### 4. O que acontece com `new Configuracao()` fora da classe?

```java
Configuracao c = new Configuracao();
```

Erro de compilação:

```
error: Configuracao() has private access in Configuracao
```

O construtor privado impede a criação de objetos de fora da classe.

#### 5. Como obter o objeto de um Singleton chamado `Configuracao`?

**Resposta: b)** `Configuracao.getInstancia()`. É um método `static`, chamado pela classe, sem precisar de objeto.

---

### Parte 2: prática

#### 6. `ContadorVisitas`

**Pedido:** Singleton com atributo `total` (começa em 0), `registrarVisita()` que soma 1 e `getTotal()`. No `main`, obter o objeto em duas variáveis (`pagina1` e `pagina2`), registrar visitas pelas duas e imprimir o total.

```

**Saída:**

```
Total de visitas: 3
```

Duas visitas por `pagina1` e uma por `pagina2` somam 3, porque as duas variáveis apontam para o **mesmo objeto**. Para conferir, imprima `pagina1 == pagina2`, que dá `true`.

#### 7. `Carrinho`

**Pedido:** Singleton com atributo `quantidadeItens` (começa em 0), `adicionarItem()` e `getQuantidadeItens()`. No `main`, obter o carrinho em `telaProdutos` e `telaPromocoes`, adicionar itens pelas duas e imprimir a quantidade final.

**Saída:**

```
Itens no carrinho: 4
```

---

### Resumo

| Conceito | Para que serve |
|---|---|
| construtor `private` | impede `new` fora da classe |
| atributo `private static` | guarda a única instância, compartilhada por todo o programa |
| `getInstancia()` | cria o objeto na primeira chamada e devolve sempre o mesmo |
| `if (instancia == null)` | garante que o objeto seja criado uma única vez |

**Quando usar:** configurações globais, contadores compartilhados, carrinho de compras, conexão com banco de dados, ou qualquer recurso que precise ser único e acessível de vários lugares.