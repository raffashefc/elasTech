## 🐾 PetShop 

Um sistema de gerenciamento de petshop em linha de comando (CLI) desenvolvido em Java, simula o cadastro de pets com diferentes espécies, controle de filas de atendimento, execução de serviços especializados e exibição de fichas detalhadas,
focado na aplicação prática de Princípios SOLID, Padrões de Projeto, Herança, Polimorfismo, Coleções e revisão de conteúdos abordados na semana 1 a 4

### Conceitos Aplicados

O projeto foi construído e refatorado aplicando conceitos fundamentais da programação orientada a objetos e design de software:

Herança (Inheritance): A classe Pet atua como superclasse (mãe) contendo atributos e comportamentos comuns, enquanto Cachorro e Gato herdam essas características como subclasses.

Polimorfismo: O método emitirSom() é definido na classe mãe e sobrescrito (@Override) nas filhas. O sistema trata todos os animais de forma genérica como Pet, mas executa o comportamento específico de cada espécie em tempo de execução.

Sobrecarga de Métodos (Method Overloading): Implementação de múltiplos métodos com o mesmo nome (exibir) na classe PetShop, diferenciados por suas assinaturas (quantidade e tipos de parâmetros) para mostrar dados resumidos ou fichas completas.

Interfaces e Padrões de Projeto (Strategy Pattern): Utilização de uma interface Servico para desacoplar a execução de operações como Banho, Tosa e Consulta.

Estruturas de Dados e Coleções: Uso de ArrayList para listagens dinâmicas, HashSet para garantir unicidade e ArrayDeque para gerenciar a fila de atendimento dos pets.

Princípios SOLID: Foco especial no Princípio da Responsabilidade Única (SRP), identificando o crescimento da classe de interface (PetCli) e planejando a delegação de responsabilidades para classes de ação especializadas.

### Principais Aprendizados

Poder do Polimorfismo: Descobrir como coleções genéricas (como uma lista de Pet) conseguem invocar comportamentos específicos (emitirSom()) sem a necessidade de múltiplos blocos if/else ou verificações de tipo (instanceof).

Código Limpo e Manutenibilidade: Compreender que o crescimento natural de uma aplicação exige refatorações constantes para evitar classes infladas e acoplamento excessivo.

Testabilidade e Histórico: A importância de manter blocos de teste comentados ou estruturados para validar conceitos isolados (como a sobrecarga de métodos) antes de integrá-los ao fluxo principal da CLI.

### Como Executar o Projeto

Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.

Clone este repositório:
```bash
git clone https://github.com/raffashefc/elasTech/src/petshop.git
```

Abra o projeto em sua IDE (IntelliJ IDEA, Eclipse ou VS Code).

Compile e execute a classe principal PetShop.java (localizada no pacote petshop).