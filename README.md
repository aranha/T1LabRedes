# T1 LabRedes

O trabalho tem como objetivo desenvolver um protocolo de aplicação que
trabalhará em cima de UDP. Tal protocolo de aplicação deverá implementar um
jogo multiplayer estilo MUD (“Multi-user Dungeon”).
Jogos deste tipo criam um mundo virtual multiplayer baseado em texto.
Este mundo virtual deve ser composto de salas que se interligam, sendo que os
jogadores podem se mover de uma sala para outra. Além disso, os jogadores
podem ler ou visualizar descrições das salas, objetos, outros jogadores,
personagens e ações realizadas no mundo virtual. Os jogadores normalmente
interagem com o mundo virtual digitando comandos que se assemelham a uma
linguagem natural.
Para o desenvolvimento do jogo, será necessário usar a imaginação e criar
uma história para que os jogadores tenham um objetivo no jogo. O jogo deve
terminar quando este objetivo for atingido.
O jogo deve possuir as seguintes características:
 seguir o modelo cliente-servidor;
 implementar um servidor que contenha toda a lógica do jogo;
 implementar um cliente que permita especificar o endereço do servidor;
 suportar até 2 jogadores simultâneos;
 permitir que o jogador informe sua identificação (equivalente a um login,
que deve ser única para cada jogador conectado);
 possuir no mínimo 5 salas e suportar a lista de comandos e objetos citados
a seguir.
Comandos
 Examinar [sala/objeto]
o Retorna a descrição da sala atual (sala) ou objeto mencionado.
o A descrição da sala também deve listar as salas adjacentes e suas
respectivas direções, objetos e demais jogadores presentes no
local.
 Mover [N/S/L/O]
o O jogador deve mover-se para a direção indicada (norte, sul, leste
ou oeste).
o Ao entrar numa nova sala, o jogo deve executar automaticamente
o comando “examinar sala”, que descreve o novo ambiente ao
jogador.
 Pegar [objeto]
o O jogador coleta um objeto que está na sala atual.
o Alguns objetos não podem ser coletados, como no caso de “porta”.
 Largar [objeto]
o O jogador larga um objeto que está no seu inventório, na sala atual.
 Inventório
o O jogo lista todos os objetos carregados atualmente pelo jogador.
 Usar [objeto] {alvo}
o O jogador usa o objeto mencionado;
o Em alguns casos específicos, o objeto indicado necessitará de outro
(alvo) para ser ativado (ex: usar chave porta).
 Falar [texto]
o O jogador envia um texto que será retransmitido para todos os
jogadores presentes na sala atual. 
 Cochichar [texto] [jogador]
o O jogador envia uma mensagem de texto apenas para o jogador
especificado, se ambos estiverem na mesma sala.
 Ajuda
o Lista todos os comandos possíveis do jogo.
Feedback dos Comandos
Todos os comandos devem retornar “mensagens de sucesso ou de erro”
quando forem executados:
 as mensagens de sucesso devem ser transmitidas para todos os jogadores
da sala, além do próprio que fez a ação. Por exemplo, quando um jogador
larga um objeto, o jogo deve responder com “objeto X foi largado pelo
jogador Y”, ou quando alguém se move, “jogador X moveu-se para o sul”;
 nos casos de erro, apenas o jogador que executou a ordem deve receber
uma mensagem, como por exemplo, “não é possível mover-se para o
norte” ou “objeto X não existe”.
Objetos
O jogo deve ter no mínimo os seguintes objetos:
 Porta
o item não coletável que necessita de uma chave para ser aberta;
o “Examinar porta” retorna se a mesma encontra-se aberta ou
fechada;
o ao tentar mover-se na direção onde a porta está posicionada, o
jogador poderá prosseguir apenas se ela estiver aberta.
 Chave
o item coletável que pode ser utilizado em uma ou mais portas.
 Mapa
 ao utilizá-lo, o jogo desenha em “ASCII art” o mapa do jogo, indicando em
qual sala o jogador se encontra.
Protocolo de Aplicação
O jogo deve ser implementado em qualquer linguagem e deve usar socket
UDP.
Primeiramente, será necessário definir um protocolo de aplicação, onde
serão especificados todos os tipos de mensagens necessárias, bem como todas as
trocas de mensagens entre cliente e servidor. Estas especificações devem estar
contidas em um relatório que explicará todo o funcionamento do jogo e como a
implementação foi realizada.
Resultados e Entrega
Grupos: Até 3 componentes.
Entrega: Upload no Moodle de um arquivo zipado com o nome do(s) aluno(s),
contendo:
1. Relatório descrevendo a implementação
2. Código da implementação
Prazo final para entrega: 23/09/2019
IMPORTANTE: Não serão aceitos trabalhos entregues fora do prazo. Trabalhos
que não compilam ou que não executam não serão avaliados. Todos os trabalhos
serão analisados e comparados. Caso seja identificada cópia de trabalhos, todos
os trabalhos envolvidos receberão nota ZERO.
Exemplos e Informações sobre MUD:
http://www.mudconnect.com/top10.html
http://en.wikipedia.org/wiki/MUD
