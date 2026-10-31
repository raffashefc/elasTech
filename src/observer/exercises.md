###
1)
O Observer resolve o problema do acoplamento forte e do polling (a checagem constante e ineficiente por atualizações). Sem o Observer, os interessados em uma informação precisariam ficar perguntando repetidamente ao objeto principal se o seu estado mudou ("O produto chegou?", "O vídeo saiu?").

Ex: Previsão do tempo: quando a temperatura ou o alerta meteorológico muda, os aplicativos inscritos na fonte de dados atualizam as informações.

No Observer, o que é o Subject e o que é o Observer? Como a comunicação ocorre sem conhecer as classes concretas?
Subject (Sujeito / Observable): É o objeto possuidor dos dados ou do estado principal (ex: Canal). Ele mantém uma lista de interessados e métodos para inscrever, desinscrever e notificar esses interessados.

Observer (Observador): É qualquer objeto interessado em reagir às mudanças do Sujeito (ex: Seguidor).

Como avisa sem conhecer classes concretas: Através da abstração (Interfaces) e do Polimorfismo. O Sujeito guarda uma lista do tipo da interface (ex: List<Inscrito>). Quando o estado muda, ele percorre a lista chamando o método receberNotificacao(). Para o Sujeito, não importa se quem está escutando é um Seguidor, uma Empresa ou um Bot — desde que todos implementem a interface Inscrito.


###
2) 
Análise de Cenário (Pedido e Entregador)
Se você precisar adicionar um novo interessado (ex: Entregador), o que é preciso alterar na classe Pedido? Por quê?
Não é preciso alterar nada na classe Pedido.

Por quê: A classe Pedido interage exclusivamente com a interface do observador (ex: ObservadorPedido). Como a classe Entregador implementará essa mesma interface, ela pode ser adicionada à lista de observadores do Pedido em tempo de execução sem modificar uma única linha de código da classe Pedido. Isso atende ao princípio Open/Closed (SOLID): o código fica aberto para extensão, mas fechado para modificação