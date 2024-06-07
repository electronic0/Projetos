from random import choice
from time import sleep
print('Bora pedra, papel e tesoura?')
t = 0
while True:
    t += 1
    e = choice(['pedra', 'papel', 'tesoura'])
    i = str(input('Qual é sua escolha? [Pedra/Papel/Tesoura]: ')).lower().strip()
    print('JO')
    sleep(1)
    print('KEN')
    sleep(1)
    print('PO!')
    if i == 'pedra' and e == 'tesoura' or i == 'papel' and e == 'pedra' or i == 'tesoura' and e == 'papel':
        break
    elif e == 'pedra' and i == 'tesoura' or e == 'papel' and i == 'pedra' or e == 'tesoura' and i == 'papel':
        print(f'Perdeu! Eu escolhi {e}. Vamo denovo? ')
    else:
        print('Empate! Vamo denovo.')
print(f'Parebens! Você ganhou de min na {t}° tentativa. Eu escolhi {e}.')