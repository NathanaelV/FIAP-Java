# Lista de Exercícios - Linguagem Java (Original é C#)

## Nível 1: Entrada, Processamento e Saída

1.  Faça um programa para calcular o estoque médio de uma peça, sendo que: <br>
    $ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2$.

<br>

2.  Faça um programa que:
    - Leia a cotação do dólar
    - Leia um valor em dólares
    - Converta esse valor para Real
    - Mostre o resultado

<br>

3.  Faça um programa para pagamento de comissão de vendedores de peças,levando-se em consideração que sua comissão <br> 
    será de 5% do total da venda e que você tem os seguintes dados:
    - Identificação do vendedor
    - Código da peça
    - Preço unitário da peça
    - Quantidade vendida

<br>

4.  Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os <br>
    valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as <br>
    variáveis A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, <br>
    B com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo, devem <br>
    ser realizadas doze operações de processamento, sendo seis para as adições e seis para as multiplicações.

<br>

5.  Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz <br>
    12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. <br>
    Desta forma, será possível obter a distância percorrida com a fórmula $DISTANCIA = TEMPO * VELOCIDADE$. <br>
    Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a <br>
    fórmula: $LITROS_USADOS = DISTANCIA / 12$. O programa deve apresentar os valores da velocidade média, <br>
    tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.

<br>

6.  Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de <br>
    temperatura a ser utilizada é $F = (9 * C + 160) / 5$, em que a variável F representa é a temperatura em graus <br>
    Fahrenheit e a variável C representa é a temperatura em graus Celsius.

<br>

7.  Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de <br>
 	temperatura a ser utilizada é $C = (F - 32) * 5 / 9$, em que a variável F é a temperatura em graus Fahrenheit <br>
    e a variável C é a temperatura em graus Celsius.

<br>

8.  Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: <br>
	$V = 3.14159 * R * R * A$ <br>
	Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.

<br>

9.  Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa <br>
    pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

10. Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes <br>
    entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.

<br>

## Nível 2: Estruturas Condicionais

11. Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a <br>
    possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados. 

<br>

12. Escreva um programa que leia um número inteiro e exiba o seu módulo.
    O módulo de um número **x** é:
    **x** se x é maior ou igual a zero
    $x * (-1)$ se x é menor que zero

<br>

13. Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente.

<br>

14. Escreva um programa que leia dois números e apresente a diferença do maior para o menor

<br>

15. Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi <br>
    aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar <br>
    a nota do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7, <br>
    apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado, <br>
    apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do aluno. <br>

<br>

16. Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do <br>
    menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.

<br>

17. Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa <br>
    entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”. <br>
    Caso contrário, apresentar a mensagem “valor inválido”.

<br>

18. Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código é igual a 1, igual a 2 ou <br>
igual a 3. Caso não seja, apresentar a mensagem “Código inválido”. Ao ser verificado o código e constatado que é <br>
um valor válido, o programa deve verificar cada código em separado para determinar seu valor por extenso, ou seja, <br>
apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).

<br>

19. Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada <br>
    lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é <br>
    eqüilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso <br>
    contrário, o triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a <br>
    ocorrência.

<br>

20. Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero para <br>
    cada variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor valor lido <br>
    multiplicado pelo maior e o maior valor dividido pelo menor.

<br>

21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é positivo <br>
    ou negativo. Pare a execução do programa quando o usuário requisitar.

<br>

22) Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o
    resultado.

<br>

## Nível 3: Estrutura de Seleção

23. Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: <br>
    1 – Adição <br>
    2 – Subtração <br>
    3 – Multiplicação <br>
    4 – Divisão

<br>

24. Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja <br>
    realizar: <br>
    1 – Verificar se um dos números lidos é ou não múltiplo do outro <br>
    2 – Verificar se os dois números lidos são pares <br>
    3 – Verificar se a média dos dois números é maior ou igual a 7. <br>
    4 – Sair

<br>

25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal, <br>
    utilizando as seguintes fórmulas: $(h = altura)$
    - Para homens: $(72.7*h) - 58$
    - Para mulheres: $(62.1 *h) - 44.7$ 

<br>

## Nível 4: Estruturas de Repetição

26. Escreva um programa que exiba os números de 1 a 100 na tela em ordem decrescente. <br>

<br>

27) Escreva um programa que leia: <br>
    - a quantidade de números que deverá processar; <br>
    - os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu fatorial. <br>

    *Lembrete: O fatorial de um número N é dado pela fórmula: $N! = 1 * 2 * 3 * 4 * 5 * ... * N$*

<br>

28) Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200.

<br>

29) Faça um programa que exiba os números de 1 até 2000.

<br>

30) Faça um programa para imprimir uma tabuada.

<br>

31) Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou ímpar. Exiba <br>
    ao final a soma total dos números pares lidos e também a soma dos números ímpares lidos. Suporemos que o <br>
    número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o <br>
    fim dos dados.

<br>

32) Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros números inteiros positivos <br>
    ímpares a partir do número informado pelo usuário menor que 10 e maior que zero.

<br>

33) Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova. O número de <br>
    alunos é desconhecido. Os dados de um aluno são: número de matrícula e a sua nota na prova em questão.

<br>

34) Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior. Suporemos que o <br>
    número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o <br>
    fim dos dados.

<br>

35) Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: "Múltiplo de 10". 

<br>

36) Faça um programa que leia 10 valores inteiros e positivos e: <br>
    - Encontre o maior valor <br>
    - Encontre o menor valor <br>
    - Calcule a média dos números lidos 

37. Faça um programa de conversão de base numérica. O programa deverá apresentar uma tela de entrada com as <br>
    seguintes opções: <br>

    1 – Adição <br>
    2 – Subtração <br>
    3 – Multiplicação <br>
    4 – Divisão <br>

    Informe a opção: <br>
    A partir da opção escolhida, o programa deverá solicitar para que o usuário digite dois números. Em seguida, o <br>
    programa deve exibir o resultado da opção indicada pelo usuário e perguntar ao usuário se ele deseja voltar ao <br>
    menu principal. Caso a resposta seja ´S´ ou ´s´, deverá voltar ao menu, caso contrário deverá encerrar o <br>
    programa.

<br>

38) Faça um programa que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um <br>
    operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a <br>
    50, calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora <br>
    excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente. O <br>
    programa só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o <br>
    programa?".

<br>

39) Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, <br>
    e se é positivo ou negativo. O programa só deve parar de rodar quando o usuário responder "S" na seguinte <br>
    pergunta, "Deseja encerrar o programa?".

<br>

40) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que são <br>
    altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe <br>
    para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as <br>
    industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos <br>
    devem ser notificados a paralisarem suas atividades. Faça um programa que leia o índice de poluição medido e <br>
    emita a notificação adequada aos diferentes grupos de empresas. O algoritmo só deve parar de rodar quando o <br>
    usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?".

<br>

41) Faça um programa que dada a idade de um nadador, classifique-o em uma das seguintes categorias: <br>
    - Infantil A = 5 a 7 anos <br>
    - Infantil B = 8 a 11 anos <br>
    - Juvenil A = 12 a 13 anos <br>
    - Juvenil B = 14 a 17 anos <br>
    - Adultos = Maiores de 18 anos

<br>

42) Faça um programa que determine o maior e o menor entre N números lidos. A condição de parada é a entrada de <br>
    um valor 0, ou seja, o programa deve ficar executando até que a entrada seja igual a 0 (ZERO).

<br>

43) Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando <br>
    de alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em um <br>
    tabuleiro de xadrez, de tal forma que o primeiro quadro deveria conter apenas um grão e os quadros <br>
    subseqüentes, o dobro do quadro anterior. A rainha achou o trabalho barato e pediu que o serviço fosse <br>
    executado, sem se dar conta de que seria impossível efetuar o pagamento. Faça um programa para calcular o <br>
    número de grãos que o monge esperava receber.

<br>

44) Faça um programa que exiba as opções: <br>

    1 – Conversão de Graus Celsius em Graus Fahrenheit <br>
    2 – Conversão de Graus Fahrenheit em Graus Celsius <br>
    3 – Peso ideal do homem <br>
    4 – Peso ideal da mulher <br>

    O programa só deve encerrar quando o usuário digitar ´S´ para a pergunta “Deseja encerrar o programa?” <br>
    *Obs.: Nas opções 3 e 4 informar se o usuário está acima ou abaixo do peso ideal.*

<br>

45)  Dada uma seqüência de n números (vetor de inteiros), imprimi-la na ordem inversa que foi realizada a leitura.

<br>

46) Dados dois vetores *x* e *y*, ambos com n elementos, determinar o produto escalar desses vetores. Ou seja, realizar <br>
    a soma de todos dos resultados da multiplicação de x[i] por y[i].

<br>

47) Considere um vetor de 10 números inteiros positivos maiores que zero e um único número inteiro, também positivo <br>
    e maior que zero. Faça um programa para: <br>

    a. ler pelo teclado o vetor; <br>
    b. ler pelo teclado o número X; <br>
    c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.

<br>

48) Uma agência de publicidade pediu à agência de modelos Luz & Beleza para encontrar uma modelo que tenha <br>
    idade entre 18 e 20 anos para participar de uma campanha publicitária milionária de produtos de beleza. Foram <br>
    inscritas 20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações foram armazenadas em <br>
    2 vetores distintos. Faça um programa para imprima o vetor que contém os nomes das candidatas aptas a <br>
    concorrer a uma vaga para a campanha milionária.

<br>

49) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes <br>
    que V1 e V2 possuem valores idênticos nas mesmas posições.

<br>

50) Fazer um programa que sorteie um número de 0 a 100 e que permita que o usuário (sem conhecer o número <br>
    sorteado) tente acertar. Caso não acerte, o programa deve imprimir uma mensagem informando se o número <br>
    sorteado é maior ou menor que a tentativa feita. Ao acertar o número, o programa deve imprimir a quantidade de <br>
    tentativas feitas.

<br>

51) Fazer um programa para ler uma quantidade N de alunos. Ler a nota de cada um dos N alunos e calcular a média <br>
    aritmética das notas. Contar quantos alunos estão com a nota acima de 7.0. Obs.: Se nenhum aluno tirou nota <br>
    acima de 5.0, imprimir mensagem: Não há nenhum aluno com nota acima de 5.

<br>

52) Fazer um programa ler um vetor de inteiros e positivos e imprimir quantas vezes aparece o número 1, 3 e 4, nesta <br>
    ordem. O vetor terá no máximo 100 posições. Sair do programa quando for digitado -1.

<br>

53) Durante uma corrida de automóveis com N voltas de duração foram anotados para um piloto, na ordem, os <br>
    tempos registrados em cada volta. Fazer um programa para ler os tempos das N voltas, calcular e imprimir: <br>

    i. melhor tempo; <br>
    ii. a volta em que o melhor tempo ocorreu; <br>
    iii. tempo médio das N voltas;

<br>

54) Dado dois vetores, A (5 elementos) e B (8 elementos), faça um programa em C que imprima todos os elementos <br>
    comuns aos dois vetores.

<br>

55) Fazer um programa que leia uma frase de até 50 caracteres e imprima a frase sem os espaços em branco. <br>
    Imprimir também a quantidade de espaços em branco da frase.

<br>

56) Fazer um programa para ler um vetor de inteiros positivos de 50 posições. Imprimir a quantidade de números <br>
    pares e de múltiplos de 5.

<br>

57) Fazer um programa que leia uma frase e imprima somente as vogais. <br>
58) Fazer um programa para armazenar em um vetor, vários números inteiros e positivos e calcular a média. Imprimir <br>
    também o maior. A quantidade de números lidos será definida pelo usuário.

<br>

59) Escreva um programa que solicite dois caracteres de A a Z ao usuário e imprima o número de caracteres existente <br>
    entre eles. Assuma que o usuário digite os 2 caracteres em ordem alfabética. Caso não o estejam, emitir <br>
    mensagem de erro. <br>
    Exemplo: Digite 2 caracteres: j t O numero de caracteres entre eles é: 9 

<br>

## Nível 6: Métodos

60) Escreva um programa que retorne o número do quadrante (1,2,3 ou 4) através de um método chamado <br>
    VERIFICA_QUADRANTE, que deve receber um valor para x e um valor para y. <br>
    Quadrantes:<br>
    
    ```
             x |
               |
         2o    |     1o
               |
    y ----------------------
               |
               |
         3o    |     4o
               |
    ```

61) Escreva um programa que calcule e retorne o salário atualizado através do método REAJUSTE. O método deve <br>
    receber o valor do salário e o índice de reajuste.

<br>

62) Escreva um programa que calcule e retorne o valor da hipotenusa através do método HIPOTENUSA. O método <br>
    recebe o valor da base e da altura de um triângulo.

    Fórmulas: $hipotenusa² = base² + altura²$

    $área = (base . altura) / 2$

    ```
             base x altura
    área = -----------------
                  2
    ```

63) Escreva um programa que verifique se um número é par ou ímpar através de um método chamado VERIFICA. O <br>
    método deverá receber um número inteiro (n) e deverá retornar a mensagem **“PAR”** ou **“ÍMPAR”**.

<br>

64) Escreva um programa que deverá ter as seguintes opções: <br>
    1 - Carregar Vetor <br>
    2 - Listar Vetor <br>
    3 - Exibir apenas os números pares do vetor <br>
    4 - Exibir apenas os números ímpares do vetor <br>
    5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor <br>
    6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor <br>
    7 - Sair <br>

    Deverá ser implementado um método para realizar cada uma das opções de 1 a 6.
