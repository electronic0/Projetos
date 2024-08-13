from random import choice
from time import sleep

while True:
    escolha = ['pedra', 'papel', 'tesoura']
    computador = choice(escolha)
    jogador = None
    while jogador not in escolha:
        jogador = str(input('Pedra, Papel ou Tesoura? ')).lower().strip()
    sleep(1)
    print('JO', end = ' ')
    sleep(1)
    print('KEN', end = ' ')
    sleep(1)
    print('PO!')
    print(f'Computador: {computador.capitalize()}')
    print(f'Jogador: {jogador.capitalize()}')
    sleep(1)
    if jogador == 'pedra' and computador == 'tesoura' or jogador == 'papel' and computador == 'pedra' or jogador == 'tesoura' and computador == 'papel':
        print('Você ganhou!')
    elif computador == 'pedra' and jogador == 'tesoura' or computador == 'papel' and jogador == 'pedra' or computador == 'tesoura' and jogador == 'papel':
        print('Você perdeu!')
    else:
        print('Empate!')
    continuação = str(input('Deseja continuar? [S/N]: ')).lower().strip()[0]
    if continuação == 'n':
        break
print('Volte sempre!')