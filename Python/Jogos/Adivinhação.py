from random import randint
t = 0
while True:
    t += 1
    c = randint(1, 10)
    v = int(input('Eu escolhi um número entre 1 a 10. Qual número eu escolhi? '))
    if v == c:
        break
    else:
        print(f'Errou! Eu escolhi o número {c}. Tente de novo')
print(f'Você ganhou! Você venceu de min na {t}° tentativa. O número que eu escolhi foi {c}')