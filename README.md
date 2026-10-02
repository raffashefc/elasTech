# Acompanhamento de aulas e exercícios de Java 

## Semana 01 - String

### Exercícios

1. Faça um programa que solicite o nome completo do usuário e mostre quantos caracteres ele tem.
2. Faça um programa que solicite o nome completo do usuário e mostre a primeira letra do nome.
3. Faça um programa que solicite a frase e a palavra que deseja buscar e mostre se a palavra aparece na frase.
4. Faça um programa que solicite o nome completo do usuário e mostre se o nome é igual a outro nome.

### Conceitos   

1. String - tipo de dado que armazena uma sequência de caracteres. - por exemplo, nome, frase, palavra.
2. Concatenar - operação que combina duas ou mais strings. - por exemplo, para juntar duas palavras.
3. Comparar - operação que compara duas strings. - por exemplo, se a string A é maior que a string B.
4. Converter - operação que converte uma string em outra - por exemplo, para maiúsculas ou para minúsculas.

### Observação: 

- Para concatenar duas strings, use o operador "+".
- Para comparar duas strings, use o operador "==".
- Para converter uma string em outra, use o método toUpperCase() ou toLowerCase().

### Duvidas: 
Se string é imutavel , e se eu quiser criar uma constante no java?
Sim, string é imutavel, mas você pode criar uma constante com o comando final String nome = "Rafael";

Imutabilidade vs. Constante
A diferença entre o comportamento da String e o comportamento da constante é sutil, mas muito importante:
Conceito	O que significa?	No Java é feito por:
Imutabilidade	O conteúdo do objeto na memória não pode ser modificado.	É o comportamento padrão da classe String.
Constante	A variável (o link/ponteiro) não pode ser reatribuída para apontar para outro objeto.	Palavra-chave final.
• Sem final (Apenas String): Você pode fazer nome = "João"; e depois nome = "Maria";. O texto "João" não mudou na memória, mas a variável nome agora aponta para "Maria".
• Com final: Se você declarar final String nome = "João";, tentar fazer nome = "Maria"; vai gerar um erro de compilação.

Java tem escopo em relação à variável?
Sim, Java tem escopo de bloco e de classe para definir onde uma variável pode ser acessada.

O escopo determina a visibilidade e o tempo de vida de uma variável no código. Os principais tipos de escopo em Java são:
• Escopo de Bloco (Local): Variáveis criadas dentro de um par de chaves { } (como em um if, for ou dentro de um método) só existem ali. Elas morrem quando o bloco termina.
• Escopo de Método (Parâmetros): Parâmetros recebidos por um método funcionam como variáveis locais e só podem ser usados dentro daquele método.
• Escopo de Instância (Atributos): Variáveis declaradas diretamente na classe (fora de qualquer método) pertencem aos objetos criados a partir dessa classe. Elas podem ser acessadas por qualquer método da classe.
• Escopo de Classe (static): Variáveis compartilhadas por todas as instâncias da classe, também declaradas diretamente na classe mas com a palavra-chave static.

### Referências:
- https://www.alura.com.br/conteudo/praticando-java-variaveis-tipos?srsltid=AU7gw4VaQ_SUB_cVGLUSlh8ebBYcwqJMs5RvLnbj9MY9-TXyMEyBkdl
- https://imasters.com.br/back-end/imutabilidade-de-strings-em-java

### Curiosidades: 

- no Java, as strings são imutáveis, ou seja, não podem ser alteradas após criadas.
- outros metodos de strings são: indexOf(), lastIndexOf(), substring(), replace(), split(), trim(), toCharArray(), toLowerCase(), toUpperCase(), valueOf(), and charAt().
- Operadores de comparação são o >, o <, o >=, o <=, o ==, o !=, o &&, o ||, e o !.
- Operadores de concatenação são o +, o +=, o +, o ++, o +=, e o +++.
- Comentários são comentados com o caractere "//". 
- comentario em bloco são comentados com o caractere "/*" e o caractere "*/".


### Resoluções:

[Resolucao 1](https://github.com/raffashefc/elasTech/master/src/semana01_string/Ex01.java)

[Resolucao 2](https://github.com/raffashefc/elasTech/master/src/semana01_string/Ex02.java)

[Resolucao 3](https://github.com/raffashefc/elasTech/master/src/semana01_string/Ex03.java)

[Resolucao 4](https://github.com/raffashefc/elasTech/master/src/semana01_string/Ex04.java)

[Resolucao 5](https://github.com/raffashefc/elasTech/master/src/semana01_string/Ex05.java)

