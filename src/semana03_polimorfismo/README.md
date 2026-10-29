### 
2-Por que o System.out.println() aceita texto, número, boolean e objeto?

Porque o println é sobrecarregado: existe um println para cada tipo (String, int, boolean, double, Object...). O Java escolhe a versão certa pelo tipo do argumento, exatamente como no Painel.

###
4- A estagiária imprime a apresentação da Pessoa (Oi, eu sou Bia e tenho 22 anos.). Como Estagiaria não sobrescreve o apresentar(), o Java usa o método herdado da mãe.

###
5- Static void mostrarFicha(Pessoa p) na Main, chamado com a aluna, a professora e a estagiária.

Funciona para as três porque todas são Pessoa. Em tempo de execução, o Java chama o apresentar() do objeto real. Isso é polimorfismo.

###
6- Interface MeioDePagamento com pagar(double valor), implementada por Pix e Boleto, usando uma única variável do tipo da interface.

A mesma linha forma.pagar(150.00) se comporta de forma diferente conforme o objeto guardado. Os métodos implementados precisam ser public. Amanhã dá para criar Cartao sem mudar o código que usa a interface.

###
7- trocar o apresentar() da Professora por apresentar(String cargo) sem @Override.

Perguntas: o que a professora imprime? Deu erro?

Sem @Override: não dá erro. Imprime a versão da Pessoa (Oi, eu sou Flora e tenho 30 anos.), porque mudar os parâmetros cria uma sobrecarga, não uma sobrescrita. A chamada apresentar() sem argumentos usa o método herdado.
Com @Override: o compilador dá erro (method does not override or implement a method from a supertype).

Lição: o @Override faz o compilador conferir se você realmente está sobrescrevendo. Sem ele, um erro na assinatura vira um bug silencioso.