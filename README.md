# Sudoku 9x9 Challenge

Este repositório serve única e exclusivamente como base para o Sudoku Challenge que será realizado dia 27/11 na Uniguaçu. Abaixo algumas informações sobre a realização do desafio.

## Requisitos:

1. Possuir conhecimentos básicos de lógica de programação e programar em JAVA;
2. Possuir conta no GitHub e dar push do código em repositório público durante o desafio;
3. Não trocar ideias com os colegas nos primeiros 30 minutos de desafio;
4. Não usar IA, ou pesquisas na internet de maneira geral, na primeira 1h do desafio.

## Desafio

O desafio será avaliado em 2 partes, porém ainda dentro das 1h30 máxima propostas para sua aplicação. Os critérios de avalição são os mesmo para as duas partes:

1. Funcional: funcionou ou não?
2. Qualidade: examinadores avaliarão o código e darão uma nota;
3. Tempo: quanto menos tempo maior a nota.

As duas partes são:

### 1ª Parte - Validador

Programar, em JAVA, um programa que valide se uma solução de uma jogada de Sudoku é correta ou não. Para isso será fornecido uma classe que conterá, ao menos, 3 exemplos de solução de Sudoku, onde somente 2 estarão corretas.
> As notas dadas para cada critério SOMARAM à nota final.

### 2ª Parte - Solucionador

Alterar e evoluir o programa do 1º Passo para também solucionar uma jogada de Sudoku, e claro, utilizar a validação já implementada para validar se a solução estará correta ou não. Para isso será fornecido uma classe que conterá, ao menos, 3 jogos incompletos de Sudoku em diferentes níveis. Cabe ao programa preencher o jogo com uma solução válida.
> As notas dadas para cada critério MULTIPLICARÃO a nota da 1ª Parte

### Classe SudokuSource

Classe mencionada acima que conterá:

`SudokuSource::getSolvedMatrix(...)` Retorna uma matrix já preenchida/solucionada. Ela deve ser usada no VALIDADOR. Há 3 diferentes matrizes, 2 estão corretas e 1 incorreta.

`SudokuSource::getUnsolvedMatrix(...)` Retorna uma matrix com números faltantes. Ela deve ser usada no SOLUCIONADOR. Há 3 diferentes níveis de matrix, da mais fácil à mais dificil.

## Regras durante o desafio

1. Enquanto programam, os participantes devem commitar o código em repositório público com o nome de sua escolha;
2. Ao terminar o 1º Passo, solicitar avaliação ao examinador para, depois disso, prosseguir ao 2º Passo a depender do resultado da avaliação;
4. Em caso de avaliação negativa, o participante poderá seguir ao 2º Passo por sua conta em risco.
5. O participante pode arrumar o seu código do 1º Passo no 2º Passo, mas deve ser comunicado ao examinador para reavaliar;
6. Ao finalizar o desafio o participante deverá commitar o código com a mensagem "finished". A data do ultimo commit com essa mesma mensagem será a utilizada para calcular o tempo usado no desafio pelo participante.

## FAQ:

1. Ao solicitar a primeira avaliação ao examinador, o participante deverá compartilhar o repositório do GitHub, privativamente com o examinador (usar qrcode);
2. Será possível avaliar mais de uma vez o mesmo participante, mas a prioridade do examinador sempre será com quem ainda não solicitou avaliação;
3. O participante poderá seguir para o 2º Passo sem solicitar a avaliação do examinador, porém, será por sua conta em risco, pois não haverá avaliações intermediárias e será levado em conta o maior tempo para o 2º Passo;
4. Dúvidas e perguntas durante o desafio devem ser feitas em voz alta para todos os envolvidos ouvirem, já que a dúvida de um pode ser a mesma de outro participante;
