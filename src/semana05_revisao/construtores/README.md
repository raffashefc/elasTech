###
1) Olhando só a linha do new, dá pra saber o que cada true/false significa?
Não, Olhando new Agendamento("Luna", "tosa", "10h", false, false, false, "", 0.0), é impossível saber de relance qual false se refere ao perfume,
qual é o laço ou qual é a hidratação. precisaria abrir a classe ou a assinatura do construtor para lembrar a ordem.

2) Se você trocar a ordem do perfume e do laço sem querer, o código compila? Alguém perceberia o erro?
Sim, o código compila perfeitamente, porque para o Java ambos são do tipo boolean. O compilador não vai apontar erro de nada. 
Mas, ninguém perceberia o erro de imediato, a não ser o cliente que pediu perfume e recebeu laço (ou vice-versa), gerando um bug silencioso e perigoso.

3) No agendamento b, quantos valores você digitou só pra dizer "não quero isso"?
Precisei digitar 4 "valores vazios/falsos" apenas para preencher o que não era usado: false, false, false, "" e 0.0 (contando com o desconto zero). 
Isso poluiu o código com o que é conhecido por padrões de preenchimento forçado.
