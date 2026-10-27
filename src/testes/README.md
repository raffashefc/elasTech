### 1. (Cenário Real)
Resposta Correta: B) O teste apita Vermelho imediatamente na máquina da programadora antes de o bug ir para o cliente (evitando regressão).

Explicação: A principal função do teste unitário nesse cenário é identificar que uma alteração recente quebrou um comportamento antigo (regressão), permitindo a correção antes da publicação do código.

### 2. Pirâmide de Testes
Resposta Correta: C) Porque eles testam pequenas partes isoladas do código, rodando em milissegundos e sendo muito mais baratos e fáceis de manter.

Explicação: Os testes unitários ficam na base por serem ultrarrápidos, independentes de infraestrutura externa (como banco de dados) e fáceis de executar continuamente no ciclo de desenvolvimento.

### 3. Padrão AAA - Etapa "Assert"
Resposta Correta: B) Usamos os comandos do JUnit (como assertEquals ou assertTrue) para verificar se o resultado obtido bateu com o esperado pois a etapa Assert (Afirmação) valida se a saída gerada na etapa Act corresponde estritamente ao comportamento esperado.

### 4. Validação de Exceções no JUnit 5
Resposta Correta: D) assertThrows(IllegalArgumentException.class, () -> conta.sacar(-50.0)) pois o assertThrows recebe a classe da exceção esperada e uma expressão Lambda com o código que deve disparar esse erro.

#### 5. Ciclo TDD - Etapa "GREEN"
Resposta Correta: B) Escrever o código mais simples e direto possível na classe principal apenas para fazer o teste passar e ficar verde pois no TDD, a fase GREEN busca a solução mínima necessária para validar a regra descrita no teste, adiando otimizações para a fase de refatoração.

### 6. Perguntas 
1) Por que "teste no olho" com System.out.println() não funciona em projetos grandes?

-Invasivo e Manual: Exige execução humana e verificação visual constante de logs.
-Inescalável: Em projetos com milhares de regras, verificar println torna-se inviável.
-Não Automatizável: Impedido de ser integrado em esteiras de integração contínua (CI/CD) para bloquear deploys com erros automaticamente.

2) Qual anotação a colega esqueceu de colocar em cima do método de teste?
Ela esqueceu a anotação @Test (do pacote org.junit.jupiter.api.Test). Sem essa anotação, o runner do JUnit não reconhece o método como uma suíte de teste e o ignora.

3) Por que o Refactor só deve ser feito após o teste ficar Verde?
Porque o teste Verde serve como uma rede de segurança. Com os testes passando, qualquer alteração na estrutura do código pode ser feita com a garantia de que, se algo for quebrado durante a limpeza/simplificação, os testes avisarão imediatamente.